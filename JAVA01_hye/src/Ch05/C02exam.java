package Ch05;

import java.util.Scanner;

public class C02exam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.문제(삼항연산자 + 논리연산자)
		// 키보드로 국어/영어/수학 점수를 입력받아 각각의부분점수가 40점이상이고
		// 총점수합의 평균이 70점이상이면 '합격'
		// 미만이면 '불합격'을 출력합니다
		
		System.out.println("국어점수>>>");
		int korean = sc.nextInt();
		System.out.println("수학점수>>>");
		int math = sc.nextInt();
		System.out.println("영어점수>>>");
		int english = sc.nextInt();
		
		
		// (조건식)? 참인경우 실행코드 : 거짓인경우 실행코드;		
		int total = (korean>=40 && math >= 0 && english >= 40)? (korean + math + english)/3 : 0 ;
		String result = (total >= 70)? "합격" :"불합격" ;
//		걍 if 사용하면 안됨?
		System.out.println("시험결과 : "+result);
			

		//2.미니문제(%연산자)
		//키보드로 부터 정수값 2개를 입력받아
		//두수의 합이 짝수이면 "짝수입니다"
		//홀수이면 "홀수입니다" 를 출력하세요~
		
		System.out.println("숫자1>>>");
		int num1 = sc.nextInt();
		System.out.println("숫자2>>>");
		int num2 = sc.nextInt();
		
		int result2 = (num1 + num2)%2;
		
		String result3 = (result2 == 0)? "짝수임" : "홀수임";
		System.out.println(result3);
		
		sc.close();
	}
}
