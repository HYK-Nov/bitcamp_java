package api.lang.string;

public class StringIndexOf {
	
	public static void main(String[] args) {
		// Ư�� ���ڿ��� ���� �ε��� ���� ��ȯ
		String to = "tomatoes";
		
		// ���� �Ķ���ͷ� ��ȸ�� �� ��� 0������ ���� ����� �ܾ� �ϳ��� ��ȸ
		System.out.println(to.indexOf("to"));

		// �� ��° �Ķ���ͷ� ��ȸ ���� �Ķ���͸� ������ �� ����
		System.out.println(to.indexOf("to", to.indexOf("to")+1));
		
		// ���� �ܾ� ��ȸ�� -1�� ����
		System.out.println(to.indexOf("na"));
	}
}
