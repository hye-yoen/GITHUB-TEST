package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C01Dbconn {	
	public static void main(String[] args) {
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url= "jdbc:mysql://localhost:3306/opendatadb";
		//JDBC참조변수
		Connection conn = null;				//DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null; 	//SQL Query 전송용 객체
		ResultSet rs = null;				//Select 결과를 담을 객체
		
		//연결 작업
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이버 로딩
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw); //connect
			System.out.println("DB CONNEXTED...");
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외 발생!");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생");
		}finally {
			try{conn.close();} catch(SQLException e ) {e.printStackTrace();}
		}
	}
	
}
