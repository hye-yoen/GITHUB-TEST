package Ch02;
class C01Person{
	String name;
	private int age;
	private String addr;
	
	//기능
	
	//setter 함수 (기존데이터 수정)
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter 함수 (데이터를 외부로 반환)
	//파라미터 받을 필요 x but return 필요
	public int getAge() {
		return this.age;
	}
	
	
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	//디폴트 생성자
	public C01Person() {}
	//모든인자 생성자
	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}	
	
	//toString 재정의
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}


	
}

public class C01정보은닉 {

	public static void main(String[] args) {
		C01Person person1 =  new C01Person("홀길동",55,"대구");
		person1.setAge(33);
		
		System.out.println(person1.getAge());
	}

}
