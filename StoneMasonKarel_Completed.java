/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	public void run() {
		while(frontIsClear()) {
			NorthStar();
			Inspector();
			HardPlaceSaver();
			NotSoHardPlaceSaver();
			EastStar();
			nextLevel();

		}
		LazyKarel();
			
		}
	
	
	private void LazyKarel() {
		NorthStar();
		Inspector();
		HardPlaceSaver();
		NotSoHardPlaceSaver();
		EastStar();
	}
	
	private void NotSoHardPlaceSaver() {
		EastStar();
		if(frontIsBlocked()) {
			SouthStar();
			while(frontIsClear()) {
				move();
	}
		}}
	private void EastStar() {
		while(notFacingEast()) {
			turnRight();
		}
	}
	private void startUp() {
		if (beepersPresent()) {
			putBeeper();
		}
	}
	private void NorthStar() {
		while(notFacingNorth()) {
			turnRight();
	}
	}
	private void SouthStar() {
		while(notFacingSouth()) {
			turnRight();
	}
	}
	private void Inspector() {
		while(frontIsClear()) {
			move();
			if(beepersPresent()) {
				fixDamage();
			}
		}
	}
	private void fixDamage() {
		NorthStar();
		walker();
		SouthStar();
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
		if(noBeepersPresent()) {
			putBeeper();
		}
	}
		
	private void walker() {
		while(frontIsClear()) {
			move();
		}}
	
	private void nextLevel() {
		EastStar();
		move();
	}
	
	private void HardPlaceSaver() {
		WestStar();
		if(frontIsBlocked()) {
			EastStar();
			if(frontIsBlocked()) {
				SouthStar();
				while(frontIsClear()) {
					move();
				}
			}
	}
	}
	private void WestStar() {
		while(notFacingWest()) {
			turnRight();
}
	}
}