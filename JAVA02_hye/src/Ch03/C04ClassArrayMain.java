package Ch03;
//클래스 형 배열?
class C04Person{
	String name;
	int age;
	//디폴트생성자
	C04Person(){}
	//모든인자 생성자
	public C04Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//toString 생성자
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class C04ClassArrayMain {

	public static void main(String[] args) {
		C04Person list[] = new C04Person[3]; // C04Person[3] -> 참조변수 형태로 사용
		
		list[0] = new C04Person();
		list[0].name = "홍길동"; //list[0]은 참조변수 형태이므로 값이 없음 => 요소와 관련된 객체 연결
		list[1].age = 55;
		
		System.out.println(list[0]);
		
		

	}

}
