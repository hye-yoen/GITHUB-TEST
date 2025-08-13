package Ch03;

public class C06TypeChange {

	public static void main(String[] args) {
		
		char n1 = 60000;
		short n2 = (short)n1 ; //부호가 달라서 강제 형변환
		System.out.println(n2);
		
		int n3 = n2;
		System.out.println(n3);
	}

}
