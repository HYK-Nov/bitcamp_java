package day06;

public class ChooseMenuPlz {

	public static void main(String[] args) {
		int menu = (int)(Math.random() * 11);
		
		System.out.println("---�޴� ��õ---");
		
		switch (menu) {
			case 0: System.out.println("���");break;
			case 1: System.out.println("����");break;
			case 2: System.out.println("���뱹��");break;
			case 3: System.out.println("����");break;
			case 4: System.out.println("��������");break;
			case 5: System.out.println("�Ľ�Ÿ");break;
			case 6: System.out.println("�ұ���");break;
			case 7: System.out.println("���ö�");break;
			case 8: System.out.println("������ġ");break;
			default: System.out.println("����");break;
		}
	}

}
