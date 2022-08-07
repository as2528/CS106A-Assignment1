/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	
	// TODO: write the code to implement this program
	public void run() { 
		getPaper();
		 pickBeeper(); 
		 returnHome();
		} 
	
	private void getPaper(){
		 move(); 
		 turnRight(); 
		 move(); 
		 turnLeft();
		 move(); 
		 move();
	}
	
	private void returnHome() {
		turnAround();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
	}
	}

	
