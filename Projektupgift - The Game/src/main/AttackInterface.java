package main;

/**
 * A interface that is to be implemented by MonsterAbstract and Player so that a
 * method can be created with the argument of AttackInterface
 * 
 * @author Emil Karlsson
 *
 */
public interface AttackInterface {

	/**
	 * Returns name of the object
	 * 
	 * @return name of the object
	 */
	public String getName();

	/**
	 * Returns the amount of toughness the object have
	 * 
	 * @return toughness of object
	 */
	public int getToughness();

	/**
	 * Returns the amount of damage the object does
	 * 
	 * @return damage of object
	 */
	public int giveDamage();

	/**
	 * Makes so that the object takes damage
	 * 
	 * @param damage
	 */
	public void takeDamage(int damage);

	/**
	 * Returns the amount of health the object currently have
	 * 
	 * @return object health
	 */
	public int getHealth();

	/**
	 * Returns the objects maximum health
	 * 
	 * @return objects max health
	 */
	public int getMaxHealth();

}
