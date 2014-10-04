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
		
		//sword
		
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
		
		//staff
		
		if(weapon.equalsIgnoreCase("staff")){
			count = 0;
			if(attacks.contains("Hit")){
				count = 1;
				sb.append("\n" + count + ": Hit");
				attack1 = true;
			}
			
			if(attacks.contains("Push")){
				count = 2;
				sb.append("\n" + count + ": Push");
				attack2 = true;
			}
			
			if(attacks.contains("Burn")){
				count = 3;
				sb.append("\n" + count + ": Burn");
				attack3 = true;
			}
			
			if(attacks.contains("Curse")){
				count = 4;
				sb.append("\n" + count + ": Curse");
				attack4 = true;
			}		
			
			int choice = IO.msgInInt(sb.toString());
			if(choice == 1 && attack1){
				monster.injure(4 + player.getStrength());
			} else if(choice == 2 && attack2){
				monster.injure(5 + player.getStrength());
			} else if(choice == 3 && attack3){
				monster.injure(16 + player.getStrength());
			} else if(choice == 4 && attack4){
				monster.injure(14 + player.getStrength());
			}
		}
		
		//Shoe
		
		if(weapon.equalsIgnoreCase("shoe")){
			count = 0;
			if(attacks.contains("Throw")){
				count = 1;
				sb.append("\n" + count + ": Throw");
				attack1 = true;
			}
			
			if(attacks.contains("Release scent")){
				count = 2;
				sb.append("\n" + count + ": Release scent");
				attack2 = true;
			}
			
			if(attacks.contains("Whack")){
				count = 3;
				sb.append("\n" + count + ": Whack");
				attack3 = true;
			}
			
			int choice = IO.msgInInt(sb.toString());
			if(choice == 1 && attack1){
				monster.injure(2 + player.getStrength());
			} else if(choice == 2 && attack2){
				monster.injure(9 + player.getStrength());
			} else if(choice == 3 && attack3){
				monster.injure(11 + player.getStrength());
			}
		}
		
		//stick of power
		
		if(weapon.equalsIgnoreCase("stick")){
			count = 0;
			if(attacks.contains("Poke")){
				count = 1;
				sb.append("\n" + count + ": Poke");
				attack1 = true;
			}
			
			if(attacks.contains("Throw")){
				count = 2;
				sb.append("\n" + count + ": Throw");
				attack2 = true;
			}
			
			if(attacks.contains("Fart of power")){
				count = 3;
				sb.append("\n" + count + ": Fart of Power");
				attack3 = true;
			}
			
			if(attacks.contains("Explosion")){
				count = 4;
				sb.append("\n" + count + ": Explosion");
				if(attack3 == true) {
				attack4 = true;
				}
				else {
					IO.msgInString("You have to unlock 'Fart of power' first!");
				}
			}
			
			int choice = IO.msgInInt(sb.toString());
			if(choice == 1 && attack1){
				monster.injure(6 + player.getStrength());
			} else if(choice == 6 && attack2){
				monster.injure(5 + player.getStrength());
			} else if(choice == 3 && attack3){
				monster.injure(16 + player.getStrength());
			} else if(choice == 4 && attack4){
				monster.injure(23 + player.getStrength());
			}
		}
		
		//newspaper
		
		if(weapon.equalsIgnoreCase("newspaper")){
			count = 0;
			if(attacks.contains("Read")){
				count = 1;
				sb.append("\n" + count + ": Read");
				attack1 = true;
			}
			
			if(attacks.contains("Throw")){
				count = 2;
				sb.append("\n" + count + ": Throw");
				attack2 = true;
			}
			
			int choice = IO.msgInInt(sb.toString());
			if(choice == 1 && attack1){
				monster.injure(1);
			} else if(choice == 2 && attack2){
				monster.injure(5 + player.getStrength());
			}
		}
		
	}
	
}
