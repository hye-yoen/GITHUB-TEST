package test;
class A{
	
}

class a extends A{

	@Override
	public String toString() {
		return "a";
	}
	
}
class b extends A{
	
	@Override
	public String toString() {
		return "b";
	}
	
}
class c extends A{
	
	@Override
	public String toString() {
		return "c";
	}
	
}
//class ABC<A extends T > 
//=> A는 T를 상속하거나 구현된 타입만 가능
//첫번째 자리: 타입 매개변수 ,두번째 자리 : 밖에서 정의된 클래스나 인터페이스
class ABC<T extends A>{ //=> T는 A를 상속하거나 구현된 타입만 가능
	private T obj;
	
	public ABC(T obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "ABC [obj=" + obj + "]";
	}
	
	
}

public class C02 {

	public static void main(String[] args) {
		ABC<a> obj = new ABC<a>(new a()); //ABC<a><-이거 객체래.... 어이 x 
		System.out.println(obj);
		
		ABC<b>obj2 = new ABC<b>(new b());
		System.out.println(obj2);

	}

}
