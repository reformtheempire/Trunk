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
		}else if(choice == 2){
			player.pickupItem("Oaken Staff");
		}else if(choice == 3){
			player.pickupItem("Old Shoe");
		}else if(choice == 4){
			player.pickupItem("Stick");
		}else if(choice == 5){
			player.pickupItem("Ye Olde Times (NEWSPAPER)");
		}else{
			getStartingWeapon(player);
		}

	}

}
