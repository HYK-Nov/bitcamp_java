package example.this_.human;

public class HumanMain {

	public static void main(String[] args) {
		Human kim = new Human("��ö��", 20);
		kim.showInfo();
		
		Human park = new Human("�ڿ���");
		park.showInfo();
		
		Human noname = new Human();
		noname.showInfo();
	}

}
