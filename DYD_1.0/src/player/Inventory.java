package player;

import java.util.ArrayList;
import java.util.Collection;

public class Inventory {

	private Collection<String> backpack = new ArrayList<String>();
	private String weapon;


	public String getWeapon() {
		return weapon;
	}

	public Inventory(String weapon) {
		super();
		this.weapon = weapon;
	}

	public void addItemToBackpack(String item) {
		backpack.add(item);
	}
	
	public void removeItemFromBackpack(String item) {
		backpack.remove(item);
	}

	public boolean doesBackpackContain(String item) {
		return backpack.contains(item);
	}
	
	public String toString(){
		return backpack.toString();
	}
}
