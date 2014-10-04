package monsters;

public class Cockroach extends Monster {

	static int health = 7;
	static int attackPower = 3;
	static String weapon = "n/a";

	public Cockroach(String name) {
		super(health, attackPower, name, weapon);
		super.addAttack("Bite");
		super.addAttack("Crawl");
	}

	public void injure(int amount) {
		super.injure(amount);
	}
	public String printMonster(){
		return super.toString();
	}
}
