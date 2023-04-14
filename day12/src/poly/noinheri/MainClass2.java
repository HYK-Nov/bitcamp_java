package poly.noinheri;

public class MainClass2 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("Barbarian");
		Rabbit r1 = new Rabbit();
		Rabbit r2 = new Rabbit();
		
		w1.showStatus();
		
		w1.huntRabbit(r1);
		w1.huntRabbit(r1);
		w1.huntRabbit(r1);
		w1.huntRabbit(r1);
		w1.showStatus();
	}

}
