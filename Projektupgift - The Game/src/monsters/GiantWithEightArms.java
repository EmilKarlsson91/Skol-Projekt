package monsters;

public class GiantWithEightArms extends MonsterAbstract {

	public GiantWithEightArms() {
		// name, healthPoints, experience, goldLower, goldUpper, toughness,
		// minDamage, maxDamage
		super("Giant", 5000, 10000, 100, 300, 250, 200, 500, 1);
		System.out.println(
				"A giant with eight arms stumbles out of its cave!\n Aaargh, how dare you interupt my sleep?\n");
	}
}
