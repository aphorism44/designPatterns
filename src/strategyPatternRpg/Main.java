package strategyPatternRpg;

public class Main {
	public static void main(String[] args) {
		
		King king = new King("Charlemagne");
		Queen queen = new Queen("Eleanor");
		Knight knight = new Knight("Gawain");
		Troll troll = new Troll("Hruug");
		
		
		king.performFightAction();
		king.setWeapon(new SwordBehavior());
		king.performFightAction();
		
		queen.performFightAction();
		
		knight.performFightAction();
		
		troll.performFightAction();
		troll.setWeapon(new KnifeBehavior());
		troll.performFightAction();
		
	}
}
