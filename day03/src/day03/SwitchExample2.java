package day03;

public class SwitchExample2 {
	public static void main(String[] args) {
		String[] foods = { "�ѽ�", "�Ͻ�", "�߽�", "���", "����" };

		int idx = (int) (Math.random() * 5);

		switch (foods[idx]) {
		case "�Ͻ�":
			System.out.println("�Ͻ��Դϴ�");
			break;
		case "�߽�":
			System.out.println("�߽��Դϴ�");
			break;
		case "���":
			System.out.println("����Դϴ�");
			break;
		default:
			System.out.println("��Ÿ�丮�Դϴ�");
		}
	}
}
