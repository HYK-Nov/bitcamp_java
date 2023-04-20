package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginQuiz {
	public static void main(String[] args) {
		/*
		 * <�α��� �Է� �� ����>
		 * 
		 * 1. �Է� ���� ���̵� �ʿ� �Էµ� Ű ����
		 *    �ش��ϴ����� ���� �˻�(containsKey �޼��� ���)
		 * 2. �´ٸ� �ٽ� �ѹ� ��й�ȣ�� ���� ���Ͽ� ��й�ȣ�� ��ġ�ϸ�
		 *    "�α��� ����"�� �ֿܼ� ����ϰ� �ݺ����� Ż��
		 * 3. ��й�ȣ�� �ٸ��ٸ� "��й�ȣ�� Ʋ�Ƚ��ϴ�"�� ���
		 * 4. �Է¹��� ���̵� �ʿ� �Էµ� Ű ���� �ƴ϶��
		 *    "���̵� �������� �ʽ��ϴ�"�� ���
		 *    
		 * ����: Scanner�� �̿�, ���̵�� ��й�ȣ �Է� �ް� �̸� ������ HashMap�� ����
		 *     ID�� PW ����� �α��� �Է� �� ���� ����     
		 */
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		System.out.println("*** ȸ�� ���� ���� ***");
		System.out.print("- ID ���: ");
		String ID = scan.next();
		
		System.out.print("- PW ���: ");
		String PW = scan.next();
		
		map.put(ID, PW);
		System.out.println("====================");
		
		System.out.println("���̵�� ��й�ȣ �Է�:");
		System.out.print("ID: ");
		String inputID = scan.next();
		
		System.out.print("PW: ");
		String inputPW = scan.next();
		
		if (map.containsKey(inputID)) {
			if(map.get(inputID).equals(inputPW)) System.out.println("�α��� ����");
			else System.out.println("�α��� ����");
		}else System.out.println("�α��� ����");
	}
}
