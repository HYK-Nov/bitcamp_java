package example.this_.human;

public class HumanMain {

	public static void main(String[] args) {
		Human kim = new Human("±èÃ¶¼ö", 20);
		kim.showInfo();
		
		Human park = new Human("¹Ú¿¬Èñ");
		park.showInfo();
		
		Human noname = new Human();
		noname.showInfo();
	}

}
