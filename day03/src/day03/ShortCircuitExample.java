package day03;

public class ShortCircuitExample {

	public static void main(String[] args) {
//		 * &, |�� ��� ����� Ȯ���ϰ� �Ѿ�� ������
//		 * ����ȿ���� �������Ƿ� �Ϲ����� ��Ȳ������ �� ������� ����.
		
		// ���� & 3/0�� ���� 1�̴� ��� ����(false & ?)
		// �̹� false Ȯ��������, 3/0�� �����Ͽ� ������ �߻�
//		System.out.println(false & (3/0 == 1));
		
		System.out.println((94 == 1) | (123 >= 122));
	}

}
