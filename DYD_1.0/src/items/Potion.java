package items;

public class Potion extends Item {

	public Potion(String name, String type, int level) {
		super(name, level);
		this.type = type;
	}
	
	private String type;
	
	public int usePotion(){
		if(type == "poison"){
			if(super.getLevel() == 1){
				return -5;
			}else if(super.getLevel() == 2){
				return -10;
			}else if (super.getLevel() == 3){
				return -20;
			}
		}else if(type == "health"){
			if(super.getLevel() == 1){
				return 5;
			}else if(super.getLevel() == 2){
				return 10;
			}else if (super.getLevel() == 3){
				return 20;
			}
		}
		
	return 0;
	}
}
