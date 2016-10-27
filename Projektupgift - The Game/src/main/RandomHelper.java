package main;

import java.util.Random;

/**
 * Class that include random methods
 * 
 * @author Emil Karlsson
 *
 */
public class RandomHelper {

	private static Random rnd = new Random();

	/**
	 * Method that returns 90% chance
	 * 
	 * @return true or false
	 */
	public static boolean getBigChance() {

		if (rnd.nextDouble() < 0.9)
			return true;
		else
			return false;
	}

	/**
	 * Method that returns a chance between two numbers
	 * 
	 * @param lower
	 * @param upper
	 * @return random number
	 */
	public static int getInt(int lower, int upper) {

		return lower + rnd.nextInt((upper + 1) - lower);
	}

}
