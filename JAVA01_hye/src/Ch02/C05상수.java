package Ch02;

public class C05상수 {
	public static void main(String[] args) {
		//상수 : 항상 같은 수
		
		//리터럴 상수 : 이름부여 x . 상수 Pool에 저장, 단순한 수치, 값
		//심볼릭 상수 : 이름부여 O,final 예약어 사용
		
		//리터링 접미사 : 리터럴 상수가 저장되는 나료형을 지정
		//L.l : long 자료형
		//f,F : float 자료형
		
		int a = 'a';
		System.out.println((int)a);
		System.out.println((char)a);
		
		int n1 = 100;
		final int n2 = 200;
		
		final double PI = 3.14; //값 변경 불가
		
		double result = PI*4*4;
		
	}
}
