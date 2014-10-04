package monsters;

public class Thief extends Monster{

	static int health = 75;
	static int attackPower = 30;
	static String weapon = "Knife";

	public Thief(String name) {
		super(health, attackPower, name, weapon);
		super.addAttack("Stab");
		super.addAttack("Cut");
	}

	public void injure(int amount) {
		super.injure(amount);
	}
	public String printMonster(){
		return super.toString();
	}
}
