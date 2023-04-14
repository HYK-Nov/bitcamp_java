package poly.noinheri;

public class Warrior {
	// �������� ����
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	public void showStatus() {
		System.out.println("----------------");
		System.out.println("���̵�: " + id);
		System.out.println("ü��: " + hp);
		System.out.println("���ݷ�: " + atk);
		System.out.println("����: " + def);
		System.out.println("����ġ: " + exp);
		System.out.println("----------------");
	}
	
	public void huntRabbit(Rabbit rabbit) {
		if (rabbit.getHp() <= 0) {
			System.out.println("** �̹� �׾ ������ �� �����ϴ�. **");
			return;
		}
		
		rabbit.setHp(rabbit.getHp() - this.atk);
		
		if (rabbit.getHp() <= 0) {
			System.out.println("** " + id + " ��(��) �䳢�� ����߽��ϴ�. **");
			this.exp += 5;
		}else {
			System.out.println("** " + id + " ��(��) �䳢�� �����߽��ϴ�. **");
		}
	}
	
	
	// ��� ���� �˻�
	// �� ���� �ް� Rat�� �׾��ٸ� ����ġ �ø��� �ݰ� ���� ����
	// ���ݹް� �������� �ݰݹ޾Ƽ� hp ����
	public void huntRat(Rat rat) {
		if (!rat.isRatActive()) {
			System.out.println("** �̹� �׾ ������ �� �����ϴ�. **");
			return;
		}
		
		if (!rat.isAttackedRatactive(this.atk)) {
			rat.setDamagedHp(this.atk);
			System.out.println("** " + id + " ��(��) �㸦 ����߽��ϴ�. **");
			this.exp += rat.getExp();
		}else {
			rat.setDamagedHp(this.atk);
			this.hp -= rat.getAtk();
			System.out.println("** " + id + " ��(��) �㸦 �����߽��ϴ�. **");
		}
	}
	
	public void huntPig(Pig pig) {
		if (!pig.isMonsterActive()) {
			System.out.println("** �̹� �׾ ������ �� �����ϴ�. **");
			return;
		}
		
		if (!pig.isAttackedMonsterActive(this.atk)) {
			pig.setDamagedHp(this.atk);
			System.out.println("** " + id + " ��(��) ������ ����߽��ϴ�. **");
			this.exp += pig.getExp();
		}else {
			pig.setDamagedHp(this.atk);
			this.hp -= pig.getAtk();
			System.out.println("** " + id + " ��(��) ������ �����߽��ϴ�. **");
		}
	}
	
	public void huntGhost(Ghost ghost) {
		if (!ghost.isMonsterActive()) {
			System.out.println("** �̹� �׾ ������ �� �����ϴ�. **");
			return;
		}
		
		if (!ghost.isAttackedMonsterActive(this.atk)) {
			ghost.setDamagedHp(this.atk);
			System.out.println("** " + id + " ��(��) ������ ����߽��ϴ�. **");
			this.exp += ghost.getExp();
		}else {
			ghost.setDamagedHp(this.atk);
			this.hp -= ghost.getAtk();
			System.out.println("** " + id + " ��(��) ������ �����߽��ϴ�. **");
		}
	}
	
}
