package day07;

public class HomeworkExample2 {

	public static void main(String[] args) {
		// ����Ʈ ��� ���
		// �޴� ����
		String[] menu = {"1", "2", "3", "��", "��"};
		
		// ���� ���ϱ�
		int idx = (int)(Math.random() * menu.length);
		
		System.out.println(menu[idx]);
	}

}
