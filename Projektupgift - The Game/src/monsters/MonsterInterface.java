package monsters;

/**
 * 
 * Class that creates a intance of a monster
 * 
 * @author Emil Karlsson
 *
 */
public interface MonsterInterface {

	/**
	 * Returns status of monster
	 * 
	 * @return true or false
	 */
	public boolean isDead();

	/**
	 * Returns name of the monster
	 * 
	 * @return name of the monster
	 */
	public String getName();

	/**
	 * Makes so that the monster takes damage
	 * 
	 * @param damage
	 */
	public void takeDamage(int damage);

	/**
	 * Returns the monsters maximum health
	 * 
	 * @return monsters max health
	 */
	public int getMaxHealth();

	/**
	 * Returns the amount of health the monster currently have
	 * 
	 * @return monster health
	 */
	public int getHealth();

	/**
	 * Returns the amount of damage the monster does
	 * 
	 * @return damage of monster
	 */
	public int giveDamage();

	/**
	 * Returns amount of experience the monster gives
	 * 
	 * @return experience monster gives
	 */
	public int getExperience();

	/**
	 * Returns the amount of toughness the monster have
	 * 
	 * @return toughness of monster
	 */
	public int getToughness();

	/**
	 * Returns the amount of gold the monster gives
	 * 
	 * @return gold of monster
	 */
	public int getGold();
}
