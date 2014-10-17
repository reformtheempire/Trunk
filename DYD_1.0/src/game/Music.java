package game;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
	private String track;
	public Music(String track) {
		this.track = track;
	}
	public void playMusic(){
		try{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(track).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		}catch (Exception e){
			System.err.println("ERROR");
			e.printStackTrace();
		}
	}
}
