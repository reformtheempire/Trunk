package game;

import player.Attacks;
import player.Player;

public class DYD {

	static Bootstrap boot = new Bootstrap();
	static Player player = boot.InitialisePlayer();
	static Attacks attacks = boot.InitialiseAttacks(player);

	public static void main(String[] args) {
		boot.InitialiseMusic("main.wav");
	}
}
