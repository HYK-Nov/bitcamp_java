package exception.throw_;

public class ThrowExample {
	
	public static int calcSum(int n) throws Exception{
		/*
		 * ���α׷��� throw ������ ������ ���� ���ܸ� ��� �߻���Ű��
		 * �ش� ���ܸ� ó������ catch ����� �ִ��� �˻�
		 */
		if (n <= 0) {
			throw new Exception(); // ���ܵ� Ŭ������ ���ǵǱ� ������ �ν��Ͻ� ����
		}
		
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		try {
			int result1 = calcSum(100);
			System.out.println(new StringBuffer("1~100������ ������: ").append(result1));
			
			int result2 = calcSum(-100);
			System.out.println(new StringBuffer("1~-100������ ������: ").append(result2));
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(new StringBuffer("�Ű����� ����� �������ּ���."));
		}
	}
}
