package player;

public class Personality {
	private String name;
	private String health;
	private String race;
	
	private int strength;
	private int agility;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
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

	public Personality(String name, String health, String race, int strength,
			int agility) {
		super();
		this.name = name;
		this.health = health;
		this.race = race;
		this.strength = strength;
		this.agility = agility;
	}
	
	
	
}
