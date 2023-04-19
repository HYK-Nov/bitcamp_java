package api.lang.stringb;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuffer�� ��ü ����
		StringBuilder sb = new StringBuilder("JAVA");
		
		// ���ڿ� ���� �߰��ϴ� �޼��� append()
		sb.append(" Program Study"); // sb + " Program Study"�� ����
		System.out.println(sb);
		
		// ���ڿ��� Ư�� �ε��� ��ġ�� �����ϴ� �޼��� insert()
		sb.insert(12, "ming");
		System.out.println(sb);
		
		// Ư�� �ε��� ���� ���ڿ��� ��ü�ϴ� �޼��� replace()
		sb.replace(5, 16, "book");
		System.out.println(sb);
		
		// ���ڿ��� �����ϴ� �޼��� delete(begin, end)
		// JAVA Study
		sb.delete(4, 9);
		System.out.println(sb);
		
		System.out.println(sb.length());
	}

}
