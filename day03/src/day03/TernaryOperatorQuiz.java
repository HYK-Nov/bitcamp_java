package day03;

public class TernaryOperatorQuiz {

	public static void main(String[] args) {
		// ���� �߻� ��ɾ� Math.random()�� ȣ�� ��ġ��
		// 0 ���ٴ� ũ�� 1���� ���� ������ �߻�
		int randomNumber = (int)(Math.random()*10);
		
		String result = (randomNumber > 7) ? "��÷" : "��÷";
		
		System.out.println(result);
	}

}
