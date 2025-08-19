package Ch04;

import java.util.ArrayList;
import java.util.List;

public class C01ListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();//<>제너렉: 리스트 안에 어떤 자료 타입을 저장할건지 설정
		//추가
		list.add("HTML/CSS/JS");
		list.add("NODEJS");
		list.add("SCSS");
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SERVLET");
		list.add("STS");
		list.add("SPRING BOOT");
		//조회
		System.out.println("개수확인 : " + list.size());//객수
		System.out.println("idx로 조회 : "+ list.get(2));
		System.out.println("Value로 idx확인 : " + list.indexOf("JAVA"));
		list.forEach(System.out::println);
		
		//삭제
		list.remove(0);
		list.remove("JQUERY");
		System.out.println("---");
		list.forEach(System.out::println);
		//전체삭제
		list.clear();

	}

}
