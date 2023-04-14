package poly.noinheri;

public class Magician {
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Magician(String id) {
		this.id = id;
		this.hp = 12;
		this.atk = 5;
		this.def = 1;
		this.exp = 0;
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
	
	public void huntRabbit(Rabbit rabbit) {
		if (rabbit.getHp() <= 0) {
			System.out.println("** 이미 죽어서 공격할 수 없습니다. **");
			return;
		}
		
		rabbit.setHp(rabbit.getHp() - this.atk);
		
		if (rabbit.getHp() <= 0) {
			System.out.println("**" + id + " 이(가) 토끼를 사냥했습니다. **");
			this.exp += 5;
		}else {
			System.out.println("**" + id + " 이(가) 토끼를 공격했습니다. **");
		}
	}
	
	public void huntRat(Rat rat) {
		if (!rat.isRatActive()) {
			System.out.println("** 이미 죽어서 공격할 수 없습니다. **");
			return;
		}
		
		if (!rat.isAttackedRatactive(this.atk)) {
			rat.setDamagedHp(this.atk);
			System.out.println("** " + id + " 이(가) 쥐를 사냥했습니다. **");
			this.exp += rat.getExp();
		}else {
			rat.setDamagedHp(this.atk);
			this.hp -= rat.getAtk();
			System.out.println("** " + id + " 이(가) 쥐를 공격했습니다. **");
		}
	}
	
	public void huntPig(Pig pig) {
		if (!pig.isMonsterActive()) {
			System.out.println("** 이미 죽어서 공격할 수 없습니다. **");
			return;
		}
		
		if (!pig.isAttackedMonsterActive(this.atk)) {
			pig.setDamagedHp(this.atk);
			System.out.println("** " + id + " 이(가) 돼지를 사냥했습니다. **");
			this.exp += pig.getExp();
		}else {
			pig.setDamagedHp(this.atk);
			this.hp -= pig.getAtk();
			System.out.println("** " + id + " 이(가) 돼지를 공격했습니다. **");
		}
	}
	
	public void huntGhost(Ghost ghost) {
		if (!ghost.isMonsterActive()) {
			System.out.println("** 이미 죽어서 공격할 수 없습니다. **");
			return;
		}
		
		if (!ghost.isAttackedMonsterActive(this.atk)) {
			ghost.setDamagedHp(this.atk);
			System.out.println("** " + id + " 이(가) " + "을 사냥했습니다. **");
			this.exp += ghost.getExp();
		}else {
			ghost.setDamagedHp(this.atk);
			this.hp -= ghost.getAtk();
			System.out.println("** " + id + " 이(가) 유령을 공격했습니다. **");
		}
	}
}
