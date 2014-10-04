package game;

import input_output.IO;
import player.Player;

public class Setup {

	public static Player makePlayer() {
		Player player = new Player();
		getStartingWeapon(player);
		return player;
	}

	private static void getStartingWeapon(Player player) {
		int choice = 0;
		choice = IO.msgInInt("Select a starting weapon:\n"
				+ "1: Wooden Sword \n"
				+ "2: Staff \n"
				+ "3: Shoe \n"
				+ "4: Stick \n"
				+ "5: Newspaper");
		
		if(choice == 1){
			player.pickupItem("Wooden Sword");
			player.setWeapon("Sword");
			player.addAttack("Swing");
		}else if(choice == 2){
			player.pickupItem("Oaken Staff");
			player.setWeapon("Staff");
			player.addAttack("Hit");
		}else if(choice == 3){
			player.pickupItem("Old Shoe");
			player.setWeapon("Shoe");
			player.addAttack("Whack");
			player.addAttack("Release scent");
			player.addAttack("Throw");
		}else if(choice == 4){
			player.pickupItem("Stick");
			player.setWeapon("Stick");
			player.addAttack("Poke");
		}else if(choice == 5){
			player.pickupItem("Ye Olde Times");
			player.setWeapon("Newspaper");
			player.addAttack("Read");
			player.addAttack("Throw");
		}else{
			getStartingWeapon(player);
		}

	}

}
