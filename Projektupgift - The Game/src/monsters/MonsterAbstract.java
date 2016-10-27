package monsters;

import main.AttackInterface;
import main.RandomHelper;

public class MonsterAbstract implements MonsterInterface, AttackInterface {

	private String name;
	private int healthPoints;
	private int maxHealthPoints;
	private int maxDamage;
	private int minDamage;
	private int experience;
	private int gold;
	private int toughness;

	public MonsterAbstract(String name, int healthPoints, int experience, int goldLower, int goldUpper, int toughness,
			int minDamage, int maxDamage, int difficulty) {
		// name, healthPoints, experience, goldLower, goldUpper, toughness
		this.name = name;
		this.healthPoints = (healthPoints * difficulty);
		this.experience = (experience * difficulty);
		this.gold = RandomHelper.getInt(goldLower, goldUpper);
		this.toughness = toughness;
		this.minDamage = (minDamage * difficulty);
		this.maxDamage = (maxDamage * difficulty);
		this.maxHealthPoints = (healthPoints * difficulty);
	}

	@Override
	public boolean isDead() {
		if (this.healthPoints <= 0)
			return true;
		else
			return false;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void takeDamage(int damage) {
		if (damage - this.toughness > 0)
			this.healthPoints -= (damage - this.toughness);
	}

	@Override
	public int getHealth() {
		return this.healthPoints;
	}

	@Override
	public int giveDamage() {
		return RandomHelper.getInt(this.minDamage, this.maxDamage);

	}

	@Override
	public int getExperience() {
		return this.experience;
	}

	@Override
	public int getToughness() {
		return this.toughness;
	}

	@Override
	public int getGold() {
		return this.gold;
	}

	@Override
	public int getMaxHealth() {
		return this.maxHealthPoints;
	}

}
