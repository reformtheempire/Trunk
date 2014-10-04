package monsters;

public class Orc extends Monster {

	static int health = 50;
	static int attackPower = 27;

	public Orc(String name) {
		super(health, attackPower, name);
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
