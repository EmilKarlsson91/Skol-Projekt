package monsters;

public class Spider extends MonsterAbstract {

	public Spider(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Spider", 15, 20, 20, 80, 0, 2, 7, difficulty);
		System.out.println("A spider attack you\n");
	}
}
