package codes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class OurImage {
	private int x, y;
	private String imagePath;
	
	public OurImage(int x,int y, String imagePath) {
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
		Image ourImage = icon.getImage();
		g.drawImage(ourImage, x, y, null);
	}
}
