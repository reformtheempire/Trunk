package game;

import monsters.Orc;
import player.Attacks;
import player.Player;

public class DYD {

	public static void main(String[] args) {
		Player player = Setup.makePlayer();
		Orc monster = new Orc("John");
		Attacks attacks = new Attacks();
		//DEBUG
		player.printPlayer();
		//DEBUG
		
		System.out.println(monster.printMonster());
		
		attacks.attack(player, monster);
		
		System.out.println(monster.printMonster());

		}
}
