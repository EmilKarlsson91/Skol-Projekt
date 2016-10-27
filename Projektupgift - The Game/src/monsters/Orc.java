package monsters;

public class Orc extends MonsterAbstract {

	public Orc(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Orc", 25, 40, 50, 100, 1, 2, 6, difficulty);
		System.out.println("A drunk orc tries to murder you with his club\nDie yu scum! *Hick*\n");
	}
}
