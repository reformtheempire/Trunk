package monsters;

public class Spider extends Monster{
	
	static int health = 12;
	static int attackPower = 9;
	static String weapon = "Fang";

	public Spider(String name) {
		super(health, attackPower, name, weapon);
		super.addAttack("Sting");
		super.addAttack("Bite");
	}

	public void injure(int amount) {
		super.injure(amount);
	}
	public String printMonster(){
		return super.toString();
	}
}
