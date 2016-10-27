package main;

import java.util.ArrayList;

/**
 * A class to represent a player in the game
 * 
 * @author Emil Karlsson
 *
 */

public class Player implements PlayerInterface, AttackInterface {

	private ArrayList<Item> itemList = new ArrayList<Item>();
	private String name;
	private int maxHealthPoints;
	private int healthPoints;
	private int maxDamage;
	private int minDamage;
	private int expToNextLvl;
	private int experience;
	private int level;
	private int gold;
	private int strength;
	private int toughness;

	/**
	 * A constructor for the class
	 * 
	 * @param name
	 *            the name of the player
	 * 
	 */

	public Player(String name) {
		this.name = name;
		this.maxHealthPoints = 15;
		this.healthPoints = 15;
		this.expToNextLvl = 50;
		this.experience = 0;
		this.level = 1;
		this.gold = 1000;
		this.strength = 1;
		this.toughness = 2;
		this.maxDamage = 5;
		this.minDamage = 2;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getMaxHealth() {
		return this.maxHealthPoints;
	}

	@Override
	public void takeDamage(int damage) {
		if (damage - this.toughness > 0)
			this.healthPoints -= (damage - this.toughness);
	}

	@Override
	public void setHealthToMax() {
		this.healthPoints = this.maxHealthPoints;
	}

	@Override
	public int getHealth() {
		return this.healthPoints;
	}

	@Override
	public int getMinDamage() {
		return this.minDamage;
	}

	@Override
	public int getMaxDamage() {
		return this.maxDamage;
	}

	@Override
	public int giveDamage() {
		return RandomHelper.getInt(this.minDamage, this.maxDamage);
	}

	@Override
	public int expToNextLvl() {
		return this.expToNextLvl;
	}

	@Override
	public void giveExperience(int experience) {
		this.experience += experience;
	}

	@Override
	public int getExpToNextLvl() {
		return this.expToNextLvl;
	}

	@Override
	public int getExperience() {
		return this.experience;
	}

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public void addStrength(int strengh) {
		this.strength += strength;
	}

	@Override
	public int getStrength() {
		return this.strength;
	}

	@Override
	public void addToughness(int toughness) {
		this.toughness += toughness;
	}

	@Override
	public int getToughness() {
		return this.toughness;
	}

	@Override
	public void addGold(int gold) {

		this.gold += gold;
	}

	@Override
	public void removeGold(int gold) {

		this.gold -= gold;
	}

	@Override
	public int getGold() {
		return this.gold;
	}

	@Override
	public void strengthToDamage() {

		this.minDamage = (this.strength * 2) + 2;
		this.maxDamage = (this.strength * 3) + 5;
	}

	@Override
	public boolean isDead() {
		if (this.healthPoints <= 0)
			return true;
		else
			return false;
	}

	@Override
	public void levelUp() {
		if (this.experience >= this.expToNextLvl) {
			this.expToNextLvl *= 2;
			this.strength *= 2;
			this.maxHealthPoints *= 2;
			this.level++;
			setHealthToMax();
			strengthToDamage();
			System.out.println("Congratulations you reached the " + this.level + " level!");
		}
	}

	@Override
	public void giveItems(Item item) {
		itemList.add(item);
		this.gold -= item.getCost();
		this.strength += item.getStrength();
		this.toughness += item.getToughness();
		strengthToDamage();

	}

	@Override
	public void getItems() {
		for (int i = 1; i <= itemList.size(); i++) {
			System.out.println(i + ": " + itemList.get(i - 1).getName() + ", strength: "
					+ itemList.get(i - 1).getStrength() + ", toughness: " + itemList.get(i - 1).getToughness());
		}

	}
}
