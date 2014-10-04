package monsters;

public class Mag extends Monster{

	static int health = 80;
	static int attackPower = 21;

	public Mag(String name) {
		super(health, attackPower, name);
	}

	public void injure(int amount) {
		super.injure(amount);
	}
}
