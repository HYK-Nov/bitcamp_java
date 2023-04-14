package day08;

public class BasketballPlayer {
	public String name; // ³ó±¸¼±¼öÀÇ ÀÌ¸§
	public int height; // Å°
	public int age; // ³ªÀÌ
	public int salary; // ¿¬ºÀ
	
	public BasketballPlayer(String n, int h, int a, int sal) {
		name = n;
		height = h;
		age = a;
		salary = sal;
	}
	
	public void showInfo() { 
		System.out.println("name: " + name);
		System.out.println("height: " + height);
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		System.out.println("------------------");
	}
	
	public void dunkShoot() { // µ¢Å©½¸ ±â´É
		if (height > 190) {
			System.out.println("µ¢Å©½¸ ¼º°ø!");
			System.out.println();
		}else {
			System.out.println("°ñ´ë¿¡ ´êÁö ¾ÊÀ½");
			System.out.println();
		}
	}
}
