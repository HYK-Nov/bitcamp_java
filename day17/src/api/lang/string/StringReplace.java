package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {
		/*
		 * �ڹ� 15�������� ��Ƽ���� ���ڿ��� ������ 
		 * �ڹ� ���ڿ��� ���ݴ� ""�� �� �ٿ� �ۼ��ؾ��߾���
		 * String a = "�����ٶ�"; (���)
		 * String b = "������
		 *                 �󸶹�"; (������)
		 * ���ݴ� ����ǥ�� ���� �ٿ� ���ļ� �ۼ��� ���� """ �� ���� �̿�
		 */
		String notice = """
				1. ���
				2. �¿�
				3. ���
				4. �Ͽ�
				""";
		
		System.out.println(notice);
		// replace()�� String�� �����ϰ�, ù �ܾ �� ��° �ܾ�� �ٲ���
		String newNotice = notice.replace("��", "�դ�����");
		System.out.println(newNotice);
	}

}
