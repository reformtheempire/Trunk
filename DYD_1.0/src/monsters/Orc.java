package monsters;

public class Orc extends Monster {

	static int health = 50;
	static int attackPower = 27;
	static String weapon = "Blade";

	public Orc(String name) {
		super(health, attackPower, name, weapon);
		super.addAttack("Slash");
		super.addAttack("Chop");
		super.addAttack("Yell");
	}

	public String printMonster(){
		return super.toString();
	}
	
	public void injure(int amount) {
		super.injure(amount);
		if(super.getHealth() < 0){
			super.setHealth(0);
		}
	}
}
