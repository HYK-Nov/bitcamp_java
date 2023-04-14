package day08;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		BasketballPlayer b1 = new BasketballPlayer("Joshie", 193, 23, 4000);
		
		BasketballPlayer b2 = new BasketballPlayer("Paul", 182, 32, 3800);
		
		b1.showInfo();
		b1.dunkShoot();
		
		b2.showInfo();
		b2.dunkShoot();
	}

}
