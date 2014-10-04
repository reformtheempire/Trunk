package monsters;

public class Thief extends Monster{

	static int health = 75;
	static int attackPower = 30;

	public Thief(String name) {
		super(health, attackPower, name);
	}

	public void injure(int amount) {
		super.injure(amount);
	}
}
