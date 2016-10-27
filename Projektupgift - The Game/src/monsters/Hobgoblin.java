package monsters;

public class Hobgoblin extends MonsterAbstract {

	public Hobgoblin(int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Hobgoblin", 20, 20, 20, 80, 1, 1, 3, difficulty);
		System.out.println(
				"A Hobgoblin tries to sneak up from behind, but you hear it\nDamn it, my sneaky skills isn't enough!\n");
	}

}
