package Ch06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {
	public static void main(String[] args) throws IOException{
//		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt",false);//덮어쓰기
		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt",true);//추가하기
		fout.write("TEST1\n");
		fout.write("TEST2\n");
		fout.write("TEST3\n");
		
		fout.flush(); //outstream에서 flush를 줘서 버퍼공간 초기화
		fout.close();
		
	}
}
