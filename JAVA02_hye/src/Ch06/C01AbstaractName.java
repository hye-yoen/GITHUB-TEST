package Ch06;
//일반클래스 상속관계
class Parent{
	void func() { }
}

class Son extends Parent{ 
	void func() {System.out.println("Son's func() call! ");}
}

//추상클래스 상속관계
abstract class Parent2{
	abstract void func(); //추상메서드(미완성도니 함수, {}가 없는)
}

class Son2 extends Parent2{
	@Override
	void func() {
	}
}

public class C01AbstaractName {
	public static void main(String[] args) {
		//일반 클래스의 상속관계
		Parent ob1 = new Parent(); 	//상위 클래스 형으로 객체 생성 O
		Son ob2 = new Son(); 		//하위 클래스형으로 객체 생성  O
		Parent ob3 = new Son(); 	//Upcasting 연결 O
		ob3.func();					//재정의 된 func() 접근가능
		
		System.out.println("--------------------");
		//추상클래스 상속관계
//		Parent2 obj1 = new Parent2(); 
		//미완성된 함수 하나 이상 가짐 -> 함수를 완성시키지 안으면 객체 생성 불가
									//즉, 추상클래스로 객체 생성 X
		Son2 obj2 = new Son2();		//하위 클래스 형으로 객체생성 O
		Parent2 obj3 = new Son2(); 	//Upcasting 연결 O
		obj3.func();				//재정의 된 함수에 접근가능 
		
	}
	
}


