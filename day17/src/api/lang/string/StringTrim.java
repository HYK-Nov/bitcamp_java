package api.lang.string;

public class StringTrim {

	public static void main(String[] args) {
		// trim�� ����, �������� �ٸ� �ܾ ������ �������� ������ ���� ����
		String trimBefor = "             �Ž�����      ";
		System.err.println(trimBefor);
		String trimAfter = trimBefor.trim();
		System.out.println(trimAfter);
	}

}
