package api.lang.string;

import java.util.Scanner;

public class StringIndexOfQuiz {

	public static void main(String[] args) {
		// 1. Ư�� ������ ��ĳ�ʷ� �Է¹ޱ�
		// 2. 1���� �Է¹��� ���忡�� ��ȸ�� �ܾ� ����
		// 3. �ܾ �� �� �ִ��� ī�����ϰ�, �� �� �ε����� ���� �ִ��� �ֿܼ� ���
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(new StringBuffer("��ü ������ �Է����ּ���."));
		String str = scan.next();
		
		System.out.println(new StringBuffer("ã�� �ܾ��� �Է����ּ���."));
		String search = scan.next();
		
		int count = 0;
		
		System.out.println(new StringBuffer(str).append("���� ").append(search).append("��(��) ã���ϴ�."));
		
		for (int i = 0; i < str.length(); i++) {
			if(str.indexOf(search, i) > -1) {
				System.out.println(new StringBuffer("�ܾ� ���� �ε���: ").append(str.indexOf(search, i)));
				i = str.indexOf(search, i);
				count++;
			}else break;
		}
		
		System.out.println(new StringBuffer("�ܾ� ã�� ����"));
		System.out.println(new StringBuffer(search).append("�� ������ ").append(count).append("�� �Դϴ�."));
	}
}
