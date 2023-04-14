package chap05;

class Animal_08{
	String name_08;
	
	public void setName(String name) {
		this.name_08 = name;
	}
}

public class Main02 {

	public static void main(String[] args) {
		Animal_08 cat_08 = new Animal_08();
		cat_08.setName("boby");
		
		Animal_08 dog_08 = new Animal_08();
		dog_08.setName("happy");
		
		System.out.println(cat_08.name_08);
		System.out.println(dog_08.name_08);
	}

}
