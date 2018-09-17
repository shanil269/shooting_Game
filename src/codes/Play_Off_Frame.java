package codes;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Play_Off_Frame extends JFrame{
	
	SpaceBoard board;
    
	public Play_Off_Frame(){
		
		board = new SpaceBoard();
		board.setFocusable(true);
	}
	
	
	public void startOpening(){
		
		
		super.setTitle("SPACE WAR GAME");
		super.add(board);
		super.setSize(1000,600);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		board.move();
		super.setVisible(true);
		
//		while(SpaceBoard.isWin() == true){
//			
//		}
//		
//		JOptionPane.showMessageDialog(null, "YOU WIN!!!");
//		super.dispose();
		

	}

}
