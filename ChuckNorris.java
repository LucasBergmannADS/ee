
package Projeto;


import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.awt.*;



public class ChuckNorris extends Robot {

	public void run() {
	
		setBodyColor(Color.red);
		setGunColor(Color.red);
		setRadarColor(Color.black);

		while (true) {
		 turnGunRight(360);
		 ahead(100);
		   turnLeft(45);
		   ahead(100);
		   turnRight(90);
		   ahead(100);
		 
		}
		 
			}
		    
	public void onScannedRobot(ScannedRobotEvent e) {
		 
		   fire(3);
		   

	}
	
}


	 
