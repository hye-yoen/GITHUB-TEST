package Ch08.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class 문제2 {
	 // DB Connect Data
	   private static String id = "root";
	   private static String pw = "1234";
	   private static String url = "jdbc:mysql://localhost:3306/tmpdb";

	   // JDBC 참조변수
	   private static Connection conn = null;
	   // DBMS 의 특정 DB와 연결되는 객체
	   private static PreparedStatement pstmt = null;
	   // SQL Query 전송용 객체(SQL 문장 미리 준비)
	   private static ResultSet rs = null;
	   // Select 결과물 담을 객체(실행 결과를 담아 한 행씩 불러옴)

	   public static void conn() throws Exception {
	      // 발생 가능한 예외를 호출한 쪽으로 던진 후 아래의 코드를 실행(DB 로딩, 연결)
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      // JDBC 드라이버 로딩
	      // 클래스 경로에서 com.mysql.cj.jdbc.Driver 클래스 파일을 찾아서 불어옴
	      System.out.println("Driver Loading Success...");
	      conn = DriverManager.getConnection(url, id, pw);
	      // Class.forName으로 불러온 드라이버를 사용할 수 있게 등록 후 url과 일치하는 드라이버를 선택해서 DB와 연결
	      System.out.println("DB CONNECTED...");
	   }

	   //
	   public static List<BookDto> selectAll() throws SQLException {
	      // 모든 행을 조회 후 리스트화 하여 BookDto 객체로 반환
	      pstmt = conn.prepareStatement("SELECT * FROM tbl_book");
	      // SQL문을 컴파일 후 실행 준비
	      rs = pstmt.executeQuery();
	      // 준비된 쿼리를 실행
	      List<BookDto> list = new ArrayList();
	      BookDto dto = null;
	      // 행들을 객체로 담기 위해 리스트 생성
	      if (rs != null) {
	         while (rs.next()) {
	            dto = new BookDto();
	            dto.setBookCode(rs.getLong("bookCode"));
	            dto.setBookname(rs.getString("bookName"));
	            dto.setPublisher(rs.getString("publisher"));
	            dto.setIsbn(rs.getString("isbn"));
	            list.add(dto);
	         }
	         // rs의 각 행을 순차적으로 읽고 데이터를 BookDto 객체에 담음
	      }
	      return list;
	      // 모든 행을 담은 list 반환
	   }

	   // 특정 bookCode를 조건으로 하는 책을 조회 후 BookDto 객체로 반환
	   public static BookDto select(Long bookCode) throws SQLException {
	      pstmt = conn.prepareStatement("SELECT * FROM tbl_book where bookCode=?");
	      pstmt.setLong(1, bookCode);
	      // ?에 메서드로 받은 값을 대입 / 문자열을 직접 이어붙이지 않고 안전하게 값 대입(인젝션 방지)
	      rs = pstmt.executeQuery();

	      BookDto dto = null;
	      if (rs != null) {
	         rs.next();
	         dto = new BookDto();
	         dto.setBookCode(rs.getLong("bookCode"));
	         dto.setBookname(rs.getString("bookName"));
	         dto.setPublisher(rs.getString("publisher"));
	         dto.setIsbn(rs.getString("isbn"));

	      }
	      return dto;
	   }

	   //
	   public static int insertBook(BookDto bookDto) throws SQLException {
	      // insertBook 메서드는 전달받은 BookDto의 필드값을 받는다.
	      pstmt = conn.prepareStatement("insert into tbl_book values(?, ?, ?, ?)");
	      // 실행할 SQL문장을 미리 준비한다. ?는 채워질 자리
	      pstmt.setLong(1, bookDto.getBookCode());
	      // 첫번째 ? = insert에 전달받은 BookDto의 BookbookCode
	      pstmt.setString(2, bookDto.getBookname());
	      // 두번째 ? = insert에 전달받은 BookDto의 bookName
	      pstmt.setString(3, bookDto.getPublisher());
	      // 세번째 ? = insert에 전달받은 BookDto의 publisher
	      pstmt.setString(4, bookDto.getIsbn());
	      // 네번쨰 ? = insert에 전달받은 BookDto의 isbn

	      int result = pstmt.executeUpdate();
	      // SQL을 실행하고, 몇 갱의 행이 DB에 영향을 줬는지 숫자로 리턴
	      return result;
	      // 영향받은 행 수를 반환
	   }

	   //
	   public static int updateBook(BookDto bookDto) throws SQLException {
	      pstmt = conn.prepareStatement("update tbl_book set bookName=?, publisher=?, isbn=? where bookCode=?");
	      // bookCode 값에 해당 하는 행들(bookName, publisher, isbn)을 찾아 해당 행의 컬럼 값을 새로운 값으로 변경
	      pstmt.setString(1, bookDto.getBookname());
	      pstmt.setString(2, bookDto.getPublisher());
	      pstmt.setString(3, bookDto.getIsbn());
	      pstmt.setLong(4, bookDto.getBookCode());

	      int result = pstmt.executeUpdate();

	      return result;
	   }

	   public static int deleteBook(BookDto bookDto) throws SQLException {
	      pstmt = conn.prepareStatement("delete from tbl_book where bookCode=?");
	      // bookCode에 해당하는 행 전체를 삭제
	      pstmt.setLong(1, bookDto.getBookCode());

	      int result = pstmt.executeUpdate();
	      return result;
	   }

	   public static void main(String[] args) {
	      try {
	         // DBCONN
	         conn();
	         // DB 연결 메서드를 호출하여 Connection 객체 생성

	         // TX START
	         conn.setAutoCommit(false);
	         // 자동 커밋 끄고 트랜잭션을 수동으로 관리
	         // 여러 작업을 하나의 트랜잭션으로 묶을 수 있음
	         // INSERT
	         insertBook(new BookDto(1L, "도서명1", "출판사명1", "isbn-1"));
	         insertBook(new BookDto(2L, "도서명2", "출판사명2", "isbn-1"));
	         insertBook(new BookDto(3L, "도서명3", "출판사명3", "isbn-1"));
	         // 해당하는 bookCode에 이름, 출판사, isnb 값 삽입
	         // SELECTALL
	         List<BookDto> allBook = selectAll();
	         System.out.println("SelectAll : ");
	         allBook.forEach(System.out::println);
	         // selectAll() 호출 후 테이블 내 모든 데이터(책)를 리스트로 가져와 출력
	         // SELECT
	         BookDto dto = select(2L);
	         System.out.println("select : " + dto);
	         // bookCode가 1인 값만 가져와서 해당 행 출력
	         // UPDATE
	         dto.setBookname("수정도서명-2");
	         dto.setPublisher("수정출판사명-2");
	         // 선택한 dto의 도서명과 출판사 값 수정
	         int r1 = updateBook(dto);
	         // 결과 값 r1은 영향받은 행의 수
	         if (r1 > 0)
	            System.out.println("수정완료 : " + r1);
	         // 영향 받은 행의 수가 1 이상이면 "수정완료" 메시지 출력

//	         // DELETE
	         int r2 = deleteBook(dto);
	         if (r2 > 0)
	            System.out.println("삭제완료 : " + r2);
	         // 영향 받은 행의 수가 1 이상이면 "삭제완료" 메시지 출력

//	         // TX END
	         conn.commit();
	         // 트랜잭션 종료 : 지금까지 실행한 작업을 DB에 확정
	      } catch (Exception e) {
	         // TX ROLLBACKALL
	         try {
	            conn.rollback();
	         } catch (Exception e2) {
	         }
	         // 예외 상황 발생시 롤백 : 문제가 생기면 지금까지의 변경사항을 모두 취소해서 DB를 원래 상태로 되돌림
	      } finally {
	         // 자원 제거
	         try {
	            rs.close();
	         } catch (Exception e3) {
	         }
	         // ResultSet 닫기(조회결과 메모리 해제) 에러 무시
	         try {
	            pstmt.close();
	         } catch (Exception e3) {
	         }
	         // preparedStatement 닫기(SQL 실행 객체 해제) 에러 무시
	         try {
	            conn.close();
	         } catch (Exception e3) {
	         }
	         // DB 연결 종료(소켓/세션 해제) 에러 무시
	      }
	   }
}
