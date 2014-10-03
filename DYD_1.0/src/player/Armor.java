package player;

public class Armor {

	private int helmet;
	private int chestplate;
	private int leggings;
	private int boots;

	public int getHelmet() {
		return helmet;
	}

	public void setHelmet(int helmet) {
		this.helmet = helmet;
	}

	public int getChestplate() {
		return chestplate;
	}

	public void setChestplate(int chestplate) {
		this.chestplate = chestplate;
	}

	public int getLeggings() {
		return leggings;
	}

	public void setLeggings(int leggings) {
		this.leggings = leggings;
	}

	public int getBoots() {
		return boots;
	}

	public void setBoots(int boots) {
		this.boots = boots;
	}

	public void upgradeArmor(int factor) {
		helmet = +factor;
		chestplate = +factor;
		leggings = +factor;
		boots = +factor;
	}

}
