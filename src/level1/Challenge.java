package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 */
	public void initialize() {
		driveDirect(1000,1000);
		sleep(1200);
		driveDirect(1000,1000);
		driveDirect(0,190);
	
		sleep(1500);
		driveDirect(1000,1000);
		sleep(1000);
		driveDirect(500,1000);
		driveDirect(1000,1000);
		

	}
  void driveForward(float distance){
		float d=3;
		driveDirect(100,100);
		sleep((int)(1000*distance));
		driveDirect(0,100);

	}
  public void turn90degrees(int amount) {
	  driveDirect(-100,100);
	 int a=1900*amount;
	  
  }
	
		
		
	
	

	public void loop() {
	
	}
}
