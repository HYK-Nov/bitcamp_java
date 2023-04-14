package poly.noinheri;

public class Rat {
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Rat() {
		this.hp = 5;
		this.atk = 1;
		this.def = 0;
		this.exp = 80;
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

	// ���� ��� ���θ� boolean���� üũ���ִ� getter
	public boolean isRatActive() {
		return hp > 0 ? true : false;
	}
	
	public boolean isAttackedRatactive(int atk) {
		return (hp - atk) > 0 ? true : false;
	}
	
	// 
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - userAtk;
	}
	
}
