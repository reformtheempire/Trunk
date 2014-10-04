package monsters;

public class Magician extends Monster{

	static int health = 80;
	static int attackPower = 21;
	static String weapon = "Wand";

	public Magician(String name) {
		super(health, attackPower, name, weapon);
		super.addAttack("Throw fire ball");
		super.addAttack("Cast lightning bolt");
		super.addAttack("Summon goblin");
	}

	public void injure(int amount) {
		super.injure(amount);
	}
	public String printMonster(){
		return super.toString();
	}
}
