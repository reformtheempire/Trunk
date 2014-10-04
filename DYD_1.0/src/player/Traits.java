package player;


public class Traits {
	@Override
	public String toString() {
		return "Traits [name=" + name + ", health=" + health + ", race=" + race
				+ ", strength=" + strength + ", agility=" + agility + "]";
	}

	private String name;
	private int health;
	private String race;
	private int strength;
	private int agility;
	

	
	public String getName() {
		return name;
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

	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
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
