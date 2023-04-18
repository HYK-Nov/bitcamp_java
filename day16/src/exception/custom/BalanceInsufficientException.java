package exception.custom;

/*
 * ����� ���� ���� Ŭ������ ������� Exception Ŭ������
 * RuntimeException Ŭ������ ��ӹ���
 */
public class BalanceInsufficientException extends RuntimeException{
	/*
	 * �Ϲ������� ����� ���� ���� Ŭ������ ���� ����
	 * �⺻ �����ڿ� ���� ���� �޼����� �޴� �����ڸ�
	 * �� �� �����ε��ؼ� ���� ����
	 */
	
	public BalanceInsufficientException() {};
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
