package poly.inheri;

public class Monster {
	
	// ��� ���� Ŭ������ �θ�� ����
	private String name; // �°� Ÿ���� �� ���� �� �ִ� ������ Ư���� ���� ���� �ĺ���
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// �θ��� �����ڷ� �ʱ�ȭ�� �� � ���Ͱ� �������� ������ �� �� �����Ƿ�
	// �������� �ƴ� �Է��ڷḦ �޾� ó���ؾ� �ϱ� ����
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void showStatus() {
		System.out.println("----------------");
		System.out.println("�̸�: " + this.name);
		System.out.println("ü��: " + this.hp);
		System.out.println("���ݷ�: " + this.atk);
		System.out.println("����: " + this.def);
		System.out.println("----------------");
	}

	public boolean isMonsterActive() {
		return this.hp > 0 ? true : false;
	}
	
	public boolean isAttackedMonsterActive(int atk) {
		return (this.hp - (atk-this.def)) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk-this.def);
	}
	
}
