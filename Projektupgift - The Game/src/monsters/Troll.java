package monsters;

public class Troll extends MonsterAbstract {

	public Troll(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Troll", 30, 20, 20, 80, 0, 1, 3, difficulty);
		System.out.println("A troll emerges from the swamp\nMe will crush you wid me rock!\n");
	}
}
