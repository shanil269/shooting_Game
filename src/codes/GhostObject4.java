package codes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class GhostObject4 {
	
	int x4, y4;
	String imagePath;
	boolean isAlive;
	
	
	public GhostObject4(int x4,int y4,String imagePath)
	{
		this.x4 = x4;
		this.y4 = y4;
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
		return x4;
	}

	public void setX(int x4) {
		this.x4 = x4;
	}

	public int getY() {
		return y4;
	}

	public void setY(int y4) {
		this.y4 = y4;
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
		g.drawImage(ghost, x4, y4, null);
		
		
	}
	public void move(){
		
		if(( x4 - 1) > 0){
			x4-=1;
		}
		
	}

}
