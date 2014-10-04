package player;

import input_output.IO;

public class Player {
	
	private static Armor armor = new Armor(0, 0, 0, 0);
	private static Inventory inventory = new Inventory();
	private static Traits traits = new Traits(IO.msgInString("Welcome adventurer, \nEnter your name:") , 100, "Human", 15, 5);
	
	public void printPlayer(){
		System.out.println(traits.toString());
		System.out.println(armor.toString());
		System.out.println("INVENTORY: " + inventory.toString());
	}
	
	public void pickupItem(String item){
		inventory.addItemToBackpack(item);
	}
	
	public boolean inventoryContains(String item){
		return inventory.doesBackpackContain(item);
	}
	
	public void useItem(String item){
		inventory.removeItemFromBackpack(item);
	}
	
	public void setHelmetLevel(int level){
		armor.setHelmet(level);
	}

	public void setLeggingsLevel(int level){
		armor.setLeggings(level);
	}
	
	public void setChestplateLevel(int level){
		armor.setChestplate(level);
	}
	
	public void setBootsLevel(int level){
		armor.setBoots(level);
	}
	
	public void upgradeArmor(int level){
		armor.upgradeArmor(level);
	}
	
	public int getBootsLevel(){
		return armor.getBoots();
	}

	public int getChestPlateLevel(){
		return armor.getChestplate();
	}
	
	public int getLeggingsLevel(){
		return armor.getLeggings();
	}
	
	public int getHelmetLevel(){
		return armor.getHelmet();
	}
	
	public int getStrength(){
		return traits.getStrength();
	}
	
	public String getName(){
		return traits.getName();
	}
	
	public int getHealth(){
		return traits.getHealth();
	}
	
	public String getRace(){
		return traits.getRace();
	}
	
	public int getAgility(){
		return traits.getAgility();
	}
	
	public void setHealth(int health){
		traits.setHealth(health);
	}
}
