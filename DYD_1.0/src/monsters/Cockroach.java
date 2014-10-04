package monsters;

public class Cockroach extends Monster {

	static int health = 7;
	static int attackPower = 3;

	public Cockroach(String name) {
		super(health, attackPower, name);
	}

	public void injure(int amount) {
		super.injure(amount);
	}
	public String printMonster(){
		return super.toString();
	}
}
