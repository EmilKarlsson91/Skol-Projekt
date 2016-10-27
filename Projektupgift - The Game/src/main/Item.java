package main;

/**
 * A class that creates a instance of an item
 * 
 * @author Emil Karlsson
 *
 */
public class Item {

	private String name;
	private int toughness;
	private int strength;
	private int cost;

	/**
	 * A constructor that creates an item
	 * 
	 * @param name
	 * @param strength
	 * @param toughness
	 * @param cost
	 */
	public Item(String name, int strength, int toughness, int cost) {
		this.name = name;
		this.strength = strength;
		this.toughness = toughness;
		this.cost = cost;
	}

	/**
	 * A method that gets the name of the item
	 * 
	 * @return name of item
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * A method that gets the strength of the item
	 * 
	 * @return strength of item
	 */
	public int getStrength() {
		return this.strength;
	}

	/**
	 * A method that gets the toughness of the item
	 * 
	 * @return item toughness
	 */
	public int getToughness() {
		return this.toughness;
	}

	/**
	 * A method that gets the cost of the item
	 * 
	 * @return item cost
	 */
	public int getCost() {
		return this.cost;
	}
}
