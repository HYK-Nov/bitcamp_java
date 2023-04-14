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
		
		// 캐릭터 사망 여부 판단
		if(this.isInactive()) {
			showCharacterAlreadyDead(this.id);
			return;
		}
		
		// 몬스터 사망 여부 판단
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
		System.out.println("** " + this.id + " 이(가) 사망했습니다. **");
	}
	
	public void showCharacterAlreadyDead(String userId) {
		System.out.println("** " + userId + " 의 hp가 없으므로 행동할 수 없습니다. **");
	}
	
	public void showMonsterNowDead(String monsterName) {
		System.out.println("** " + this.id + " 이(가) " + monsterName + " 을(를) 처치했습니다. **");
	}
	
	public void showMonsterAlreadyDead(String monsterName) {
		System.out.println("** 이 " + monsterName + "은(는) 이미 죽어서 공격할 수 없습니다. **");
	}
	
	public void showCharacterAttack(Monster monster, int userDmg) {
		if (userDmg > 0) {
			if(userDmg > monster.getDef()) {
				System.out.println("** " + this.id + " 이(가) " + monster.getName() + " 에게 " + (userDmg-monster.getDef()) + " 데미지 을(를) 주었습니다. **");
			}else {
				System.out.println("** " + this.id + " 이(가) " + monster.getName() + " 에게 " + 1 + " 데미지 을(를) 주었습니다. **");
			}
		}else {
			System.out.println("** " + this.id + " 이(가) " + monster.getName() + " 에게 공격했으나 막았습니다. **");
		}
	}
}
