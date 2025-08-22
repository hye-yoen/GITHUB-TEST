package Ch01;
class C02Simple{
	int n ;
	C02Simple(int n){
		this.n =n;
	}
	@Override
	public boolean equals(Object obj) { //모든 객체를 받아낼 수 있도록 업 캐스팅
		if(obj instanceof C02Simple) { //외부로 들어온 객체(obj)가 C02Simple인지 확인
			C02Simple down = (C02Simple)obj; //업캐스팅 상태에서 확장된 부분에 접근
			this.n = down.n;
		}
		return false;
	}
	
	
}

public class C02ObjectMain {
 public static void main(String[] args) {
	C02Simple ob1 = new C02Simple(10);
	C02Simple ob2 = new C02Simple(10);
	C02Simple ob3 = new C02Simple(20);
	
	System.out.println(ob1.equals(ob2));
	System.out.println(ob1.equals(ob3));
}
}
