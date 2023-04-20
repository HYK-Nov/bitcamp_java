package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date(); // java.util.Date
		System.out.println(date);
		
		Date date2 = new Date(122, 10 , 9, 18, 30, 0);
		System.out.println(date2);
		
		// ��¥ ��� �ٲٱ�
		// 1. SimpleDateFormat ��ü�� �����ϴµ�, ǥ������� �־� ����
		// ����) 2023�� 4�� 20�� 10�� 09�� 28�� �������� ��� ����
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		// 2. sdf.format(DateŸ�Ժ���); �� �־ �ֿܼ� ���
//		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf = new SimpleDateFormat("������ E�����Դϴ�. ������ 1���� D��° ���Դϴ�.");
		System.out.println(sdf.format(date));
	}

}
