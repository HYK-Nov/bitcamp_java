package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// 제네릭으로 내부 자료형을 결정
		Set<String> set = new HashSet<>();
		
		// add(): set에 객체 추가
		set.add("닭강정");
		set.add("김밥");
		set.add("김말이");
		set.add("단무지");
		set.add("김밥"); // 중복입력
		
		// size(): set에 저장된 객체 수를 알아보는 메서드
		System.out.println("set에 저장된 객체 수: " + set.size());
		System.out.println(set);
		
		/*
		 * - set의 객체 데이터를 사용하려면 반복자(Iterator를 통해
		 *   모든 객체를 대상으로 한 번씩 반복해서 꺼내야 함
		 */
		Iterator<String> iter = set.iterator(); // set을 반복할 수 있도록 처리
		
		/*
		 * - 반복자 객체가 next() 메서드를 통해 set 내부의 데이터를
		 *   반복해서 소진할 때 더 이상 조회할 데이터가 없다면 예외를 발생시키므로
		 *   hashNext()를 이용해 더 이사 소모할 데이터가 있는지 여부 확인
		 */
		
		/*
		 * while (iter.hasNext()) { String s = iter.next(); if (s.equals("단무지")) {
		 * System.out.println(s); break; } }
		 */
		
		// remove(), clear(): Set의 내부 데이터 삭제 기능
		set.remove("단무지");
		System.out.println(set);
		
		set.clear(); // 집합 내부 비움
		if (set.isEmpty()) {
			System.out.println("Set이 비어있음");
		} else {
			System.out.println("Set이 비어있지 않음");
		}
	}

}
