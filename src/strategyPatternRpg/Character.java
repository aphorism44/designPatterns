package strategyPatternRpg;

public class Character {
	
	protected String name;
	protected WeaponBehavior weapon;
	
	public Character(String n) {
		this.name = n;
	}
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	
	protected void performFightAction() {
		this.weapon.useWeapon();
	}
	
}
