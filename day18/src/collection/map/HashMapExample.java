package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map<key, value>		
		Map<String, Integer> map = new HashMap<>();
		
		// Map에 객체를 저장 put(key, value)
		map.put("치킨", 30000);
		map.put("라면", 4000);
		map.put("탕수육", 20000);
		// 중복 key를 넣으면, 가장 마지막에 넣은 하나만 적용
		map.put("치킨", 25000);
		
		System.out.println(map);
		
		// Map에 저장된 key, value 쌍(entry) 개수 측정 size()
		System.out.println(map.size());
		
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		Iterator<String> kIter = kSet.iterator();
		System.out.println("-----------------------");
		
		while(kIter.hasNext()) {
			String menu = kIter.next();
			System.out.println(menu + ": " + map.get(menu) + "원");
		}
		
		// Map 내부에 있는 key 값의 유무 확인 containsKey()
		String food = "치킨";
		if(map.containsKey(food)) {
			System.out.println("우리 식당 " + food + " 팝니다");
		}else {
			System.out.println("우리 식당 " + food + " 안 팝니다");
		}
		
		// Map 내부 데이터 단일 데이터 삭제 remove(key)
		// 일치하는 key 값의 entry 한 쌍 삭제
		map.remove("라면");
		System.out.println(map);
		// Map 내부 전체 데이터 일괄 삭제 clear()
		map.clear();
		System.out.println(map);
		
		if (map.isEmpty()) {
			System.out.println("빈 Map 입니다.");
		} else {
			System.out.println("안 빈 Map 입니다.");
		}
	}

}
