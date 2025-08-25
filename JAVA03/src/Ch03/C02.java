package Ch03;
class 팝콘재료{}

class 카라멜 extends 팝콘재료{

	@Override
	public String toString() {
		return "카라멜";
	}

}
class 버터옥수수 extends 팝콘재료{

	@Override
	public String toString() {
		return "버터옥수수";
	}
	
}
class PopCorn <T extends 팝콘재료>{
	private T 재료; //구체적인 타입은 생성될 때 결정됨.
	
	public PopCorn(T 재료){ //제너릭 T 타입의 매개변수
		this.재료 = 재료;
	}

	@Override
	public String toString() {
		return "Popcorn [재료=" + 재료 + "]";
	}
		
}

public class C02 {

	public static void main(String[] args) {
		
		PopCorn<카라멜> ob1 = new PopCorn<카라멜>(new 카라멜()); 
		//classname<T>(new class()) ->  PopCorn의 제너럴타입<카라멜> (new 카라멜() 을 받는) 호출
		System.out.println(ob1);
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);

	}

}
