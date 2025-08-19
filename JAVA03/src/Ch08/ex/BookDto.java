package Ch08.ex;

public class BookDto {
	//속성
	private Long bookCode;
	private String bookname;
	private String publisher;
	private String isbn;
	//디폴트 생성자
	public BookDto() {}
	public BookDto(Long bookCode, String bookname, String publisher, String isbn) {
		super();
		this.bookCode = bookCode;
		this.bookname = bookname;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	public Long getBookCode() {
		return bookCode;
	}
	public void setBookCode(Long bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "BookDto [bookCode=" + bookCode + ", bookname=" + bookname + ", publisher=" + publisher + ", isbn="
				+ isbn + "]";
	}
	
}
