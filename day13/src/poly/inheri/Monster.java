package poly.inheri;

public class Monster {
	
	// 모든 몬스터 클래스의 부모로 설계
	private String name; // 온갖 타입을 다 받을 수 있는 다형성 특성상 몬스터 종류 식별용
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// 부모쪽 생성자로 초기화할 때 어떤 몬스터가 생성될지 사전에 알 수 없으므로
	// 고정값이 아닌 입력자료를 받아 처리해야 하기 때문
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
		System.out.println("이름: " + this.name);
		System.out.println("체력: " + this.hp);
		System.out.println("공격력: " + this.atk);
		System.out.println("방어력: " + this.def);
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
			System.out.println("** " + this.getName() + " 이(가) " + id + " 에게 "+ atkDmg + " 데미지를 주었습니다. **");
		}else
			System.out.println("** " + this.getName() + " 이(가) " + id + " 에게 공격했으나 막았습니다. **");
	}
	
}
