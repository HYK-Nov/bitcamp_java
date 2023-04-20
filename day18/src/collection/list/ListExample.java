package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		// ArrayList�� LinkedList�� ��� ����� ���� List�� ����
		// ���� ��ȯ ����. �������̽��� ���� ����ü���� ������ ����
		// ���׸�: Ÿ�� ����ȭ�� ���� ��ü ���ο� ����Ǵ� Ÿ���� ��ġ��Ű�� ���
		// String�� ������ �� �ִ� �÷���
//		List<String> list = new ArrayList<>(); // 1.8���ʹ� �����ڿ� ���׸� ǥ�� ���� �ʾƵ� ��
		List<String> list = new LinkedList<>();
		
		String str1 = "Java";
		String str2 = "SpringBoot";
		System.out.println(list); // �÷��� Ư���� toString()�� �̹� �����ǵǾ� �ּҰ� �� ������ ���ο�Ұ� ����
		
		// list�� ��ü�� �����ϴ� �޼��� add(): �����͸� ������ ������ �߰�
		list.add(str1);
		list.add(str2);
		list.add("Database");
		list.add("JDBC");
		list.add("Database");
		System.out.println(list);
		
		// list�� ����� �� ��ü �� ��� size()
		int size = list.size();
		System.out.println("list�� ����� �� ��ü ��: " + size);
		
		// list�� ��ü ���� add(index, ��ü): �����͸� �ش� �ε����� ����
		list.add(2, "Network");
		System.out.println(list);
		
		// list ������ ���� set(index, ��ü)
//		list[3] = "PostgreSQL"; // �Ϲ� ���� ���� ��� �Ұ�
		list.set(3, "postgreSQL");
		System.out.println(list);
		
		// list ���� ��ü �������� get(index)
		String s = list.get(2);
		System.out.println(s);
		
		// list ���ο� ����� ��ü �ε��� ��ȣ Ȯ��
		int idx = list.indexOf("Network"); // ���� �ڷ� ��ȸ�� -1
		System.out.println(idx);
		
		// list���� ��ü ������ ���� remove(index), remove(��ü)
		list.remove(5);
		System.out.println(list);
		list.remove(str1);
		System.out.println(list);
		
		// list ���ο� ����� ��ü�� ����Ȯ�� contains() -> ������ true, ������ false
		System.out.println(list.contains(str1));
		
		// list�� �ݺ��� ó��
		// �ε����� ��ȸ
		for (int i = 0; i < list.size(); i++) {
			System.out.println("���� ���: " + list.get(i));
		}
		System.out.println("-----------------------");
		// ���� for���� ��� ����(List<String> ���� ���������Ƿ� String���� �ޱ�
		for(String str: list) {
			System.out.println("���� ���: " + str);
		}
		
		// list ������ ��ü �ڷ� ���� clear()
		list.clear();
		System.out.println(list); // list��� �ڽ��� ��������
		
		// list ���� �����Ͱ� ���� ����ִ��� Ȯ���ϴ� �޼��� isEmpty()
		System.out.println(list.isEmpty());
	}
}
