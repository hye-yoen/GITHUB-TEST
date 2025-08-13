package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 >>>");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수의 값 : " + num1);
		
		System.out.print("실수입력 >>>");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수의 값 : " + num2);
		
		System.out.print("문자열 입력 >>>");
//		String str1 = sc.next();	
		//문자열입력받기기능함수, 띄어쓰기는 포함하지않는다 
		//-> 즉,버퍼 공간에는 남아있지만 출력은 띄어쓰기 전까지만 출력
		sc.nextLine();// \n 잡기
		String str1= sc.nextLine(); //문자열 입력받기 함수, 띄어쓰기는 포함
		System.out.println("입력된 문자열 : " + str1);
		
		sc.close();
		
		//nextInt 에서 엔터를 클릭했을 경우 엔터가 남아있어서  nextline이 바로 넘어감

	}

}
