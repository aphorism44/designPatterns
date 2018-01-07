package strategyPatternRpg;

public class King extends Character {
	
	public King(String n) {
		super(n);
		this.setWeapon(new KnifeBehavior());
	}	
}