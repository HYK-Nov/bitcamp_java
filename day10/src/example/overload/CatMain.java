package example.overload;

public class CatMain {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat("곤양", "고양이");
		
		c1.call();
		c2.call("냥냥이");
	}

}
