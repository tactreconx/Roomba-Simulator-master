package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveForward(2);
		turn90degrees(1);
		driveForward(3);
		turn90degrees(3);
		driveForward(2);

	}
	void driveForward(int distance) {
		driveDirect(400, 400);
		sleep(2200 * distance);
		driveDirect(0, 0);

	}

	public void turn90degrees(int amount) {
		for (int i = 0; i < amount; i = i + 1) {
			driveDirect(-100, 100);
			sleep(1500);
			driveDirect(0, 0);
		}
	}

	public void loop() {
	
	}
}
