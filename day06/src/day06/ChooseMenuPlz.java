package day06;

public class ChooseMenuPlz {

	public static void main(String[] args) {
		int menu = (int)(Math.random() * 11);
		
		System.out.println("---¸Þ´º ÃßÃµ---");
		
		switch (menu) {
			case 0: System.out.println("µ·±î½º");break;
			case 1: System.out.println("Á·¹ß");break;
			case 2: System.out.println("¼ø´ë±¹¹ä");break;
			case 3: System.out.println("ÇÇÀÚ");break;
			case 4: System.out.println("Á¦À°ººÀ½");break;
			case 5: System.out.println("ÆÄ½ºÅ¸");break;
			case 6: System.out.println("½Ò±¹¼ö");break;
			case 7: System.out.println("µµ½Ã¶ô");break;
			case 8: System.out.println("»÷µåÀ§Ä¡");break;
			default: System.out.println("±¾±â");break;
		}
	}

}
