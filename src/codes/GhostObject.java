package codes;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;



public class GhostObject {
	
	int x, y;
	String imagePath;
	boolean isAlive;
	
	
	public GhostObject(int x,int y,String imagePath)
	{
		this.x = x;
		this.y = y;
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
		Image ghost = icon.getImage();
		g.drawImage(ghost,x,y,null);
		
		
	}
	public void move(){
		
		if(( x - 1) > 0){
			x-=1;
		}
		
	}
		
	

}

