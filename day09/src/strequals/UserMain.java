package strequals;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		/*
		 * ���� Ŭ���� �ȿ��� ������ ���ڿ��� ���� �����ϴ� ��������
		 * String ��ü�� ������ �� ���� �ּ� ���� ����
		 */
		String s1 = "ȫ�浿";
		String s2 = "ȫ�浿";
		System.out.println(s1 == s2);
		
		Scanner scan = new Scanner(System.in);
		User u = new User("abcd123");
		
		System.out.println("��й�ȣ�� �Է����ּ���");
		
		String password = scan.next();
		
		if (password == u.pw) {
			System.out.println("��й�ȣ�� ��ġ�մϴ�");
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
		}
	}

}
