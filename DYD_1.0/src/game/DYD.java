package game;

import map.Cell;
import map.GenerateMap;
import map.Map;
import player.Attacks;
import player.Player;

public class DYD {

	static Bootstrap boot = new Bootstrap();
	static Player player = boot.InitialisePlayer();
	static Attacks attacks = boot.InitialiseAttacks(player);
	static GenerateMap genMap = new GenerateMap();
	static Map map = new Map();
	public static void main(String[] args) {
		Cell[][] cells = genMap.makeMap(100);
		map.setCells(cells);
		System.out.println(map.displayMap());
	}
}
