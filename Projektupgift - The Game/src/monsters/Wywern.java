package monsters;

public class Wywern extends MonsterAbstract {

	public Wywern(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Wywern", 250, 20, 20, 80, 1, 8, 15, difficulty);
		System.out.println("A wywern dives from the sky\nIiiiiiih\n");
	}
}
