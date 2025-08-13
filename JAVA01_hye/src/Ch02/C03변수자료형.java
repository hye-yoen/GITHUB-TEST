package Ch02;

public class C03변수자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;		//int만큼의 크기(4byte)의 공간형성 + num1 이름부여   => 변수 정의
		num1 = 10;		//10이라고 하는 값(리터럴상수)을 상수 Pool에 저장, num1공간에 대입(복사)
		int num2=4;		//4라고 하는 값(리터럴 상수) 상수 Pool에 저장, 4byte정수공간 num2에 초기화
		int num3 = num1+num2; //num1 + num2 의 값을 num3에 초기화
		System.out.println(num3); //num3 안의 값 println으로 전달해서 console에 출력
	}
	
	//Data(수,자료) 	: 선 저장 / 후 처리
	//변수 			: 개발자의 유지보수 측면에서 우리하도록 하기 위해 지정된 수
	//변수명 			: 저장되어져 있는 변수 공간에 접근하기 위한 문자 형태의 주소
	//자료형 			: Data(수,자료)를 저장하기 위한 공간을 형성하는 예약어(공간형성+제약조건)
	//lv(공간) = rv(값)   rv를 먼저 처리(저장 or 연산) 한 다음 lv 에 대입
}
