package items;

import java.util.ArrayList;
import java.util.Collection;

public class Item {

	private String name;
	private int level;
	private Collection<String> uses = new ArrayList<String>();
	
	public Item(String name, int level) {
		this.name = name;
		this.level = level;
	}
	
	public void addUse(String use){
		uses.add(use);
	}
	
	public boolean doesUsesContain(String use){
		return uses.contains(use);
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
