package monsters;

public class Goblin extends Monster{
	
	static int health = 17;
	static int attackPower = 11;
	static String weapon = "Gold";

	public Goblin(String name) {
		super(health, attackPower, name, weapon);
		super.addAttack("Throw coins");
		super.addAttack("Punch");
	}

	public void injure(int amount) {
		super.injure(amount);
	}
	public String printMonster(){
		return super.toString();
	}
}
