package Ch07;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C01CharConvertStreamMain {

	public static void main(String[] args) throws Exception{
//		String str = "문자 변환 스트림 사용!!";
//		
//		OutputStream out = new FileOutputStream("c:\\IOTEST\\test.txt");
//		OutputStreamWriter wout = new OutputStreamWriter(out); //1byte -> 2byte(char,문자화) 
//		BufferedWriter bout = new BufferedWriter(wout); //버퍼공간
//		
//	
//		bout.write(str);
//		bout.flush();
//		bout.close();
		
		InputStream in = new FileInputStream("c:\\IOTEST\\test.txt");
		BufferedInputStream bin =  new BufferedInputStream(in);
		InputStreamReader rin = new InputStreamReader(bin);
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			System.out.print((char)data);
			
		}
		
		
	}
}