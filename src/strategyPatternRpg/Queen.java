package strategyPatternRpg;

public class Queen extends Character {
	
	public Queen(String n) {
		super(n);
		this.setWeapon(new BowAndArrowBehavior());
	}	
}