package poly.inheri;

public class Character {
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	private int skd;
	
	public Character(String id, int hp, int atk, int def, int exp) {
		this.id = id;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
		this.skd = atk * 2;
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
		
		// ĳ���� ��� ���� �Ǵ�
		if(this.isInactive()) {
			showCharacterAlreadyDead(this.id);
			return;
		}
		
		// ���� ��� ���� �Ǵ�
		if (monster.isInactive()) {
			showMonsterAlreadyDead(monster.getName());
			return;
		}
		
		resultAttack(monster, this.atk);
	}
	
	public boolean isInactive() {
		return (this.hp <= 0) ? true : false;
	}
	
	public void gainExp(int monsterExp) {
		this.exp += monsterExp;
	}
	
	public void setAttackedHp(int dmg) {
		this.hp -= dmg;
		
		if(this.isInactive()) {
			showCharacterNowDead(this.id);
		}
	}
	
	public void resultAttack(Monster monster, int userDmg) {
		showCharacterAttack(monster, userDmg);
		
		if (monster.isInactiveAfterNextAttack(userDmg)) {
			monster.setAttackedHp(userDmg);
			showMonsterNowDead(monster.getName());
			gainExp(monster.getExp());
		}else {
			monster.setAttackedHp(userDmg);
			monster.showMonsterAttack(this.id, monster.setAttackDamage(this.def));
			this.setAttackedHp(monster.setAttackDamage(this.def));
		}
	}
	
	public void showCharacterNowDead(String userId) {
		this.hp = 0;
		System.out.println("** " + this.id + " ��(��) ����߽��ϴ�. **");
	}
	
	public void showCharacterAlreadyDead(String userId) {
		System.out.println("** " + userId + " �� hp�� �����Ƿ� �ൿ�� �� �����ϴ�. **");
	}
	
	public void showMonsterNowDead(String monsterName) {
		System.out.println("** " + this.id + " ��(��) " + monsterName + " ��(��) óġ�߽��ϴ�. **");
	}
	
	public void showMonsterAlreadyDead(String monsterName) {
		System.out.println("** �� " + monsterName + "��(��) �̹� �׾ ������ �� �����ϴ�. **");
	}
	
	public void showCharacterAttack(Monster monster, int userDmg) {
		if (userDmg > 0) {
			if(userDmg > monster.getDef()) {
				System.out.println("** " + this.id + " ��(��) " + monster.getName() + " ���� " + (userDmg-monster.getDef()) + " ������ ��(��) �־����ϴ�. **");
			}else {
				System.out.println("** " + this.id + " ��(��) " + monster.getName() + " ���� " + 1 + " ������ ��(��) �־����ϴ�. **");
			}
		}else {
			System.out.println("** " + this.id + " ��(��) " + monster.getName() + " ���� ���������� ���ҽ��ϴ�. **");
		}
	}
}
