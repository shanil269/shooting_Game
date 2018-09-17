package codes;

import java.awt.*;

import javax.swing.ImageIcon;

public class Bomber {
	
	private int x, y;
	private String imagePath;
	boolean isAlive;
	
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Bomber(int x,int y, String imagePath) {
		super();
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
	}
	public Bomber(){
		
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
		Image bomber = icon.getImage();
		g.drawImage(bomber, x, y, null);
	}
	
	public void moveUP(){
		
		if ( (y - 1) > 0 )
			y--;
		else
			y = 0; 
	
	}

	public void moveDOWN(){
	
	if ( (y + 1) < SpaceBoard.HEIGHT-160 )
		y++;
	else
		y = 440; 

	}
}
