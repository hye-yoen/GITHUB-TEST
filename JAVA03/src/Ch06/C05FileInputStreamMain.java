package Ch06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05FileInputStreamMain {
	public static void main(String[] args) throws IOException{
		InputStream fin = new FileInputStream("c:\\IOTEST\\test.pdf");
		
		long startTime = System.currentTimeMillis();
		StringBuffer stringbuffer = new StringBuffer();
		byte[] buff = new byte[10000];
		//read
		while(true) {
			int data = fin.read(buff);
			if(data == -1) 
				break;
//			System.out.print(data);
			stringbuffer.append((char)data);
			
		}
		System.out.println("총길이 : "+stringbuffer.length());
		fin.close();
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+ (endTime-startTime)+"ms");
	}
}
