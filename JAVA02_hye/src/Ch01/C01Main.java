package Ch01;

public class C01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C01Person hong = new C01Person();
		
		hong.name ="홍길동";
		hong.age = 15;
		hong.height = 177.5f;
		hong.weight = 70.5;
		
		System.out.printf("%s %d %f %f",hong.name,hong.age,hong.height,hong.weight);
	}

}
