package day03;

import java.util.Scanner;

public class SwitchExample1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("�޴��� ��ȣ�� �Է����ּ���");
		System.out.println("1. �Ƹ޸�ī��, 2. ī���, 3. ī���ī");
		int order = scan.nextInt();

		switch (order) {
			case 1:
				System.out.println("�Ƹ޸�ī��");
				break;
			case 2:
				System.out.println("ī���");
				break;
			case 3:
				System.out.println("ī���ī");
				break;
			default:
				System.out.println("���� �� ��Ű�� ������");
		}

		scan.close();
	}
}
