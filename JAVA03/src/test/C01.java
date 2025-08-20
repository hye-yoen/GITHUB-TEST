//package test;
//
//class 호빵재료{
//	
//}
//class 야채  extends 호빵재료{
//
//	@Override
//	public String toString() {
//		return "야채";
//		}
//	
//}
//class 슈크림  extends 호빵재료{
//	
//	@Override
//	public String toString() {
//		return "슈크림";
//	}
//	
//}
//class 팥  extends 호빵재료{
//	
//	@Override
//	public String toString() {
//		return "팥";
//	}
//	
//}
//
//class 호빵 <T extends 호빵재료>{ //T에서 호빵재료 까지 => 호빵재료를 상속 받은 클래스 까지는 가능
//	private T meterial;
//	호빵 (T meterial){
//		this.meterial = meterial;
//	}
//	@Override
//	public String toString() {
//		return "호빵 [meterial=" + meterial + "]";
//	}
//	
//}
//
//public class C01GenericMain {
//
//	public static void main(String[] args) {
//		호빵<팥> ob1 = new 호빵<팥>(new 팥());
//		System.out.println(ob1);
//		
//		호빵<슈크림> ob2 = new 호빵<슈크림>(new 슈크림());
//		System.out.println(ob2);
//		
//		호빵<야채> ob3 = new 호빵<야채>(new 야채());
//		System.out.println(ob3);
//
//
//	}
//
//}
