package test;
class Person{
	String name;
	String age;
	String addr;
	public Person(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
}

class Man extends Person{
	public Man(String name, String age,String addr) {
		super(name,age,addr);
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
class Woman extends Person{
	public Woman(String name, String age,String addr) {
		super(name,age,addr);
	}
	
	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
class friend<X extends Man,Y extends Woman >{
	private X member1;
	private Y member2;
	public friend(X member1, Y member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}
	@Override
	public String toString() {
		return "friend [member1=" + member1 + ", member2=" + member2 + "]";
	}
	
	
}


public class C03 {

	public static void main(String[] args) {
		friend<Man,Woman> friend1 = new friend<Man,Woman>(new Man("철수","50","대구"),
		new Woman("영희","50","울산"));
		System.out.println("friend : " + friend1);

//		friend<Man,Man> friend2 = new friend<Man,Man>(new Man("철수","50","대구"),
//		new Man("영희","50","울산"));
//		System.out.println("friend" + friend2);
		
	}

}
