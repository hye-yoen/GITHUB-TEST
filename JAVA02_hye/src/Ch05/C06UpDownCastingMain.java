package Ch05;
//부모
class Super{
	int n1;
}

//자식
class Sub extends Super{
	int n2;
}

public class C06UpDownCastingMain {
	public static void main(String[] args) {
		//NoCasting(형변황 없음. 자료형 일치)
		Super ob1 = new Super();
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 20;
		
		//UpCasting(상위클래스 참조변수 = 하위클래스형 객체)(자동형변환) 
		//메모리 영역이 큰 것 -> 작은 것 즉,메모리 영역 침법 x
		//자동형변환이 일어나는 이유 ? 메모리 영역을 침법할 우려가 없기 때문에
		Super ob3 = new Sub();
		ob3.n1= 100;
//		ob3.n2=200; 이거 불가, 부모 기준으로 n1밖에 안 받음
		Super ob4 = ob2; //ob2 즉 Sub를 ob4에 연결
		ob4.n1 = 200;
//		ob4.n2=300; //하지만 실재로는 다운 캐스팅 연결 불가
		
		//DownCasting(하위클래스 참조변수 = 상위클래스형 객체)(강제형변환)
//		Sub ob5= (Sub)ob1;
//		ob5.n1=100; //실제 있는 n1공간에 값 대입(문제 없음)
//		ob5.n2=200;
		

		Sub down = (Sub)ob4; //Upcasting을 전제로 한 DownCasting
		//Sub객체의 시작위치 받음 
		down.n1 = 1000;
		down.n2 = 2000;
	}
	
}
