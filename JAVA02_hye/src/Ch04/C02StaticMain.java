package Ch04;
class C02simple{
	static int n1 ; 
	int n2;
	
	void func1(){
		n1 = 300;
		
	}
	static void func2() { 
		n1 = 300;
//		n2 = 400; //static함수에서 사용되는 변수는 static 변수  or 지역 변수(일반멤버변수 사용 x )
		//(순서상 static이 먼저 실행됨 따라서 인스턴스 멤버변수가 선언되지도 않았는데 사용한다는 것은 말이 안됨)
	}
}

public class C02StaticMain {
	public static void main(String[] args) {
		
	}
}
