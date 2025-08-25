package Ch04;

import java.util.HashMap;
import java.util.Map;

public class C06MapMain {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		//key: value 형태 -> 유일성(key)
		//추가
		map.put("aaa", 1111);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444); 	//older가 적용
		map.put("ddd", 5555);	//newer가 적용
		//=> 중복된 key가 있을땐 최근것이 적용
		//확인
		for(String key : map.keySet()) { //["aaa","bbb","ccc","ddd"]
			System.out.println("KEY : " + key + " VALUE : "+ map.get(key));
			//모든 key를 set(중복혀용 x)형태로 가져온 다음 get으로 가져옴 
		}
		
		//삭제
		map.remove("aaa");
		
		//확인
		System.out.println("SIZE : " + map.size());
		System.out.println("단건 : "+map.get("bbb"));
	}
}
