package codes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


	
	public class GhostObject3 {
		
		int x3, y3;
		String imagePath;
		boolean isAlive;
		
		
		public GhostObject3(int x3,int y3,String imagePath)
		{
			this.x3 = x3;
			this.y3 = y3;
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
			return x3;
		}

		public void setX(int x3) {
			this.x3 = x3;
		}

		public int getY() {
			return y3;
		}

		public void setY(int y3) {
			this.y3 = y3;
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
			g.drawImage(ghost, x3, y3, null);
			
			
		}
		public void move(){
			
			if(( x3 - 1) > 0){
				x3-=1;
			}
			
		}
	}


