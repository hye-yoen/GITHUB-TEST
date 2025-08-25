package Ch04;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

import java.util.*;
import java.util.stream.*;

public class C04Ex {

	public static void main(String[] args) {
//		Set<String> set = new HashSet();
//		Random ran = new Random();
		//		for(int i =0;i<6;i++ ){
//			int n = ran.nextInt(45);
//			String tmp = new String();
//			tmp = String.valueOf(n);
//			set.add(tmp);
//		}
		
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		
		while(set.size()<6) {
			System.out.println(rnd.nextInt(45)+1);
//			Thread.sleep(500);  //delay
		}
		
	
		//자바 set 오름차순 정렬
		//2-1
//		List<Integer> list =  set.stream().sorted().collect(Collectors.toList());
//		//stream으로 반환 -> sorted사용 -> 
//		list.stream().forEach(System.out::println);
		
		//2-2
		List<Integer> list = new ArrayList(set);
		Collections.sort(list);
		list.stream().forEach(System.out::println);
		
		
	}

}
