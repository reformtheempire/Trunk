package player;

public class Traits {
	private String name;
	private int health;
	private String race;
	
	private int strength;
	private int agility;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public Traits(String name, int health, String race, int strength,
			int agility) {
		super();
		this.name = name;
		this.health = health;
		this.race = race;
		this.strength = strength;
		this.agility = agility;
	}
	
	
	
}
