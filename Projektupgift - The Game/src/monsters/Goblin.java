package monsters;

public class Goblin extends MonsterAbstract {

	public Goblin(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Goblin", 10, 25, 10, 50, 0, 2, 3, difficulty);
		System.out.println("A tiny goblin tries to run away from you, but you are faster\nPlease dont kill me!\n");
	}
}
