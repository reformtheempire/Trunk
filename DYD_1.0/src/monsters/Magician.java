package monsters;

public class Magician extends Monster{

	static int health = 80;
	static int attackPower = 21;

	public Magician(String name) {
		super(health, attackPower, name);
	}

	public void injure(int amount) {
		super.injure(amount);
	}
	public String printMonster(){
		return super.toString();
	}
}
