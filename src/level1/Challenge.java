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
		// driveDirect(1000,1000);
		// sleep(1200);
		/// driveDirect(1000,1000);
		// driveDirect(0,190);

		// sleep(1500);
		// driveDirect(1000,1000);
		// sleep(1000);
		// driveDirect(500,1000);
		// driveDirect(1000,1000);
		// driveDirect(100,-100);
		// sleep(1800);
		// driveDirect(0,0);
		// turn90degrees(0);
		// driveForward(2);
		// turn90degrees(1);
		// driveForward(5);
		//driveForward(2);
		//turn90degrees(1);
		//driveForward(1);
		//driveForward(2);
		driveForward(1);	
		turn90degrees(1);
		driveForward(3);
		turn90degrees(1);
		driveForward(1);
	}

	void driveForward(int distance) {
		driveDirect(400, 400);
		sleep(3200 * distance);
		driveDirect(0, 0);

	}

	public void turn90degrees(int amount) {
		for (int i = 0; i < amount; i = i + 1) {
			driveDirect(-100, 100);
			sleep(1900);
			driveDirect(0, 0);
		}

	}
	

	public void loop() {

	}
}
