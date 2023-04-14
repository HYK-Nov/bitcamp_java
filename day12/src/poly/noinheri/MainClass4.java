package poly.noinheri;

public class MainClass4 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("Barbarian");
		Magician m1 = new Magician("Wizard");
		Pig p1 = new Pig();
		Ghost g1 = new Ghost();
		
		w1.showStatus();
		m1.showStatus();
		
		w1.huntPig(p1);
		m1.huntPig(p1);
		
		w1.showStatus();
		m1.showStatus();
		
		w1.huntGhost(g1);
		m1.huntGhost(g1);
		
		w1.showStatus();
		m1.showStatus();
	}

}
