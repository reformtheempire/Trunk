package game;

import java.util.Random;
public class Randomiser {

	Random random = new Random();
	
	public int getRandomInt(int max, int min){
		return random.nextInt(max) + min;
	}
}
