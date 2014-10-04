package player;

import input_output.IO;

import java.util.ArrayList;
import java.util.Collection;

import monsters.Monster;

public class Attacks {
	private static Collection<String> attacks = new ArrayList<String>();
	
	public void addAttack(String attack){
		if(!attacks.contains(attack)){
			attacks.add(attack);
		}
	}
	
	public String printAttacks(){
		return attacks.toString();
	}
	
	public void attack(Player player, Monster monster){
		StringBuilder sb = new StringBuilder();
		sb.append("Select an attack: ");
		int count = 0;
		
		boolean attack1 = false;
		boolean attack2 = false;
		boolean attack3 = false;
		boolean attack4 = false;
		String weapon = player.getWeapon();
		if(weapon.equalsIgnoreCase("sword")){
			count = 0;
			if(attacks.contains("Swing")){
				count = 1;
				sb.append("\n" + count + ": Swing");
				attack1 = true;
			}
			
			if(attacks.contains("Chop")){
				count = 2;
				sb.append("\n" + count + ": Chop");
				attack2 = true;
			}
			
			if(attacks.contains("Lunge")){
				count = 3;
				sb.append("\n" + count + ": Lunge");
				attack3 = true;
			}
			
			if(attacks.contains("Stab")){
				count = 4;
				sb.append("\n" + count + ": Stab");
				attack4 = true;
			}		
			
			int choice = IO.msgInInt(sb.toString());
			if(choice == 1 && attack1){
				monster.injure(4 + player.getStrength());
			} else if(choice == 2 && attack2){
				monster.injure(7 + player.getStrength());
			} else if(choice == 3 && attack3){
				monster.injure(12 + player.getStrength());
			} else if(choice == 4 && attack4){
				monster.injure(15 + player.getStrength());
			}
		}
		
		
	}
	
}
