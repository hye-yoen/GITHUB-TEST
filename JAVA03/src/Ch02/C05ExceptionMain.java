package Ch02;

public class C05ExceptionMain {
	public static void main(String[] args) {
		
		try {
		String str = "";
//		str.toString();
		
		int [] arr = {10,20,30};
//		arr[5] = 100;
		
		Animal tori = new Dog();
		Cat down = (Cat)tori;
		
		}
		//상위클래스의 exception가능-> 업캐스팅
		catch(Exception e) {
			System.out.println(e.getCause() + " 예외처리!");
		}
//		catch(NullPointerException e1){ //예외 마우스 커서, ctrl + t
//			System.out.println("NULLPOINTER 예외처리 완료!");
//		}catch(ArrayIndexOutOfBoundsException e2) {
//			System.out.println("배열 예외 처리 완료");
//		}catch(ClassCastException e3) {
//			System.out.println("다운캐스팅 예외 처리 완료");
//		}
		//원래는 주석처리된 부분이 기본! but 그거 다하면 죽어....
		
		
	}
}
