package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// ���׸����� ���� �ڷ����� ����
		Set<String> set = new HashSet<>();
		
		// add(): set�� ��ü �߰�
		set.add("�߰���");
		set.add("���");
		set.add("�踻��");
		set.add("�ܹ���");
		set.add("���"); // �ߺ��Է�
		
		// size(): set�� ����� ��ü ���� �˾ƺ��� �޼���
		System.out.println("set�� ����� ��ü ��: " + set.size());
		System.out.println(set);
		
		/*
		 * - set�� ��ü �����͸� ����Ϸ��� �ݺ���(Iterator�� ����
		 *   ��� ��ü�� ������� �� ���� �ݺ��ؼ� ������ ��
		 */
		Iterator<String> iter = set.iterator(); // set�� �ݺ��� �� �ֵ��� ó��
		
		/*
		 * - �ݺ��� ��ü�� next() �޼��带 ���� set ������ �����͸�
		 *   �ݺ��ؼ� ������ �� �� �̻� ��ȸ�� �����Ͱ� ���ٸ� ���ܸ� �߻���Ű�Ƿ�
		 *   hashNext()�� �̿��� �� �̻� �Ҹ��� �����Ͱ� �ִ��� ���� Ȯ��
		 */
		
		/*
		 * while (iter.hasNext()) { String s = iter.next(); if (s.equals("�ܹ���")) {
		 * System.out.println(s); break; } }
		 */
		
		// remove(), clear(): Set�� ���� ������ ���� ���
		set.remove("�ܹ���");
		System.out.println(set);
		
		set.clear(); // ���� ���� ���
		if (set.isEmpty()) {
			System.out.println("Set�� �������");
		} else {
			System.out.println("Set�� ������� ����");
		}
	}

}
