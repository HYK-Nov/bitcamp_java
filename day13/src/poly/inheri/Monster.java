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

	public boolean isInactive() {
		return (this.hp <= 0) ? true : false;
	}
	
	public boolean isInactiveAfterNextAttack(int userAtk) {
		return (this.hp - (userAtk - this.def)) <= 0 ? true : false;
	}
	
	public void setAttackedHp(int userAtk) {
		if(userAtk > 0) {
			if(userAtk > this.def) this.hp -= (userAtk - this.def);
			else this.hp -= 1;
		}else {
			this.hp -= 0;
		}
	}
	
	public int setAttackDamage(int userDef) {
		if(this.atk > 0) {
			if (this.atk > userDef) {
				return (this.atk - userDef);
			}else return 1;
		}else return 0;
	}
	
	public void showMonsterAttack(String id, int atkDmg) {	
		if(atkDmg > 0) {
			System.out.println("** " + this.getName() + " ��(��) " + id + " ���� "+ atkDmg + " �������� �־����ϴ�. **");
		}else
			System.out.println("** " + this.getName() + " ��(��) " + id + " ���� ���������� ���ҽ��ϴ�. **");
	}
	
}
