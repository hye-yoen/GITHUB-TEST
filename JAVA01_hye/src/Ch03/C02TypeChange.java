package Ch03;

public class C02TypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//강제 형변환
		//좁은범위공간에 큰값을 넣을려고 하는 경우
		//기본적으로 불가능하기 대문데 강제로 자료형을 바꾸어 전달한다
		//데이터 손실의 염려가 있다
		
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println((int)charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		//데이터 손상
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);

	}

}
