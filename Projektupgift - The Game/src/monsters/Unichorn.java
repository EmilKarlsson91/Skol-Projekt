package monsters;

public class Unichorn extends MonsterAbstract {

	public Unichorn(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Unichorn", 80, 20, 20, 80, 8, 10, 14, difficulty);
		System.out.println("A unichorn charges from a nearby field\nEeeeehehehehe\n");
	}
}
