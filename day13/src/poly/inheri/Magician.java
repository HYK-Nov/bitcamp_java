package poly.inheri;

public class Magician extends Character{
	
	public Magician(String id) {
		super(id, 20, 2, 0, 0);
	}
	
	public void castFireball(Monster monster) {
		System.out.println();
		
		if(this.isInactive()) {
			showCharacterAlreadyDead(super.getId());
			return;
		}
		
		if (monster.isInactive()) {
			showMonsterAlreadyDead(monster.getName());
			return;
		}
		
		resultAttack(monster, super.getSkd());
	}
	
}
