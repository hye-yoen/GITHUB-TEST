package Ch07; //클래스 자료형 -> 파일전달

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

class Board implements Serializable{ //직렬처리 (직렬(Serializable)인터베이스)
	//object ==> byte
	
	private static final long serialVersionUID = 1L; //직렬화 처리 버전업 구별 객체
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	public Board(int bno, String title, String content, String writer, Date date) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", date="
				+ date + "]";
	}
	
	//All Args Constructor
	//Getter and Setter
	//toString
	
	
}

public class C04ObjectStreamMain {
	
	
	public static void main(String[] args) throws Exception{
		
//		FileOutputStream out = new FileOutputStream("c:\\IOTEST\\board.db");
//		ObjectOutputStream oout = new ObjectOutputStream(out);  //object 단위 저장 
//		oout.writeObject(new Board(1,"제목1","하2","홍길동",new Date()));; //객체 -> byte -> write(출력)
//		oout.writeObject(new Board(2,"제목2","하3","남길동",new Date()));;
//		oout.flush();
//		oout.close();
//		out.close();
		
		//
		FileInputStream in = new FileInputStream("c:\\IOTEST\\board.db");
		ObjectInputStream oin = new ObjectInputStream(in); //object 클래스 

 		Object obj =  oin.readObject(); //다운캐스팅
		Board down = (Board)obj;
		System.out.println(down);
 		
		Object obj2 =  oin.readObject();
		Board down2 = (Board)obj2;
		System.out.println(down2);
//		//더이상 읽을것이 없으면 java.io.EOFException 발생 
 		Object obj3 =  oin.readObject();
		Board down3 = (Board)obj3;
		System.out.println(down3);

	}

}