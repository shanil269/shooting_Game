package codes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class GhostObject5 {
	
	int x5, y5;
	String imagePath;
	boolean isAlive;
	
	
	public GhostObject5(int x5,int y5,String imagePath)
	{
		this.x5 = x5;
		this.y5 = y5;
		this.imagePath = imagePath;
		isAlive = true;
	}
	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public  int getX() {
		return x5;
	}

	public void setX(int x5) {
		this.x5 = x5;
	}

	public int getY() {
		return y5;
	}

	public void setY(int y5) {
		this.y5 = y5;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public void draw(Graphics g){
		
		ImageIcon icon = new ImageIcon(imagePath);
		Image ghost = icon.getImage();
		g.drawImage(ghost, x5, y5, null);
		
		
	}
	public void move(){
		
		if(( x5 - 1) > 0){
			x5-=1;
		}
		
	}
	
}
