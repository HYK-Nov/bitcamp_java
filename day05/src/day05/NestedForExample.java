package day05;

public class NestedForExample {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("*"); // println (X) -> print (O)
			}// ���� for��(j)
			
			System.out.println(); // �� �ٲ޸� ����
		} // �ܺ� for��(i)
	}

}
