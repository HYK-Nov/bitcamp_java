package poly.inheri;

public class Character {
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	private String skill;
	private int skd;
	
	public Character(String id, int hp, int atk, int def, int exp, String skill, int skd) {
		this.id = id;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
		this.skill = skill;
		this.skd = skd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getSkd() {
		return skd;
	}

	public void setSkd(int skd) {
		this.skd = skd;
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
	
	// �Ķ���ͷ� ��� ������ �θ��� Monster�� �����ϸ�
	// ������ ������ ���ؼ� ��ӹ��� ��� ���Ͱ� ���� ����
	public void hunt(Monster monster) {
		System.out.println();
		
		if(this.hp <= 0) {
			System.out.println("** " + this.id + " �� hp�� �����Ƿ� �ൿ�� �� �����ϴ�. **"); 
			return;
		}
		
		if (!monster.isMonsterActive()) {
			System.out.println("** �� ���ʹ� �̹� �׾ ������ �� �����ϴ�. **");
			return;
		}
		
		System.out.println("** " + this.id + " ��(��) " + monster.getName() + 
				" ��(��) �����Ͽ� " + (this.atk-monster.getDef()) + " �������� �־����ϴ�. **");
		
		if (!monster.isAttackedMonsterActive(this.atk)) {
			monster.setDamagedHp(this.atk);
			System.out.println("** " + this.id + " ��(��) " + monster.getName() + " ��(��) �׿����ϴ�. **");
			this.exp += monster.getExp();
		}else {
			monster.setDamagedHp(this.atk);
			this.hp -= (monster.getAtk() - this.def);
			System.out.println("** " + monster.getName() + " ��(��) " + this.id + " ���� "+ (monster.getAtk()-this.def) + " �������� �־����ϴ�. **");
		}
	}
	
	public void skill(Monster monster) {
		System.out.println();
		
		if(this.hp <= 0) {
			System.out.println("** " + this.id + " �� hp�� �����Ƿ� �ൿ�� �� �����ϴ�. **"); 
			return;
		}
		
		if (!monster.isMonsterActive()) {
			System.out.println("** �� ���ʹ� �̹� �׾ ������ �� �����ϴ�. **");
			return;
		}
		
		System.out.println("** " + this.id + " ��(��) " + monster.getName() + 
				" ���� " + this.skill + " ��(��) ������ " + (this.skd-monster.getDef()) + " �������� �־����ϴ�. **");
		
		if (!monster.isAttackedMonsterActive(this.skd)) {
			monster.setDamagedHp(this.skd);
			System.out.println("** " + this.id + " ��(��) " + monster.getName() + " ��(��) �׿����ϴ�. **");
			this.exp += monster.getExp();
		}else {
			monster.setDamagedHp(this.skd);
			this.hp -= (monster.getAtk()-this.def);
			System.out.println("** " + monster.getName() + " ��(��) " + this.id + " ���� "+
			(monster.getAtk()-this.def) + " �������� �־����ϴ�. **");
		}
	}
}
