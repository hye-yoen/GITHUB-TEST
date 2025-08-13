package Ch07;
import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(조건식) {
//			조건식이 true 인 동안 실횅되는 종속문장
//		}
		
		//01HELLO WORLD 10회 출력
		//탈출용 변수 : i
		//탈출용 조건식 : i<10
		//탈출 연산식 : i++;
//		int i=0;
//		while(i<=10) {
//			System.out.println(i + "HELLO WORLD");
//			i++;
//		}
		
		//02HELLO WORLD N회 출력(N ==키보드로 받은 정수값 , N >0)
//		
	
//		int n = sc.nextInt();
//		if(n<=0) {
//			System.out.printf("n은 보다 커야함\n");
//			System.exit(-1);
//			
//		}
//		int i=0;
//		while(i< n) {
//			System.out.println(i + "HELLO WORLD");
//			i++;
//		}
		
		//03 1부터 10까지 누적합 구하기
//		int i=0;
//		int sum =0;
//		while(i<=10) {
//			System.out.println("i : " + i );
//			sum += i;
//			i++;
//		}
//		System.out.println("%d 부터 %d 까지의 합 : %d\n",1,10,sum);
		
		//04 1부터 N까지의 누적합 구하기
//		Scanner sc = new Scanner(System.in);
//		int i =1;
//		int i1 = i;
//		System.out.print("n값 입력 : ");
//		int n = sc.nextInt();
//		int sum =0;
//		while(i<=n) {
//			sum += i;
//			i++;
//		}
//	
//		
//		System.out.println(i1+"부터"+n+"의 값 : "+ sum);
		
//		//05 N부터 M까지 누적합 구하기 (N<M)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n값 입력 : ");
//		int n = sc.nextInt();
//		int n1 = n;
//		System.out.print("m값 입력 : ");
//		int m = sc.nextInt(); 
//		
//		if(n>=m) {
//			int temp = n;
//			n=m;
//			m = temp;
//		}
//		
//		int sum =0;
//		while(n<=m) {
//			sum += n;
//			n++;
//		}
//		System.out.println(n1+"부터"+m+"의 값 : "+ sum);
		
		//06 n부터 m까지의 짝수의 합,홀수의 합
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n값 입력 : ");
//		int n = sc.nextInt();
//		int n1 = n;
//		System.out.print("m값 입력 : ");
//		int m = sc.nextInt(); 
//		
//		if(n>=m) {
//			int temp = n;
//			n =m;
//			m = temp;
//		}
//		
//		int sum1 =0;
//		int sum0 =0;
//		while(n<=m) {
//			if(n%2 ==0) {
//				sum0 += n;
//			}	
//			else {
//				sum1 += n;
//			}
//			
//			n++;
//		}
//		System.out.println("n부터 m까지의 짝수의 합 : " +  sum0);
//		System.out.println("n부터 m까지의 홀수의 합 : " +  sum1);
		
		
		//07 n단 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단 : ");
		int num = sc.nextInt();
		
		while(num<2 || num >9) {
			System.out.println("2<= n <= 9");
			num = sc.nextInt();
			
		}
		
		int i =1;
		while(i<10) {
			System.out.printf("%d * %d = %d \n",num ,i , num *i);
			i++;
		}
		
		
		
//		if(!(num >=2 && num<=9)) {
//			System.out.println("조건범위 x");
//			System.exit(1);
//		}
//		
//		int i =1;
//		while(i<=9) {
//			System.out.println(num + "*" + i + "=" + num*i);
//			i++;
//		}
//		 
		sc.close();
	}

}
