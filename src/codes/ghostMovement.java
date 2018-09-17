package codes;

public class ghostMovement extends Thread {
	
	private GhostObject ghostObject;
	private GhostObject2 go2;
	private GhostObject3 go3;
	private GhostObject4 go4;
	private GhostObject5 go5;

	private SpaceBoard sp;

	
	
	public ghostMovement(GhostObject ghostObject, GhostObject2 go2,
			GhostObject3 go3, GhostObject4 go4, GhostObject5 go5, SpaceBoard sp) {
		super();
		this.ghostObject = ghostObject;
		this.go2 = go2;
		this.go3 = go3;
		this.go4 = go4;
		this.go5 = go5;
		this.sp = sp;
	}



	@Override
	public void run(){
		
		try{
			
			while(ghostObject.getX() > 0||go2.getX()>0||go3.getX()>0||go4.getX()>0||go5.getX()>0){
				
				ghostObject.move();
				go2.move();
				go3.move();
				go4.move();
				go5.move();
				sp.checkGhostCollision();
				
				sp.repaint();
				super.sleep(10);
			}
			
			
		}
		
		catch(Exception e){
			
			
		}
		
	}
	

}
