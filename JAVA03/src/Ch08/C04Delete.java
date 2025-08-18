package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C04Delete {	
	public static void main(String[] args) {
		
		String id = "root";
		String pw = "1234";
		String url= "jdbc:mysql://localhost:3306/opendatadb";
		
		Connection conn = null;				//DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null; 	//SQL Query 정송용 객체
		ResultSet rs = null;				//Select 결과를 담을 객체
		
		//연결 작업
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNEXTED...");
			
			//sql query 객체 생성
//			pstmt = conn.prepareStatement("update tbl_a set name=? where no=?"); //SQL 문
			pstmt = conn.prepareStatement("delete from tbl_a where no=?"); //SQL 문 
			pstmt.setInt(1, Integer.parseInt(args[1])); 
			//spl dbms 로 전달
			int result = pstmt.executeUpdate();
			//결과값으로 java에서 처리
			if (result>0) System.out.println("INSERT 성공");
			else System.out.println("INSERT 실패");
			
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외 발생!");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생");
		}finally {
			try{conn.close();} catch(SQLException e ) {e.printStackTrace();}
		}
	}
	
}
