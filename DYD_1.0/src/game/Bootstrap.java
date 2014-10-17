package game;

import player.Attacks;
import player.Player;

public class Bootstrap {

	private static String track;
	private static Music music = new Music(track);

	public Player InitialisePlayer() {
		Player player = Setup.makePlayer();
		return player;
	}

	public Attacks InitialiseAttacks(Player player) {
		Attacks attacks = new Attacks();
		return attacks;
	}

	public void InitialiseMusic(String track) {
		Bootstrap.track = track;
		music.playMusic();
	}

}
