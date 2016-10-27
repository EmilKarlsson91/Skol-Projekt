/**
 * A class that creates an instance of a game.
 * 
 * @author Emil Karlsson
 */

package main;

import java.util.Scanner;

import monsters.GiantWithEightArms;
import monsters.Goblin;
import monsters.Hobgoblin;
import monsters.Lepricon;
import monsters.MonsterAbstract;
import monsters.Orc;
import monsters.Spider;
import monsters.Troll;
import monsters.Unichorn;
import monsters.Wywern;

/**
 * A class that creates an instance of a game.
 * 
 * @author Emil Karlsson
 */
public class Game {

	/**
	 * A scanner that takes user input
	 */
	private static Scanner sc = new Scanner(System.in);

	private Shop shop;

	private Player player;

	public Game() {

	}

	/**
	 * Method that is called from main to start the game
	 */
	public void startGame() {

		this.shop = new Shop();

		for (int i = 0; i < 24; i++) {
			System.out.print("*");
		}
		System.out.println("\n* Welcome to The Game! *");
		for (int i = 0; i < 24; i++) {
			System.out.print("*");
		}
		System.out.print("\nEnter your name: ");
		this.player = new Player(sc.nextLine());
		System.out.println("");

		while (true) {

			System.out.println("1. Go adventuring\n2. Show details about your character\n3. Go to shop\n4. Exit game");
			String index = sc.nextLine();

			switch (index) {

			case "1":
				adventure();
				break;
			case "2":
				showPlayerDetails();
				break;

			case "3":
				shop();
				break;
			case "4":
				System.exit(0);
				break;
			}
		}
	}

	/**
	 * A method that have a 10% chance that nothing happens, else it will get a
	 * monster for the player to fight gainst
	 */
	public void adventure() {
		if (RandomHelper.getBigChance()) {
			MonsterAbstract randomMonster = getRandomMonster();
			battle(randomMonster);
		}

		else
			System.out.println("You feel tired and dont want to adventure.");
	}

	/**
	 * A method that takes a monster and player and makes them attack each other
	 * 
	 * @param AttackInterface
	 *            m
	 * @param AttackInterface
	 *            y
	 */
	public void attack(AttackInterface m, AttackInterface y) {
		AttackInterface p = null;
		AttackInterface n = null;

		// y instanceof MonsterAbstract &&
		if (m instanceof Player) {
			p = (Player) m;
			n = (MonsterAbstract) y;

			// y instanceof Player &&
		} else if (m instanceof MonsterAbstract) {
			n = (Player) y;
			p = (MonsterAbstract) m;
		}
		int xDamage = p.giveDamage();
		n.takeDamage(xDamage);
		System.out.println(n.getName() + " takes "
				+ ((xDamage - n.getToughness() < 0 ? 0 : (xDamage - n.getToughness()))) + " damage.\n" + n.getName()
				+ " HP: " + (n.getHealth() <= 0 ? 0 : n.getHealth()) + "/" + n.getMaxHealth());

	}

	/**
	 * A method that makes so that a player and a monster attacks each other
	 * until someone is dead
	 * 
	 * @param MonsterAbstract
	 *            monster
	 */
	public void battle(MonsterAbstract monster) {

		battle: while (true) {

			attack(this.player, monster);

			if (monster.isDead()) {
				System.out.println(monster.getName() + " died and you earned " + monster.getExperience()
						+ " experience and " + monster.getGold() + " gold.");
				this.player.addGold(monster.getGold());
				this.player.giveExperience(monster.getExperience());
				this.player.levelUp();
				monster = null;
				if (this.player.getLevel() >= 10) {
					System.exit(0);
				}
				break battle;
			}

			attack(monster, this.player);

			if (this.player.isDead()) {
				System.out.println("You died!");
				System.exit(0);
			}
			System.out.println("[Press enter to continue]");
			sc.nextLine();

		}
	}

	/**
	 * A method that prints the players abilities and items.
	 */
	public void showPlayerDetails() {
		System.out.println("Name: " + player.getName());
		System.out.println("Level: " + player.getLevel());
		System.out.println("Hp: " + player.getHealth() + "/" + player.getMaxHealth());
		System.out.println("Exp: " + player.getExperience() + "/" + player.getExpToNextLvl());
		System.out.println("Gold: " + player.getGold());
		System.out.println("Damage: " + player.getMinDamage() + "-" + player.getMaxDamage());
		System.out.println("Strength: " + player.getStrength());
		System.out.println("Toughness: " + player.getToughness());
		System.out.println("Player have the following items: ");
		player.getItems();
		System.out.println("");
	}

	/**
	 * A method that gets a random monster that is specified for the player
	 * level.
	 * 
	 * @return a random monster.
	 * 
	 */
	public MonsterAbstract getRandomMonster() {
		int playerLevel = player.getLevel();
		int i = RandomHelper.getInt(1, 3);

		if (playerLevel <= 3) {

			switch (i) {
			case 1:
				return new Goblin(playerLevel);
			case 2:
				return new Lepricon(playerLevel);
			case 3:
				return new Hobgoblin(playerLevel);
			}

		} else if (playerLevel > 3 && playerLevel <= 6) {
			switch (i) {
			case 1:
				return new Orc(playerLevel);
			case 2:
				return new Troll(playerLevel);
			case 3:
				return new Spider(playerLevel);
			}
		} else if (playerLevel > 6 && playerLevel <= 8) {
			switch (i) {
			case 1:
				return new Unichorn(playerLevel);
			case 2:
				return new Troll(playerLevel);
			case 3:
				return new Wywern(playerLevel);
			}
		} else {
			return new GiantWithEightArms();
		}
		return null;
	}

	/**
	 * A method that runs the shop
	 */
	public void shop() {
		System.out.println(player.getName() + "'s gold available: " + player.getGold());
		shop.getItemsInShop();
		String shopIndex = sc.nextLine();
		Integer tempInt = Integer.parseInt(shopIndex);

		if (tempInt == 5) {
			return;
		}

		else if (tempInt == 4) {
			player.setHealthToMax();
			player.removeGold(50);
			return;
		} else if (tempInt > shop.getItemListLength()) {
			System.out.println("Sorry adventurer but i don't have that item.\n");
			return;
		}
		Item temp = shop.buyItem(tempInt - 1);
		if (player.getGold() >= temp.getCost()) {
			shop.removeItem(tempInt - 1);
			player.giveItems(temp);
			System.out.println(player.getName() + " acqured: " + temp.getName() + "\n");
		} else {
			System.out.println("Sorry adventurer, you do not have the amount of gold required to buy that item.\n");
		}

	}
}
