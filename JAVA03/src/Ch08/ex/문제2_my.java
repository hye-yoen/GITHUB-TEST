package Ch08.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class 문제2_my {
	// DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/opendatadb";

	// JDBC참조변수
	private static Connection conn = null; // DBMS 의 특정 DB와 연결되는 객체
	private static PreparedStatement pstmt = null; // SQL Query 전송용 객체
	private static ResultSet rs = null; // Select 결과물 담을 객체

	public static void conn() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url,id,pw); //커넥션 개체 생성
		System.out.println("DB CONNECTED...");
		
	}

	public static List<BookDto> selectAll() throws SQLException {
		pstmt = conn.prepareStatement("SELECT * FROM tbl_book"); //SQL 문 opendata안에 있으므로 생략가능 , ; 빼삼
		
		//sql resultset? 걍 selct에 적인 거 == resultset
		rs = pstmt.executeQuery();
		
		List<BookDto> list = new ArrayList(); //새로운 배열을 list의 bookDto타입으로 변환
		BookDto dto = null; //참조변수
		if(rs!=null) {
			while(rs.next()) { //걍 입력받은 값이 있는 동안?????
				dto = new BookDto();
				dto.setBookCode(rs.getLong("bookCode"));
				dto.setBookname(rs.getString("bookname"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setIsbn(rs.getString("isbn"));
				list.add(dto);
//				System.out.print(rs.getInt("bookCode")+"."); // bookCode의 cal의 값을 가져옴
//				System.out.print(rs.getString("bookname")+"."); // bookname의 cal의 값을 가져옴
//				System.out.print(rs.getString("publisher")+"."); // publisher의 cal의 값을 가져옴
//				System.out.println(rs.getString("isbn")); //현재 커서의 위치의 name의 cal의 값을 가져옴
			}
		}
		
		return list;
	}

	public static BookDto select(Long bookCode) throws SQLException {
		pstmt = conn.prepareStatement("SELECT * FROM tbl_book where bookCode =?");//?해당하는 값을 찍어줌 //단건조회
		pstmt.setLong(1, bookCode);
		rs = pstmt.executeQuery();
		
		List<BookDto> list = new ArrayList();
		BookDto dto = null;
		if(rs!=null) {
		rs.next();
			dto = new BookDto();
			dto.setBookCode(rs.getLong("bookCode"));
			dto.setBookname(rs.getString("bookname"));
			dto.setPublisher(rs.getString("publisher"));
			dto.setIsbn(rs.getString("isbn"));

		}
		return null;
	}
			
			

	public static int insertBook(BookDto bookDto) throws SQLException { //bookDto전달
		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");		
		pstmt.setLong(1, bookDto.getBookCode());
		pstmt.setString(2, bookDto.getBookname());
		pstmt.setString(3,  bookDto.getPublisher());
		pstmt.setString(4, bookDto.getIsbn());
		
		//sql를 dbms 로 전달
		int result = pstmt.executeUpdate();
		
		return result;
	}

	public static int updateBook(BookDto bookDto) throws SQLException {
	pstmt = conn.prepareStatement("insert tbl_book set bookName=?,publisher=?,isbn=? where bookCode=?");		
	pstmt.setString(1, bookDto.getBookname());
	pstmt.setString(2, bookDto.getPublisher());
	pstmt.setString(3,  bookDto.getIsbn());
	pstmt.setLong(4, bookDto.getBookCode());
	
	//sql를 dbms 로 전달
	int result = pstmt.executeUpdate();
	
	return result;
	
	}

	public static int deleteBook(BookDto bookDto) throws SQLException {
		
		pstmt = conn.prepareStatement("delete form tbl_book where bookCode=?");		
		pstmt.setLong(1, bookDto.getBookCode());

		//sql를 dbms 로 전달
		int result = pstmt.executeUpdate();
		
		return result;
	}

	public static void main(String[] args) {
		try {
			// DBCONN
			conn();
			
			//TX START
			conn.setAutoCommit(false);
			// INSERT
//			insertBook(new BookDto(1L, "도서명1", "출판사명1", "isbn-1")); //위치조값을 전달
//			insertBook(new BookDto(2L, "도서명1", "출판사명1", "isbn-1"));
//			insertBook(new BookDto(3L, "도서명1", "출판사명1", "isbn-1"));
//			insertBook(new BookDto(4L, "도서명1", "출판사명1", "isbn-1"));
			
//			// SELECTALL //저장조회
//			List<BookDto> allBook = selectAll();
//			System.out.println("SelectAll : ");
//			allBook.forEach(System.out::println);
//	
//			// SELECT
			BookDto dto = select(1L);
			System.out.println("select : " + dto);
//			
//			// UPDATE
//			dto.setBookname("수정도서명-2");
//			dto.setPublisher("수정출판사명-2");
//			int r1 = updateBook(dto);
//			if (r1 > 0)
//				System.out.println("수정완료 : " + r1);
//
//			// DELETE
//			int r2 = deleteBook(dto);
//			if (r2 > 0)
//				System.out.println("삭제완료 : " + r2);

			//TX END
			conn.commit();
			
		} catch (Exception e) {
			//TX ROLLBACKALL
			try {conn.rollback();}catch(Exception e2) {} //문제 생기면 다시 돌림
		}finally {
			//자원제거
			try {rs.close();}catch(Exception e3) {}
			try {pstmt.close();}catch(Exception e3) {}
			try {conn.close();}catch(Exception e3) {}
			
		}

	}

}