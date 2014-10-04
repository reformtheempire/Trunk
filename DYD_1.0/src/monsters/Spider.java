package monsters;

public class Spider extends Monster{
	
	static int health = 12;
	static int attackPower = 9;

	public Spider(String name) {
		super(health, attackPower, name);
	}

	public void injure(int amount) {
		super.injure(amount);
	}
	public String printMonster(){
		return super.toString();
	}
}
