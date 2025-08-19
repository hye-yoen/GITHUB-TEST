package Ch05;

class Point2D2{
	int x; 
	int y;
	Point2D2(){
		System.out.println("Point2D 디폴트 생성자 호출");
	}
	Point2D2(int x){
		this.x = x;
		System.out.println("Point2D(int x) 디폴트 생성자 호출");}
	Point2D2(int x, int y){
		this.x = x;
		this.y =y;
		System.out.println("Point2D(int x, int y) 디폴트 생성자 호출");}
	
}
class Point3D2 extends Point2D2{ //Point2D를 상속 받기 때문에 Point2D공간 먼저 생성
	
	int z;
	Point3D2(){
		super(); //상위클래스의Point2D()생성자 호출
		System.out.println("Point3D 디폴트 생성자 호출");
	}
	Point3D2(int x){
		super(x); // 상위 클래스 Point2D(int x)생성자 호출
		System.out.println("Point3D 디폴트 생성자 호출");
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
	
}
public class C02InheritanceMain {

	public static void main(String[] args) {
		Point3D2 ob = new Point3D2();
		ob.x =10;
		ob.y=20;
		ob.z=30;
		System.out.println(ob);

	}

}
