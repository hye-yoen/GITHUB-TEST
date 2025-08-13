//package Ch06;
//
//import java.net.MulticastSocket;
//import java.util.Scanner;
//
//public class C01F {
//	public static void main(String[] args) {
//		//======================
//		//단순 IF
//		//----------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.println("age : ");
//		int age = sc.nextInt();
//		if(age>=8) {
//			System.out.println("학교 다닙니다.");
//		}
//		System.out.println("first if end");
//		
//		if(age<8) {
//			System.out.println("학교다니지 않음");
//			
//		}
//		System.out.println("second if end");
//		System.out.println("프로그램 종료");
//		
//		//문제 1
//		int num1 = sc.nextInt();
//		if(num1 % 3 == 0 && num1 %5 ==0) {
//			System.out.println("3&5의 배수");
//		}
//		else {
//			System.err.println("3&5의 배수 아님");
//		}
//		
//		//문제 2
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		if(num2 > num3) {
//			System.out.println("num2가 더 큼");
//		}
//		else {
//			System.out.println("num3가 더 큼");
//		}
//		
//		//문제3
//		int num4 = sc.nextInt();
//		int num5 = sc.nextInt();
//		int num6 = sc.nextInt();
//		
//		if(num4 > num5 && num4 > num6) {
//			System.out.println("num4가 가장 큼");
//		}
//		else if(num5 > num6 && num5> num4) {
//			System.out.println("num5가 가장 큼");
//		}
//		else {
//			System.out.println("num6 가 가장 큼");
//		}
//		
//		//문제 4 (3활용)
//		int sum = num4 + num5 + num6;
//		System.out.println(sum);
//		double avg = (double)sum / 3;
//		System.out.println(avg);
//		
//		//문제 5
//		int num7 = sc.nextInt();
//		if(num7 % 2 ==0 && num7 % 3 == 0) {
//			System.out.println("짝수 겸 3의 배수");
//		}
//		else if(num7 % 2 ==0 && num7 % 5 == 0) {
//			System.out.println("짝수 겸 5의 배수");
//		}
//		else {
//			System.out.println("짝수 x");
//		}
//		
//		//IF-ELSE, IIF
//		int 과목1 = sc.nextInt();
////		int 과목2 = sc.nextInt();
////		int 과목3 = sc.nextInt();
////		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4) /4;
//		
//		if(과목1<40) {
//			System.out.println("불합격");
//		}
//		else if(과목2<40)	// 과목1>=40 && 과목2<40
//		{
//			System.out.println("불합격");
//		}
//		
//		else if(과목3<40)	// 과목1>=40 && 과목2>=40 && 과목3<40
//			{
//				System.out.println("불합격");
//			}
//			else if(과목4<40) // 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4<40
//			{
//				System.out.println("불합격");
//			}
//			else if(평균<60) // 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=4
//			{
//				System.out.println("불합격");
//			}
//			else // 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=40 && 평균>=60
//			{
//				System.out.println("합격");
////			}
//		
//		//문제 
//		System.out.println("시험점수 입력");
//		int num10 =sc.nextInt();
//		if(num10 >= 90) {
//			System.out.println('A');
//		}
//		else if (num10 >=80) {
//			System.out.println('B');
//		}
//		else if (num10 >=70) {
//			System.out.println('C');
//		}
//		else if (num10 >=60) {
//			System.out.println('D');
//		}
//		else {
//			System.out.println("F");
//		}
//		
//		
//		
//		
//		//age
//		int age = sc.nextInt();
//		
//		if (age < 8) {
//			System.out.println("요금 : 1000원");
//		}
//		else if (age < 14) {
//			System.out.println("요금 : 2000원");
//		}
//		else if (age < 20) {
//			System.out.println("요금 : 2500원");
//		}
//		else {
//			System.out.println("요금 : 3000원");
//		}
//		
//				
//		
//				
//		sc.close();
//		
//		
//		
//		
//	}
//}
// 