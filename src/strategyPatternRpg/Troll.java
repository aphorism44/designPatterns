package strategyPatternRpg;

public class Troll extends Character {
	
	public Troll(String n) {
		super(n);
		this.setWeapon(new AxeBehavior());
	}	
}