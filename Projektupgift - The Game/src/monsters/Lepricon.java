package monsters;

public class Lepricon extends MonsterAbstract {

	public Lepricon(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Lepricon", 12, 20, 20, 80, 1, 2, 3, difficulty);
		System.out.println("A Lepricon stands in your way\nRun and flee you coward!\n");
	}
}
