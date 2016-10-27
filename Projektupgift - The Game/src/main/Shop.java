package main;

import java.util.ArrayList;

/**
 * A Class that creates an instance of a shop
 * 
 * @author Emil Karlsson
 *
 */
public class Shop {

	private ArrayList<Item> itemList = new ArrayList<Item>();

	/**
	 * Constructor that adds items to a list
	 */
	public Shop() {
		itemList.add(new Item("Necklace of power", 2, 0, 500));
		itemList.add(new Item("Ring of protetion", 0, 2, 500));
		itemList.add(new Item("Sword of reckoning", 5, 5, 1500));
	}

	/**
	 * Returns a item for the player to buy
	 * 
	 * @param index
	 * @return item
	 */
	public Item buyItem(int index) {
		return itemList.get(index);
	}

	/**
	 * Removes the item on index
	 * 
	 * @param index
	 */
	public void removeItem(int index) {
		itemList.remove(index);
	}

	/**
	 * Method thats prints items in shop
	 */
	public void getItemsInShop() {
		System.out.println("Welcome to my store fellow adventurer, what do you want to buy?\n");
		for (int i = 1; i <= itemList.size(); i++) {
			System.out.println(i + ": " + itemList.get(i - 1).getName() + ", strength: "
					+ itemList.get(i - 1).getStrength() + ", toughness: " + itemList.get(i - 1).getToughness()
					+ ", cost: " + itemList.get(i - 1).getCost());
		}
		System.out.println("4. Health potion, adds full life, cost: 50");
		System.out.println("5. Leave shop\n");
	}

	/**
	 * A method that returns list size
	 * 
	 * @return
	 */
	public int getItemListLength() {
		return itemList.size();
	}
}
