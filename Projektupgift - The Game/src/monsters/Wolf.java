package monsters;

public class Wolf extends MonsterAbstract {

	public Wolf(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Wolf", 165, 20, 20, 80, 1, 9, 12, difficulty);
		System.out.println("A wold smells your blood\nMoooorh\n");
	}
}
