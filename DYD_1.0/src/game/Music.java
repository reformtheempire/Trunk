package game;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
	public void playMusic(){
		try{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("main.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		}catch (Exception e){
			System.err.println("ERROR");
			e.printStackTrace();
		}
	}
}
