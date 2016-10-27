package main;

/**
 * A interface for the Player class
 * 
 * @author Emil Karlsson
 *
 */

public interface PlayerInterface {

	/**
	 * Sets the name of the player according to scanner.
	 * 
	 * @param name
	 */
	public void setName(String name);

	/**
	 * Returns name of the player
	 * 
	 * @return name of the player
	 */
	public String getName();

	/**
	 * Returns the players maximum health
	 * 
	 * @return players max health
	 */
	public int getMaxHealth();

	/**
	 * Makes so that the player takes damage
	 * 
	 * @param damage
	 */
	public void takeDamage(int damage);

	/**
	 * Sets the health to new value.
	 * 
	 * @param health
	 */
	public void setHealthToMax();

	/**
	 * Returns current health.
	 * 
	 * @return health
	 */
	public int getHealth();

	/**
	 * Returns the players minimum damage
	 * 
	 * @return minDamage
	 */
	public int getMinDamage();

	/**
	 * Returns the players maximum damage
	 * 
	 * @return maxDamage
	 */
	public int getMaxDamage();

	/**
	 * Returns the amount of damage the player does
	 * 
	 * @return damage of player
	 */
	public int giveDamage();

	/**
	 * Returns the experience needed for next level.
	 * 
	 * @return expToNextLevel.
	 */
	public int expToNextLvl();

	/**
	 * Adds experience to the player.
	 */
	public void giveExperience(int experience);

	/**
	 * Returns the amount of experience needed for the next level.
	 * 
	 * @return expToNextLvl
	 *
	 */
	public int getExpToNextLvl();

	/**
	 * Returns current experience for the player.
	 * 
	 * @return experience
	 */
	public int getExperience();

	/**
	 * Returns the level of the player.
	 * 
	 * @return level
	 */
	public int getLevel();

	/**
	 * Sets the strength of the player.
	 */
	public void addStrength(int strengh);

	/**
	 * Returns the strength of the player.
	 * 
	 * @return strength
	 */
	public int getStrength();

	/**
	 * Sets the toughness of the player.
	 */
	public void addToughness(int toughness);

	/**
	 * Returns the amount of toughness the player have
	 * 
	 * @return toughness of player
	 */
	public int getToughness();

	/**
	 * Adds the amount of gold specified.
	 * 
	 * @param gold
	 */
	public void addGold(int gold);

	/**
	 * Removes the amount of gold specified.
	 * 
	 * @param gold
	 */
	public void removeGold(int gold);

	/**
	 * Returns the amount of gold the player currently has.
	 * 
	 * @return
	 */
	public int getGold();

	/**
	 * Converts strength to damage.
	 */
	public void strengthToDamage();

	/**
	 * Checks if the player is alive.
	 * 
	 * @return boolean
	 */
	public boolean isDead();

	/**
	 * Checks if the player should level up or not and increases attributes.
	 * 
	 */
	public void levelUp();

	/**
	 * Gives the player an item from the shop.
	 * 
	 * @param item
	 *            from shop.
	 */
	public void giveItems(Item item);

	/**
	 * Prints a list of the players current items.
	 */
	public void getItems();

}
