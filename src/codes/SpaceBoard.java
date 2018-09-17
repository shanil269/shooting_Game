package codes;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;;


public class SpaceBoard extends JPanel implements KeyListener {
	
	public static final int WIDTH = 1000, HEIGHT = 600;
	
	Bomber bomber;
	Missile[] missiles = new Missile[10];
	
	 GhostObject go;
	 GhostObject2 go2;
	 GhostObject3 go3;
	 GhostObject4 go4;
	 GhostObject5 go5;
	
	int missileNumber = 0, score = 0;
	
	public SpaceBoard()
	{
		super();
		
		go=new GhostObject(1000, 50, "images//ghost1.png");
		go2=new GhostObject2(1000, 150, "images//ghost2.png");
		go3=new GhostObject3(1000, 300, "images//ghost3.png");
		go4=new GhostObject4(1000, 400, "images//ghost4.png");
		go5=new GhostObject5(1000, 490, "images//ghost5.png");

		bomber = new Bomber(0, 280, "images//bomber1.png");
		super.addKeyListener(this);
		
		for(int i = 0; i < missiles.length; i++)
			missiles[i] = new Missile(97, 330, "images//missile.png");
		
		super.addKeyListener(this);

	}
	@Override
	public void paint(Graphics g){
		
		ImageIcon icon = new ImageIcon("images//background.jpg");
		Image background = icon.getImage();
		g.drawImage(background, 0, 0, null);
		bomber.draw(g);
		
		for(int i = 0; i < missiles.length; i++)
			missiles[i].draw(g);
		
		if(go.isAlive() == true){
			go.draw(g);
		}
		if(go2.isAlive() == true){
			go2.draw(g);
		}
		if(go3.isAlive() == true){
			go3.draw(g);
		}
		if(go4.isAlive() == true){
			go4.draw(g);
		}
		if(go5.isAlive() == true){
			go5.draw(g);
		}
		
		g.setColor(Color.BLUE);
		g.drawString("Score ::: "+ score, 850, 50);
	
	}
	

	
	public void checkGhostCollision(){
		
			for(int i = 0; i < missiles.length; i++){
				
				Rectangle missileRect = new Rectangle(missiles[i].getX(),missiles[i].getY(),70,30);
				
			
				
					Rectangle ghostRect = new Rectangle(go.getX(),go.getY(),50,50);
					Rectangle ghost2Rect = new Rectangle(go2.getX(),go2.getY(),50,50);
					Rectangle ghost3Rect = new Rectangle(go3.getX(),go3.getY(),50,50);
					Rectangle ghost4Rect = new Rectangle(go4.getX(),go4.getY(),58,50);
					Rectangle ghost5Rect = new Rectangle(go5.getX(),go5.getY(),50,50);
			
					
					if(missileRect.intersects(ghostRect) == true){
						score+= 1;
						
						Explosion e = new Explosion();
						e.start();
						
						go.setAlive(false);
						go.setX(2000);
					}
					else if(missileRect.intersects(ghost2Rect) == true){
						score+=1;
						
						Explosion e = new Explosion();
						e.start();
						
						go2.setX(2000);
						go2.setAlive(false);
					}
					else if(missileRect.intersects(ghost3Rect) == true){
						score+=1;
						
						Explosion e = new Explosion();
						e.start();
						
						go3.setX(2000);
						go3.setAlive(false);
					}
					else if(missileRect.intersects(ghost4Rect) == true){
						score+=1;
						
						Explosion e = new Explosion();
						e.start();
						
						go4.setX(2000);
						go4.setAlive(false);
					}
					else if(missileRect.intersects(ghost5Rect) == true){
						score+=1;
						
						Explosion e = new Explosion();
						e.start();
						
						go5.setX(2000);
						go5.setAlive(false);
					}
					
				}
	}	
	public void move(){
		ghostMovement gm=new ghostMovement(go,go2,go3,go4,go5,this);
		gm.start();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	
		if(e.getKeyCode() == e.VK_UP){
			bomber.moveUP();
			
			for(int i = 0; i < missiles.length; i++)
				missiles[i].moveUP();
		
		}
		
		else if(e.getKeyCode() == e.VK_DOWN){
			bomber.moveDOWN();
			
			for(int i = 0; i < missiles.length; i++)
				missiles[i].moveDOWN();
			
		}
		else if(e.getKeyCode() == e.VK_RIGHT)
		{
				MissileMovement m = new MissileMovement(missiles[missileNumber],this);
		
				Sound.missileLaunch();
				missileNumber++;
			
				m.start();
				
				if(missileNumber == 10){
					missileNumber = 0;
					for(int i = 0; i < missiles.length; i++)
						missiles[i]=new Missile(bomber.getX()+97,bomber.getY() + 50,"images//missile.png");
				
				}	
		
				
		
		}
		
		
		super.repaint();
		
	}

	/*public boolean isWin(){
		if(go.isAlive()==true||go2.isAlive()==true||go3.isAlive()==true||go4.isAlive()==true||go5.isAlive()==true){
			return true;
		}
		return false;
		
	}*/
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
