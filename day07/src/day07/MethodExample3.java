package day07;

public class MethodExample3 {
	/*
	 * ��ȯ ����(return type)
	 * 
	 * 1. ��ȯ ���� �޼��带 ȣ���� ������ �������ִ� return ���� ���� ���� �ǹ��� 2. �Ű� ������ �������� �Է¹��� �� ������
	 * ��ȯ���� ������ �ϳ����� �� 3. return Ű���带 ����� ��ȯ ���� ������ �� ���� 4. ������ ��ȯ���� �ڷ����� ��ȯ �����̶��
	 * �θ� 5. ��ȯ ���� �ִ� �޼���� ȣ�⹮ ��ġ�� �ϳ��� ���� ���޵Ǳ� ������ �����ѹ� ��� ����� �� ���� 6. ��ȯ ���� ���� �޼����
	 * void�� ����. �� ��, return ������ ���� ���� 7. ��� �޼���� return�� ������ ���� ��� ���� �бⰡ �ƴ� return
	 * ���� �ϴܿ��� �߰� �ڵ带 �ۼ��ϸ� ��� ��
	 */

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static void callMyName(String name) {
		// ���ڿ��� �迭�̹Ƿ� .length�� ���� ������ �� �� ����
		if (name.length() < 2) {
			System.out.println("�̸��� �ּ� 2���� �̻� �Է��ϼ���.");
			return;
		}
		System.out.println("�� �̸��� " + name + " �Դϴ�.");
	}
	
	// �迭 ���Ͻ� �ڷ������� �迭���� ����ؾ� ��
	public static int[] totalOperate(int n1, int n2) {
		int[] total = { n1+n2, n1-n2, n1*n2, n1/n2};
		return total;
	}

	public static void main(String[] args) {
		int result1 = add(3, 5);
		System.out.println(result1);
		
		// ���� �ڷᰡ �ִ� �Լ��� �����ѹ� ��� ����� �� ����
		int result2 = add(add(2, 4), add(5, 6));
		System.out.println(result2);
		
		int[] tot = totalOperate(20, 7);
		for (int i : tot) System.out.print(i + " ");
		
		System.out.println();
		
		callMyName("JAVA"); // ��ȯ ���� void�̸� return ���� ���� �� ��
		callMyName("C"); // ��ȯ ���� void�̸� return ���� ���� ��
	}

}
