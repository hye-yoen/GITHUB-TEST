//package test;
//
////제너릭 생성자
//class Box<T> {
//	private T item; //제너릭 피리드 생성
//	
//	public void set(T item) {
//		this.item = item;
//	}
//	public classname(T item) {
//		this.item = item;
//	}
//	
//	public T get() {
//		return item;
//	}
//	
//}
//
////제너릭 메서드
//public class Util {
//    public static <T> void printArray(T[] array) {
//    	//<T>는 리턴 타입 앞에 붙으며 제너릭 메서드임을 명시
//        for (T element : array) {
//            System.out.println(element);
//        }
//    }
//}
//
////제너릭 인터페이스 
//interface Processor<T> {
//    void process(T item);
//}
//
//class StringProcessor implements Processor<String> {
//    public void process(String item) {
//        System.out.println("처리: " + item);
//    }
//}
//
////제너릭 제한 상한 제한 extends -> <T extends Number> : T는 Number 또는 그 하위 타입만 가능
//class NumberBox<T extends Number> {
//    T num;
//    public void printDoubleValue() {
//        System.out.println(num.doubleValue());
//    }
//}
//
////와일드카드 ? 사용
////<?> 			: 모든 타입 허용
////<T extends ?> : T또는 T의 하위 타입만 허용 (Prodeucer 역학)
////<T super ?>	: T또는 T의 상위타입만 혀용 (Consumer 역할)
//
//public void printList(List<?> list) {
//	for(Object odj : list) {
//		System.out.println(odj);
//	}
//}
//// 제너릭 타입 제거 (Type Erasure)
////컴파일 시점에 타입 정보가 제거되고, Object로 변환됨
////런타임 시에는 타입 정보를 사용할 수 없음
//public class 제너릭_정리{
//
//	public static void main(String[] args) {
//		Box<String> stringBox = new Box<>();
//		stringBox.set("Hello");
//		System.out.println(stringBox.get());  // Hello
//
//	}
//	
//	
//}