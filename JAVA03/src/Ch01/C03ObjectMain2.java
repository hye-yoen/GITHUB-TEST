package Ch01;
class C03Simple{
	int n ;
	C03Simple(int n){
		this.n =n;
	}
	@Override
	public boolean equals(Object obj) { //모든 객체를 받아낼 수 있도록 업 캐스팅
		if(obj instanceof C03Simple) { //외부로 들어온 객체(obj)가 C02Simple인지 확인
			C03Simple down = (C03Simple)obj; //업캐스팅 상태에서 확장된 부분에 접근
			this.n = down.n;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	
}

public class C03ObjectMain2 {
 public static void main(String[] args) {
	C03Simple ob1 = new C03Simple(10);
	System.out.println(ob1.toString());
	System.out.printf("%x \n",ob1.toString());

	

}
}
