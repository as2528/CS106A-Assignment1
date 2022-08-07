/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	// TODO: write the code to implement this program
public void run() {
	firstSquare();
	normalRun();
	
}

private void firstSquare() {
	putBeeper();
	
	EastStar();
	if(frontIsBlocked()) {
		WestStar();
		if(frontIsBlocked()) {
			SouthStar();
			if(frontIsClear()) {
				SouthSingleColumnKarel();
			}
			NorthStar();
			if(frontIsClear()) {
				NorthSingleColumnKarel();
			}
			}
		}
	}

private void SouthSingleColumnKarel() {
		SouthStar();
		pickBeeper();
		while(frontIsClear()) {
			putBeeper();
			move();
			move();
		}
		
	}
private void NorthSingleColumnKarel() {
		NorthStar();
		pickBeeper();
		while(frontIsClear()) {
			putBeeper();
			move();
			move();
		}
		
	}
private void normalRun() {
	while(frontIsClear()) {
		move();
		if(frontIsClear()) {
		move();
		putBeeper();
		}
	}
	
	if(facingEast()) {
		EastChange();
	}
	
	if(facingWest()) {
		WestChange();
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
private void EastStar() {
	while(notFacingEast()) {
		turnLeft();
	}}
private void WestStar() {
	while(notFacingWest()) {
		turnLeft();
	}}

private void EastChange() {
	if(beepersPresent()) {
		NorthStar();
		move();
		WestStar();
		move();
		putBeeper();
		normalRun();
	}
	if(noBeepersPresent()) {
		NorthStar();
		move();
		putBeeper();
		WestStar();
		normalRun();
	}
}
private void WestChange() {
	if(beepersPresent()) {
		NorthStar();
		move();
		EastStar();
		move();
		putBeeper();
		normalRun();
	}
	
	if(noBeepersPresent()) {
		NorthStar();
		move();
		putBeeper();
		EastStar();
		normalRun();
	}
}
}