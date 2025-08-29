package Ch06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {
	private static final String PATH="c:\\IOTEST\\";

	public static void main(String[] args) throws Exception {
      // TODO Auto-generated method stub

      
      //args[0] : 원본파일경로(원본파일명)
      //args[1] : 복사대상경로(복사파일명)
      InputStream fin = new FileInputStream(PATH+args[0]);
      OutputStream fout = new FileOutputStream(PATH+args[1]);
      long startTime = System.currentTimeMillis();
      byte[] buff = new byte[4096];
      while(true)
      {   int data = fin.read(buff); //date리턴 , 들어오는 데이터의 바이트 수
          if(data==-1)
               break;
            
          fout.write(buff,0,data); 
          //buff 배열의 0번 인덱스부터 data개 만큼만 출력
          //실제 읽은 데이터 양(data) 만큼만 파일에 씀
          //그냥 buff넣으면 이전에 읽었던 쓰레기 데이터 그대로 파일에 복사됨
          fout.flush();
         
        	}
       fout.close();
       fin.close();
         
       long endTime = System.currentTimeMillis();
       System.out.println("소요시간 : "+ (endTime-startTime)+"ms");
   }

}
