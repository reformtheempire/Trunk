package weapons;

import items.Item;

public class Sword extends Item{

	public Sword(String name, int level) {
		super(name, level);
		if(super.getLevel() == 1){
			super.addUse("Swing");
		}else if(super.getLevel() == 2){
			super.addUse("Swing");
			super.addUse("Chop");
		}else if(super.getLevel() == 3){
			super.addUse("Swing");
			super.addUse("Chop");
			super.addUse("Sting");
		}else if(super.getLevel() == 4){
			super.addUse("Swing");
			super.addUse("Chop");
			super.addUse("Sting");
			super.addUse("Stab");
		}
	}
	
	public void levelUp(int level){
		super.setLevel(level);
		
		if(super.getLevel() == 1){
			super.addUse("Swing");
		}else if(super.getLevel() == 2){
			super.addUse("Chop");
		}else if(super.getLevel() == 3){
			super.addUse("Sting");
		}else if(super.getLevel() == 4){
			super.addUse("Stab");
		}
	}

}
