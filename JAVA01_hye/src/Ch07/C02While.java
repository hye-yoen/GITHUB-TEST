package Ch07;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		// 2단-9단 출력
		
//		int dan =2 ;
//		while(dan<10) {
//			int i =1;
//			while(i<10) {
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		//2단 9단 (2x9 , 2x 8 ,... ,9x9,9x8,...9x1)
		
//		int i =2;
//		while(i<10) {
//			int j =9;
//			while(j>0) {
//				System.out.printf("%d x %d = %d\n", i , j ,i*j);
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//2단 9단 (9x9 , 9x 8 ,... ,2x9,2x8,...2x1)
		
//		int i =9;
//		while(i>1) {
//			int j =9;
//			while(j>0) {
//				System.out.printf("%d x %d = %d\n" , i , j , i*j);
//				j--;
//			}
//			System.out.println();
//			i--;
//		}
		
		
		//2단 n단 (n>2)
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.printf("n입력하삼 (단,n>2) : ");
//		int n = scanner.nextInt();
		
//		if (n<=2) {
//			System.out.println("조건 벗어남");
//			System.exit(-1);
//		}
		
//		int i =2;
//		while(i<=n) {
//			int j =1;
//			while(j<10) {
//				System.out.printf("%d x %d = %d\n",i,j,i*j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
		
		
		//n단 m단 (n<m)
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("n의 수 입력하삼 : ");
//		int n = scanner.nextInt();
//		System.out.print("m의 수 입력하삼 (단, n과 같은 숫자는 안됨) : ");
//		int m = scanner.nextInt();
//		
//		if(n>m) {
//			int temp = n;
//			n =m;
//			m = temp;
//		}
//		
//		if(n==m) {
//			System.out.println("조건에 안 맞음");
//			System.out.println("시스템을 강제 종료합니다.");
//			System.exit(-1);
//		}
//	
//		while(n<=m) {
//			int j =1;
//			while(j<10) {
//				System.out.printf("%d x %d = %d\n", n , j ,n*j);
//				j++;
//			}
//			System.out.println();
//			n++;
//		}
//		sc.close();
		
		//==============================
		// 별찍기 (다 까먹었는데....)
		// 반드시 반복을 사용할 것, 반복시마다 하나의 *만 찍어낼 것
		//==============================
		
//		char star = '*';
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 :");
//		int h = sc.nextInt();
		
		//정방향
//		int i =1;
//		while (i<=h) {
//			int j =1;
//			while(j<=i) {
//				System.out.print(star);
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
	
		//역 방향
//		int i =h;
//		while (i>0) {
//			int j =i;
//			while(j>0) {
//				System.out.print(star);
//				j--;
//			}
//			i--;
//			System.out.println();
//		}
		
		//======================
		// 별찍기2 -별 중앙 (아... 다까먹었는데......)
		//======================
		//   *   	공백 3 별 1
		//  ***  	공백 2 별 3
		// *****	공백 1 별 5
		//*******	공백 0 별 7
		//			4-i   i*2 +1
		
		// 높이 4
//		char star = '*';
//		char space = ' ';
//		int i = 0;
//		while(i<4) {
//			//공백 
//			int j =1;
//			while(j<4-i) {
//				System.out.print(space);
//				j++;
//			}
//			//별
//			int k =1;
//			while(k<=i*2+1) {
//				System.out.print(star);	
//				k++;
//			}
//			OR
//			int k =0;
//			while(k<=i*2) { // 0 - 0 -> k++ -> 0-1 -> while문 나감
//				System.out.print(star);	
//				k++;
//			}
//					
//			i++;
//			System.out.println();
//		}

		
		//높이입력 : h
		//   *   	공백 h-1(1번째 줄,3) 별 1	=> 별 : i*2 +1
		//  ***  	공백 h-2(2번째 줄,2) 별 3	=> 골백 : h-i
		// *****	공백 h-3(3번째 줄,1) 별 5
		//*******	공백 h-4(4번째 줄,0) 별 7
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 : ");
//		int h = sc.nextInt();
//		
//		int i =0;
//		while(i<h) {
//			//공백
//			int j =1;
//			while(j<h-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			//별
//			int k =1;
//			while(k<=i*2+1) {
//				System.out.print("*");
//				k++;
//			}
//			i++;
//			System.out.println();
//			
//		}
		
		
		// 역 입력 : 높이 4
		//******* 공백 0	별 i*2 -1	줄 4
		// *****	  1				줄 3
		//  ***		  2				줄 2
		//   *		  3				줄 1
//		int i = 4;
//		while(i>0) {
//			//공백
//			int j = 0;
//			while(j<4-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k = 0;
//			while(k<i*2-1) {
//				System.out.print("*");
//				k++;
//			}
//			
//			i--;
//			System.out.println();
//		}
//		
		
		//높이 역입력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 : ");
//		int h = sc.nextInt();
//		int i = h;
//		while(i>0) {
//			//공백
//			int j = 0;
//			while(j<h-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k = 0;
//			while(k<i*2-1) {
//				System.out.print("*");
//				k++;
//			}
//			
//			i--;
//			System.out.println();
//		}
		
		
		//다이아몬드
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 : ");
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			//공백
//			int j =1;
//			while(j<h-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			//별
//			int k =1;
//			while(k<=i*2+1) {
//				System.out.print("*");
//				k++;
//			}
//			i++;
//			System.out.println();
//			
//		}
//		
//		i = h-1;
//		while(i>0) {
//			//공백
//			int j = 0;
//			while(j<h-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k = 0;
//			while(k<i*2-1) {
//				System.out.print("*");
//				k++;
//			}
//			
//			i--;
//			System.out.println();
//		}
		
		//모래시계 (<- 이건 선 넘었지...)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 : ");
//		int h = sc.nextInt();
//		
//		int i = h;
//		while(i>0) {
//			//공백
//			int j = 0;
//			while(j<h-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k = 0;
//			while(k<i*2-1) {
//				System.out.print("*");
//				k++;
//			}
//			
//			i--;
//			System.out.println();
//		}
//		
//		
//		i = 1 ;
//		while(i<h) {
//			//공백
//			int j =1;
//			while(j<h-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			//별
//			int k =1;
//			while(k<=i*2+1) {
//				System.out.print("*");
//				k++;
//			}
//			i++;
//			System.out.println();
//			
//		}
//		
//		
	}

}
