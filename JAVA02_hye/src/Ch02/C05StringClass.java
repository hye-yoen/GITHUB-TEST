package Ch02;

public class C05StringClass {

	public static void main(String[] args) {
		String str1 = "Java Powerful";
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		String str4 = str1.concat(str2); //문자열 덧붙이기
//
//		System.out.printf("%x\n",System.identityHashCode(str1));
//		System.out.printf("%x\n",System.identityHashCode(str2));
//		System.out.printf("%x\n",System.identityHashCode(str3));
//		System.out.printf("%x\n",System.identityHashCode(str4));
	
	
//		int i=0;
//		String str  = "";
//		while(i<10) {
//			str +=i;
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치 : %x\n",System.identityHashCode(str));
//			i++;
//		} 
		
		//문자열이 추가될때마다 메모리공간에 계속 추가해서 씀
		// -> 문자열 덧붙이기(메모리 누수 방지 클래스 : StringBuffer , StringBuilder)
		
		int i=0;
//		String str  = "";
		StringBuilder str = new StringBuilder("");
		while(i<10) {
//			str +=i;
			str.append(i);
			System.out.print("str : " + str + " ");
			System.out.printf("위치 : %x\n",System.identityHashCode(str));
			i++;
		}//문자열이 추가 될때마다 데이터가 쌓임 => 메모리 동적 확장(메모리 사이즈 확장?) 
		//-> 다른 메모리 침범 가능성 -> 그때는 다시 만들랍니다....
		
		//문자열 관려 함수들		
		System.out.println("문자열 길이 : " + str1.length());
		System.out.println("한문자 찾기 : " + str1.charAt(2));
		
		System.out.println("인덱스 찾기 : " + str1.indexOf('a')); //인덱스 번호
		System.out.println("인덱스 찾기 : " + str1.lastIndexOf('a'));
		
		System.out.println("문자열포함 여부 : " + str1.contains("va"));//T,F
		System.out.println("문자열포함 여부 : " + str1.contains("abs"));
		
		System.out.println("문자열 자르기 : " + (str1.substring(2,6))); //시작인덱스~끝인덱스
		
		String str6 = "등산,탁구,축구,골프,독서,영화감상";
		
		String [] result = str6.split(","); 
		// 구분기호 기준 문자열 잘라내기 => 배열형태로 잘림 (String [] 변수이름)
		
		for(String hobby : result)
			System.out.println(hobby);
		
		
		
	}

}
