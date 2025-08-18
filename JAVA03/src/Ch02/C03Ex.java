package Ch02;
import java.util.Scanner;

public class C03Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나누셈위한 두값을 입력하삼");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			System.out.println("나눗셈 결과 : "+ n1/n2); //n/0시 예외 발생!
		}catch(ArithmeticException e) {
			System.out.println("예외발생 : "+e);
		}//끙 ... 여기에서 finally를 해야 하나???????
		System.out.println("실헹되어야 할 코드1");
		System.out.println("실헹되어야 할 코드2");
		System.out.println("프로그램 종료");
		
	}

}
