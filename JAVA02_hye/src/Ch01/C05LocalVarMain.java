package Ch01;
class C05Simple{
	//속성
	int num = 10;   //멤버변수 , 밑의 모든 함수의 사용가능
	
	//기능
	void Func1() {
		System.out.println("num : "+ num);
		int num = 20; 	// Func1의 지역변수
		num++; 			// 지역변수에 접근
		System.out.println("Func1지역변수 num : "+ num);
		this.num++; //현재 만들어진 객체의 멤버에 접근 => this. : 현재 만들어진 객체에 접근하게 만드는 것
		System.out.println("this.num : "+ this.num);
	}
	
	void Func2() {
		System.out.println("멤버변수num : "+ num); //Func1에서 +된거
		if(num>0) {
			int num  = 100;			//if 문 내의 지역변수
			System.out.println("지역변수num : "+ num);
		}
		System.out.println("멤버변수num : "+ num);
//		while(num<15) {
//			//int num = 100;
//			System.out.println("numtest : " + num);
//			num++;
//		}
	}
	
	void Func3(int num) {
		this.num = num;   //자기 파라미터(매개변수)에 넣기 위해?

	}
	

	
}

public class C05LocalVarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C05Simple obj = new C05Simple();
		obj.Func1();
		System.out.println("-------------");
		obj.Func2();
		
	}

}
