package codes;

import java.awt.*;
import javax.swing.*;

public class MissileMovement extends Thread {
	
	private Missile missile;
	
	private SpaceBoard sp;
	
	
	public MissileMovement(Missile missile,SpaceBoard sp){
		
			this.missile = missile;
			this.sp = sp;
		
	}
	
	@Override
	public void run(){
		
		try{
			
			while(missile.getX() < 1000){
				
				missile.moveRIGHT();	
				sp.checkGhostCollision();
				sp.repaint();
				super.sleep(10);
			}
			
			
		}
		
		catch(Exception e){
			
			
		}
		
	}
	
}
