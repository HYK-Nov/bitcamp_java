package chap05;

class Animal1_08 extends Object{
	String name_08;
	
	public void setName(String name) {
		this.name_08 = name;
	}
}

class Dog_08 extends Animal1_08{ // Animal1_08 클래스 상속
	void sleep_08() {
		System.out.println(this.name_08 + " zzz");
	}
}

class HouseDog_08 extends Dog_08{
	void sleep_08(int hour) {
		System.out.println(this.name_08 + " zzz in house " + hour + " hours");
	}
}

/* 다중상속
 * 
 * class A_08{ public void msg() { System.out.println("A message"); } }
 * 
 * class B_08{ public void msg() { System.out.println("B message"); } }
 * 
 * class C extends A_08, B_08{ public void static main(String[] args) { C test =
 * new C(); test.msg(); } }
 */

public class Main05 {

	public static void main(String[] args) {
		Dog_08 dog_08 = new Dog_08();
		dog_08.setName("poppy");
		
		System.out.println(dog_08.name_08);
		
		dog_08.sleep_08();
		
		// Object animal = new Animal();
		// Object dog = new Dog();
		
		HouseDog_08 houseDog_08 = new HouseDog_08();
		houseDog_08.setName("happy");
		houseDog_08.sleep_08(3);
	}

}
