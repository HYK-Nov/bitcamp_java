package poly.noinheri;

public class MainClass3 {

	public static void main(String[] args) {
		// Rat 2���� ����, 1���� ���
		Warrior w1 = new Warrior("Barbarian");
		Rat r1 = new Rat();
		Rat r2 = new Rat();
		
		w1.showStatus();
		
		w1.huntRat(r1);
		w1.huntRat(r1);
		w1.huntRat(r1);
		w1.huntRat(r1);
		
		w1.showStatus();
	}

}
