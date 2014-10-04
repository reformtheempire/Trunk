package monsters;

public class Goblin extends Monster{
	
	static int health = 17;
	static int attackPower = 11;

	public Goblin(String name) {
		super(health, attackPower, name);
	}

	public void injure(int amount) {
		super.injure(amount);
	}
}
