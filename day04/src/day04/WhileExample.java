package day04;

public class WhileExample {
	public static void main(String[] args) {
		int count = 0; // while �ݺ��� ���� �ľ��� ���� ����
		
		while(count < 3){
			count++;
			System.out.println("While�� �������Դϴ�. " + count);
		}
		
		count = 0;
		
		while(count <= 5) {
			System.out.println("test " + count);
			count++;
		}
	}
}
