package day08;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car("Genesis G80", 5, "Peter");

		for (int i = 0; i < 3; i++) c1.accelerate();

		c1.showStatus();

		for (int i = 0; i < 2; i++) c1.break_();

		c1.showStatus();
	}

}
