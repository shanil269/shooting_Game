package codes;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	
	public static void missileLaunch(){
		
		try{
			File exp = new File("sounds//missileLaunch.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(exp);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			
		}
		catch(Exception e){
			
		}
		
	}


}
