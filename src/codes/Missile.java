package codes;

import java.awt.*;
import javax.swing.*;

import javax.swing.ImageIcon;

public class Missile {
	
	
	private int x, y;
	private String imagePath;
	
	public Missile(int x, int y, String imagePath) {
		super();
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public void draw(Graphics g){
		
		ImageIcon icon = new ImageIcon(imagePath);
		Image missile = icon.getImage();
		g.drawImage(missile, x, y, null);
	}
	public void moveRIGHT(){
		
		if(( x + 1) < SpaceBoard.WIDTH){
			x+=1;
		}
		
	}
	public void moveUP(){
		
		if ( (y - 1) > 52 )
			y--;
		else
			y = 52; 
	
	}

	public void moveDOWN(){
	
	if ( (y + 1) < SpaceBoard.HEIGHT-106 )
		y++;
	else
		y = 494; 

	}
}
