package example.overload;

public class MainClass {

	public static void main(String[] args) {
		OverloadExample oe = new OverloadExample();
		
		oe.input(1);
		oe.input(2, 3);
		oe.input(3.5, "������");
		oe.input("������");
		oe.input("������", 3.5);
	}

}
