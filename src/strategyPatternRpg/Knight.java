package strategyPatternRpg;

public class Knight extends Character {
	
	public Knight(String n) {
		super(n);
		this.setWeapon(new SwordBehavior());
	}	
}