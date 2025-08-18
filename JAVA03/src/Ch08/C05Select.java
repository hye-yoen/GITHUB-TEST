package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05Select {	
	public static void main(String[] args) {
		//DB CONN DATA //걍 연결하기 위한 데이터?<2>
		String id = "root";
		String pw = "1234";
		String url= "jdbc:mysql://localhost:3306/opendatadb";
		//JDBC참조변수 <3>
		Connection conn = null;				//DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null; 	//SQL Query 전송용 객체
		ResultSet rs = null;				//Select 결과를 담을 객체
		
		//연결 작업
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이버 로딩<1> 
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw); //Connect!
			System.out.println("DB CONNEXTED...");
			
			//sql query 객체 생성 <4>
			pstmt = conn.prepareStatement("SELECT * FROM tbl_a"); //SQL 문 opendata안에 있으므로 생략가능 , ; 빼삼
			
			//sql resultset? 걍 selct에 적인 거 == resultset
			rs = pstmt.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) { //걍 입력받은 값이 있는 동안?????
					System.out.println(rs.getInt("no")+"."); // no의 cal의 값을 가져옴
					System.out.println(rs.getString("name")); //현재 커서의 위치의 name의 cal의 값을 가져옴
				}
			}
			
			
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외 발생!");
		}catch(SQLException e2) {
//			System.out.println("SQL 예외발생");
			e2.printStackTrace();
		}finally {
			try{rs.close();} catch(SQLException e ) {e.printStackTrace();}
			try{pstmt.close();} catch(SQLException e ) {e.printStackTrace();}
			try{conn.close();} catch(SQLException e ) {e.printStackTrace();}
		}//많이는 안했죠... 오후가 뒤지게 힘들어서 많이하게 느낀것뿐....
	}
	
}
