package exception.custom;

public class Account {
	
	private long balance;

	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) throws DepositMinusMoneyException{
		if (money < 0) {
			throw new DepositMinusMoneyException("입금 불가");
		}
		this.balance += money;
	}
	
	public void withDraw(int money) throws BalanceInsufficientException{
		if (this.balance < money) {
			throw new BalanceInsufficientException("잔고 부족");
		}
		this.balance -= money;
	}
}
