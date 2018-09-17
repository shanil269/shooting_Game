package codes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class GhostObject2 {
	
	int x2, y2;
	String imagePath;
	boolean isAlive;
	
	
	public GhostObject2(int x2,int y2,String imagePath)
	{
		this.x2 = x2;
		this.y2 = y2;
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
		return x2;
	}

	public void setX(int x2) {
		this.x2 = x2;
	}

	public int getY() {
		return y2;
	}

	public void setY(int y2) {
		this.y2 = y2;
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
		g.drawImage(ghost, x2, y2, null);
		
		
	}
	public void move(){
		
		if(( x2 - 1) > 0){
			x2-=1;
		}
		
	}

}
