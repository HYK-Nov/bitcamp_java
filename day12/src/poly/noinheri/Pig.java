package poly.noinheri;

public class Pig extends Monster{
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Pig() {
		this.name = "µÅÁö";
		this.hp = 10;
		this.atk = 3;
		this.def = 0;
		this.exp = 120;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isMonsterActive() {
		return hp > 0 ? true : false;
	}
	
	public boolean isAttackedMonsterActive(int atk) {
		return (hp - atk) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - userAtk;
	}
	
}
