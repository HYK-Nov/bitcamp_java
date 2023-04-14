package poly.inheri;

public class MainClass {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("Barbarian");
		Magician m1 = new Magician("Wizard");
		Pig p1 = new Pig();
		Ghost g1 = new Ghost();
		Ghost g2 = new Ghost();
		Rat rat1 = new Rat(); 
		
		w1.showStatus();
		m1.showStatus();
		
		w1.skill(rat1);
		m1.skill(p1);
		
		w1.hunt(g1);
		m1.hunt(g1);
		w1.hunt(g1);
		m1.hunt(g1);
		
		w1.skill(g1);
		m1.skill(g1);
		m1.hunt(g1);
		m1.hunt(g1);
		m1.hunt(g2);
		m1.hunt(g2);
		m1.hunt(g2);
		m1.hunt(g2);
		m1.hunt(g2);
		m1.hunt(g2);
		
		
		g1.showStatus();
		
		w1.showStatus();
		m1.showStatus();
	}

}
