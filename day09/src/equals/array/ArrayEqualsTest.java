package equals.array;

import java.util.Arrays;

public class ArrayEqualsTest {

	public static void main(String[] args) {
		// �迭�� ������ �����̱� ������, �ܼ� ���Խ� ������ �߻�
		int[] intArray1 = {1, 2, 3, 4, 5};
		System.out.println("�迭 �ּ�: " + intArray1);
		System.out.println(Arrays.toString(intArray1));
		System.out.println("----------------------------");
		// ���� �������� �ʰ�, intArray1�� ���Թ޴� intArray2
		// �ܼ� �������� �ּҸ� �����ϴ� ��츦 ���� ������ ��
		// int[] intArray2 = intArray1;
		
		// ���� �ڷḦ ���� �Ȱ��� �Ҵ��ϴ� ���縦 ���� ������ ��
		// ���� �ڿ� .clone()�� �Ἥ ������
		int[] intArray2 = intArray1;
		intArray1[0] = 100;
		System.out.println(Arrays.toString(intArray1));
		System.out.println(Arrays.toString(intArray2));
		System.out.println("�迭2 �ּ�: " + intArray2);
	}

}
