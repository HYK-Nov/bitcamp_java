package exception.runtime;

// ��Ӱ���: �θ� Animal�� ����� �ڽ� Dog, Cat
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal da = d;
		d = (Dog)da;
		System.out.println(new StringBuffer("Ÿ�� ��ȯ ����: Animal -> Dog"));
		
		Animal c= new Cat();
		Dog d2 = (Dog)c; // Cat�� Dog Ÿ������ ��ȯ �Ұ�
		System.out.println(new StringBuffer("Ÿ�� ��ȯ ����?: Dog -> Cat"));
	}

}
