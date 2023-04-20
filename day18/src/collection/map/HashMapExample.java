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
		
		// Map�� ��ü�� ���� put(key, value)
		map.put("ġŲ", 30000);
		map.put("���", 4000);
		map.put("������", 20000);
		// �ߺ� key�� ������, ���� �������� ���� �ϳ��� ����
		map.put("ġŲ", 25000);
		
		System.out.println(map);
		
		// Map�� ����� key, value ��(entry) ���� ���� size()
		System.out.println(map.size());
		
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		Iterator<String> kIter = kSet.iterator();
		System.out.println("-----------------------");
		
		while(kIter.hasNext()) {
			String menu = kIter.next();
			System.out.println(menu + ": " + map.get(menu) + "��");
		}
		
		// Map ���ο� �ִ� key ���� ���� Ȯ�� containsKey()
		String food = "ġŲ";
		if(map.containsKey(food)) {
			System.out.println("�츮 �Ĵ� " + food + " �˴ϴ�");
		}else {
			System.out.println("�츮 �Ĵ� " + food + " �� �˴ϴ�");
		}
		
		// Map ���� ������ ���� ������ ���� remove(key)
		// ��ġ�ϴ� key ���� entry �� �� ����
		map.remove("���");
		System.out.println(map);
		// Map ���� ��ü ������ �ϰ� ���� clear()
		map.clear();
		System.out.println(map);
		
		if (map.isEmpty()) {
			System.out.println("�� Map �Դϴ�.");
		} else {
			System.out.println("�� �� Map �Դϴ�.");
		}
	}

}
