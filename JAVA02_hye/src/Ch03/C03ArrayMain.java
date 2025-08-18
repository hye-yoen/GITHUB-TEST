package Ch03;

public class C03ArrayMain {
	public static void main(String[] args) {
		int arr[][] = {								//행/열 0  1  2 
				{10,20,30}, //행0                    // 0
				{40,50,60,65,67},				    // 1
				{70,80,90,96,11,56},
				{100,110,120,15,22,33,44},
		};
		
		System.out.println("행의 길이 : "  + arr.length);
		System.out.println("행의 길이 : "  + arr[0].length);
		System.out.println("행의 길이 : "  + arr[1].length);
		System.out.println("행의 길이 : "  + arr[2].length);
		System.out.println("행의 길이 : "  + arr[3].length);
		
		
	}
}

