package api.lang.string;

public class StringSubstring {

	public static void main(String[] args) {
		// �ֹι�ȣ ���
		String ssn = "991231-1234567";
		System.out.println(ssn);
		
		/*
		 * - subString() �޼��忡 �Ű� ������ �ε����� 1�� ������
		 *   �ش� �ε������� ������ �������� ���� ����
		 */
		String last = ssn.substring(7);
		System.out.println(last);
		
		/*
		 * - subString() �޼��忡 �Ű� ������ �ε����� 2�� ������
		 *   ù ��° �Ű� �� �̻� �� ��° �Ű��� �̸� ���� ���ڸ� ����
		 */
		String first = ssn.substring(0, 6);
		System.out.println(first);
	}

}
