package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("Barbarian");
		Magician m1 = new Magician("Wizard");
		Pig p1 = new Pig();
		Ghost g1 = new Ghost();
		Rat rat1 = new Rat(); 
		Rabbit r1 = new Rabbit();
		Death d1 = new Death(); // »ç¸Á Å×½ºÆ®
		
		w1.showStatus();
		
		w1.hunt(rat1);
		m1.castFireball(rat1);
		
		w1.hunt(r1);
		
		w1.hunt(p1);
		m1.hunt(p1);
		
		w1.hunt(d1);
		w1.hunt(d1);
		
		w1.showStatus();
		m1.showStatus();
	}

}
