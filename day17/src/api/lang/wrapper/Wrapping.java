package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {
	
	public static void main(String[] args) {
		int a = 100;
		double b = 2.41;
		char c = 'H';
		boolean d = false;
		
		// Wrapping: �⺻ Ÿ���� ������ Ÿ������ �����
						// ��Ҽ�: deprecated(��� ����)
		Integer val1 = a; // new Integer(a); // 100;
		Double val2 = b; // 2.41
		Character val3 = c; // H
		Boolean val4 = d; // false
		Byte val5 = (byte)75;
		
		Object[] arr = {val1, val2, val3, val4, val5};
		System.out.println(Arrays.toString(arr));
		
		// Unwrapping: ���� Ŭ������ �ٽ� �⺻�� �ڷ�� ������
		// .�ڷ���Value() �޼��带 Ȱ��
		int i = val1.intValue();
		double j = val2.doubleValue();
		char k = val3.charValue();
		boolean x = val4.booleanValue();
		byte y = val5.byteValue();
		 
	}
}
