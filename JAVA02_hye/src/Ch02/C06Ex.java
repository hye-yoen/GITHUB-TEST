//package Ch02;
//
//class Profile{
//	//속성
//	private String name;
//	private String addr;
//	private String job;
//	private String major;
//	
//	
//	//생성자
//	//1)디폴트생성자 삽입
//	public Profile(){}
//	//2)모든 인자 받는 생성자 삽입 -> 각멤버에 대입
//	public Profile(String name, String addr, String job, String major) {
//		this.name = name;
//		this.addr = addr;
//		this.job = job;
//		this.major = major;
//	}
//	
//	public Profile(String arg){	//생성자 새로운거 가능?
//		String [] result = arg.split(",");
//		this.name= result[0]; 
//		this.addr = result[1]; 
//		this.job = result[2]; 
//		this.major = result[3]; 
//	}
//	
//	//이거 안함
//	//3)모든 인자 받는 생성자 삽입(가변인자사용할것) -> , 를기준으로 잘라내어 각속성에 저장
//	//ex, "홍길동,대구,프로그래머,컴퓨터공학" ->[홍길동,대구,프로그래머,컴퓨터공학]
////	public Profile(String... string) {
////		
////	}
//
//	
//	//기능
//	//1) 멤버변수를 은닉화 하고 getter and setter 를 만들어줍니다
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return this.name;
//	}
//	
//	public String getAddr() {
//		return addr;
//	}
//	public void setAddr(String addr) {
//		this.addr = addr;
//	}
//	public String getJob() {
//		return job;
//	}
//	public void setJob(String job) {
//		this.job = job;
//	}
//	public String getMajor() {
//		return major;
//	}
//	public void setMajor(String major) {
//		this.major = major;
//	}
//	
//	//2) toString  코드를 삽입 
//	
//	public String toString() {
//		return this.name + this.addr+this.job + this.major;
//	}
//	
//	//3) boolean isContain(String findstr) 함수 완성하기
////	boolean isContain(String findstr) {
//		//findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
//		//아니면 false 리턴
//	boolean isContain(String findstr) { 
//		if(this.name.contains(findstr))
//			return true;
//		else if(this.addr.contains(findstr))
//			return true;
//		else if(this.major.contains(findstr))
//			return true;
//		else if(this.job.contains(findstr))
//			return true;
//		else
//			return false;
//	}
//	
////	}
//	//4)
////	boolean isEquals(String str) {
//		//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
//		//"name,addr,job,major" 와 일치 하면 true
//		//아니면 false 를 리턴
//	
//	boolean isEquals(String str) {
//		String params[] = str.split(",");
//		if(this.name.equals(params[0]) &&
//			this.name.equals(params[1]) &&
//			this.name.equals(params[2])&&
//			this.name.equals(params[3])
//			) {
//			return true;
//		}
//		else return false;
//		
//	}
//
//	
//}
//
//public class C06Ex {
//
//	public static void main(String[] args) {
//		Profile hong = new Profile("홍길동,대구,프로그래머,컴퓨터공학");
//		System.out.println(hong.toString());
//		System.out.println("길동 포함여부 : " + hong.isContain("길동"));	//true
//		System.out.println("컴퓨터 포함여부 : " + hong.isContain("컴퓨터"));	//true
//		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,대구,프로그래머,컴퓨터공학"));//false
//		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,울산,프로그래머,컴퓨터공학"));//false
//	}
//
//}