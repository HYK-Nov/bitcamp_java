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
		System.out.println("아이디: " + id);
		System.out.println("체력: " + hp);
		System.out.println("공격력: " + atk);
		System.out.println("방어력: " + def);
		System.out.println("경험치: " + exp);
		System.out.println("----------------");
	}
	
	// 파라미터로 모든 몬스터의 부모인 Monster를 선언하면
	// 다형성 원리에 의해서 상속받은 모든 몬스터가 대입 가능
	public void hunt(Monster monster) {
		System.out.println();
		
		if(this.hp <= 0) {
			System.out.println("** " + this.id + " 의 hp가 없으므로 행동할 수 없습니다. **"); 
			return;
		}
		
		if (!monster.isMonsterActive()) {
			System.out.println("** 이 몬스터는 이미 죽어서 공격할 수 없습니다. **");
			return;
		}
		
		System.out.println("** " + this.id + " 이(가) " + monster.getName() + 
				" 을(를) 공격하여 " + (this.atk-monster.getDef()) + " 데미지를 주었습니다. **");
		
		if (!monster.isAttackedMonsterActive(this.atk)) {
			monster.setDamagedHp(this.atk);
			System.out.println("** " + this.id + " 이(가) " + monster.getName() + " 을(를) 죽였습니다. **");
			this.exp += monster.getExp();
		}else {
			monster.setDamagedHp(this.atk);
			this.hp -= (monster.getAtk() - this.def);
			System.out.println("** " + monster.getName() + " 이(가) " + this.id + " 에게 "+ (monster.getAtk()-this.def) + " 데미지를 주었습니다. **");
		}
	}
	
	public void skill(Monster monster) {
		System.out.println();
		
		if(this.hp <= 0) {
			System.out.println("** " + this.id + " 의 hp가 없으므로 행동할 수 없습니다. **"); 
			return;
		}
		
		if (!monster.isMonsterActive()) {
			System.out.println("** 이 몬스터는 이미 죽어서 공격할 수 없습니다. **");
			return;
		}
		
		System.out.println("** " + this.id + " 이(가) " + monster.getName() + 
				" 에게 " + this.skill + " 을(를) 시전해 " + (this.skd-monster.getDef()) + " 데미지를 주었습니다. **");
		
		if (!monster.isAttackedMonsterActive(this.skd)) {
			monster.setDamagedHp(this.skd);
			System.out.println("** " + this.id + " 이(가) " + monster.getName() + " 을(를) 죽였습니다. **");
			this.exp += monster.getExp();
		}else {
			monster.setDamagedHp(this.skd);
			this.hp -= (monster.getAtk()-this.def);
			System.out.println("** " + monster.getName() + " 이(가) " + this.id + " 에게 "+
			(monster.getAtk()-this.def) + " 데미지를 주었습니다. **");
		}
	}
}
