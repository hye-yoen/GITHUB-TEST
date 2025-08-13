package Ch04;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		//자동 import : ctrl + shift + o
		
		//스트림
		//System.in  : 표준 입력 스트림 생성(요청)
		//system.out : 표준 출력 스트림 생성(요청)
		
		//new Scanner(System.in) : 표준입력 스트림을 연결한 Scanner 객체
		//scanner sc = new Scanner(System.in)
		//표준입력스트림에 연결된 Scanner객체를 생성한 다음
		//해당 객체의 위치값(메모리 위치값)을 main Stack영역의 Scanner sc참조변수에 초기화
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("num1입력>>>");
		int num1 = sc.nextInt(); //엔터,스페이스바
		
		System.out.printf("num2입력>>>");
		int num2 = sc.nextInt(); //엔터,스페이스바
		
		System.out.printf("num3입력>>>");
		int num3 = sc.nextInt(); //엔터,스페이스바
		
		System.out.printf("%d %d %d\n",num1,num2,num3);
		sc.close();
	}

}
