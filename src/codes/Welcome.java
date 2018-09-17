package codes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;



public class Welcome extends JFrame implements ActionListener{
	
	JButton Play,Exit;
	
	OurImage oI;
	
	public Welcome(){
		setLayout(null);
		
		Play = new JButton("NEW GAME");
		Exit = new JButton("EXIT GAME");
				
		add(Play);
		add(Exit);
		
		Dimension P1 = Play.getPreferredSize();
		Dimension P2 = Exit.getPreferredSize();

				
		Play.setBounds(200, 150, P1.width, P1.height);
		
		
		Exit.setBounds(200, 200, P2.width, P2.height);
	
		
		Play.addActionListener(this);
		Exit.addActionListener(this);
		
		oI = new OurImage(450,300,"images//ourImage.jpg");
		
	}
	
	
	public void GameStart(){
		
		setTitle("SPACE WAR GAME");
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
public void paint(Graphics g){
		
		ImageIcon icon = new ImageIcon("images//front.jpg");
		Image background = icon.getImage();
		g.drawImage(background,0,0,null);
		oI.draw(g);
		
		g.setColor(Color.WHITE);
		g.drawString(":::This game is developed by:::", 450, 120);
		
		g.drawString("     MD.MUHAIMIN HOSSAIN", 450, 170);
		
		g.drawString("     ISRUK HASAN", 450, 210);
		
		g.drawString("     MIKTADUL ", 450, 250);
		
}


	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == Play){
			Play_Off_Frame p1 = new Play_Off_Frame();
			p1.startOpening();
			
			super.dispose();
		}
		else if (e.getSource() == Exit) {
			super.dispose();
			
		}
	}
}



