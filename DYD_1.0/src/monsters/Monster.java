package monsters;

import java.util.ArrayList;
import java.util.Collection;

public class Monster {
	public Monster(int health, int attackPower, String name) {
		super();
		this.health = health;
		this.attackPower = attackPower;
		this.name = name;
	}

	private int health;
	private int attackPower;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public String getName() {
		return name;
	}

	public Collection<String> getAttacks() {
		return attacks;
	}

	private String name;

	private Collection<String> attacks = new ArrayList<String>();

	public void addAttack(String attack) {
		attacks.add(attack);
	}
	
	public void injure(int damage) {
		setHealth(getHealth() - damage);
	}
}
