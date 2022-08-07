/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class MidpointFinderKarel extends SuperKarel {
	
	public void run() {
		
		MessMaker();
		StartCleaning();
		BeepCollector();
	}
	
	private void MessMaker() {
		putBeeper();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
	}
	private void EastStar() {
		while(notFacingEast()) {
			turnRight();
		}
	}
	
	private void WestStar() {
		while(notFacingWest()) {
			turnRight();
}
	}
	private void SouthStar() {
		while(notFacingSouth()) {
			turnRight();
}
	}
	private void BeepCollector() {
		if(noBeepersPresent()) {
			Cleaner();
		}
		
		while(beepersPresent()) {
			move();
			if(noBeepersPresent()) {
				Cleaner();

				}
			}
		}
	
	private void Cleaner() {
		
		while(notFacingSouth()) {
		
		turnAround();
		move();
		if(noBeepersPresent()) {
			turnAround();
			move();
			turnAround();
			move();
			putBeeper();
			SouthStar();
		}
		while(notFacingSouth()) {
		if(beepersPresent()) {
			pickBeeper();
			move();
			BeepCollector();
			
		}
		}
		}
		}
	
	private void StartCleaning() {
		
		EastStar();
		while(frontIsClear()) {
			move();
		}
		pickBeeper();
		WestStar();
		while(frontIsClear()) {
			move();
	}
		pickBeeper();
		turnAround();
		move();
}
	}
