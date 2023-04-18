package exception.custom;

public class MainClass {
	public static void main(String[] args) {
		Account acc = new Account();

		try {
			acc.deposit(100000);
			System.out.println(new StringBuffer("�Ա� �� �ܾ�: ").append(acc.getBalance()).append("��"));
			acc.withDraw(1000000);
		} catch (BalanceInsufficientException e) {
			/*
			 * ���� Ŭ������ �����ϴ� getMessage() �޼����
			 * ������ ���� �޽����� StringŸ������ ������
			 * �ڹ� ǥ�� API���� �����ϴ� �پ��� ����Ŭ��������
			 * ������ ���� ���� �޽����� �⺻������ ��ü �ȿ�
			 * ����Ǿ� ����
			 */
			e.printStackTrace();
			System.err.println(e.getMessage());
		}catch (DepositMinusMoneyException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		System.out.println(new StringBuffer("��� �� �ܾ�: ").append(acc.getBalance()).append("��"));
	}
}
