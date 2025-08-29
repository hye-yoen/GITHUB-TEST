package Ch06;

import java.io.Reader;
import java.io.IOException;
import java.io.FileReader;

public class C04BufferAddMain {
	public static void main(String[] args) throws IOException{
		Reader fin =new FileReader("c:\\IOTEST\\origin.txt");
		//1byte 기반 텍스트 파일만 가능 
		long startTime = System.currentTimeMillis();
		
		StringBuffer strBuffer = new StringBuffer();//내부버퍼 생성
		char [] buff = new char[200]; //origin.txt의 크기보다 더 커야 함
		
		
		while(true) {
			int data = fin.read(buff,0, buff.length);
			if(data == -1) 
				break;
			strBuffer.append((char)data);
		}
		System.out.println("총길이 : " + strBuffer.length());
		fin.close();
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+ (endTime-startTime)+"ms");
	
	
	}
}
