package Ch06;



import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C09JsoupMain {
	public static void main(String[] args) throws IOException, Exception{
		//URL연결
		Connection conn = 
		Jsoup.connect("https://op.gg/lol/champions") //크롤링할 URL 저장
			 .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36") //브라우저 정보
			 .timeout(5000) //timeout 값
			 .ignoreHttpErrors(true) //에러발생시 예외치리여부
			 .followRedirects(true); 
		
		//DOM 연결
		Document document = conn.get();
//		System.out.println(document);
		Elements elements = document.getElementsByTag("img");
		System.out.println(" 총 img size : "+ elements.size());
		
		for(Element el : elements) {
			System.out.println(el);
			String img_url = el.getElementsByAttribute("src").attr("src");
			System.out.println(img_url);
			
			//끌어온 이미지 데이터
			URL url = (new URI(img_url)).toURL();
			InputStream in = url.openStream();
			//보조스트림 추가
			BufferedInputStream buffIn = new BufferedInputStream(in);
			
			OutputStream out = null;
			if(img_url.contains(".png"))
				out = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".png");
			else if(img_url.contains(".svg"))
				out = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".svg");
			else if(img_url.contains(".webp"))
				out = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".webp");
			else if(img_url.contains(".jpg"))
				out = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".jpg");
			
			while(true) {
				int data = buffIn.read();
				if (data == -1)
					break;
				out.write((byte)data);
				out.flush();
			}
			out.close();
			buffIn.close();
			in.close();
		}
	}
}
