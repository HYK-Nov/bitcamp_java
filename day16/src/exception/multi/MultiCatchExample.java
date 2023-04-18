package exception.multi;

import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println(new StringBuffer("1��° ������: "));
			String data1 = scan.next();
			System.out.println(new StringBuffer("2��° ������: "));
			String data2 = scan.next();
			
			//NumberFormatException �߻� ����
			int i = Integer.parseInt(data1);
			int j = Integer.parseInt(data2);
			
			// ArithmeticException �߻� ����
			int result = i / j;
			System.out.println(new StringBuffer().append(i).append("/").append(j).append("=").append(result));
			
			// NullPointException �߻� ����
			String str = null;
			str.charAt(0); // ���ڿ� 0��° ���ڸ� �ε��� �ε� null
		} catch (NumberFormatException | NullPointerException e) {
			System.err.println(new StringBuffer("�����͸� ���ڸ� �־��ּ���."));
			System.err.println(new StringBuffer("�ƴϸ� ���ڸ� ����� ������ּ���."));
		} catch (ArithmeticException e) {
			System.err.println(new StringBuffer("0���� ���� �� ����"));
		}catch (Exception e) {
			System.err.println(new StringBuffer("�� �� ���� ���� �߻�"));
			System.err.println(new StringBuffer("������"));
		}finally {
			scan.close();
		}
	}

}
