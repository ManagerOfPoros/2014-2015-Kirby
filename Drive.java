package org.usfirst.frc.team5554.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Victor;



public class Drive {
	private Victor Right;
	private Victor Left;
	private Victor Omni;
	
	Drive (int RIGHT_MOTOR_PORT, int LEFT_MOTOR_PORT,  int OMNI_MOTOR_PORT){
		Right = new Victor(RIGHT_MOTOR_PORT);
		Left = new Victor (LEFT_MOTOR_PORT);
		Omni = new Victor (OMNI_MOTOR_PORT);
	}
	
	public void Driving (double Y, double X, double Z, double S){
		S = (S+1)/2;
		Y=-Y;
		Right.set(Y*S+Z*S);
		Left.set(Y*S-Z*S);
		Omni.set(X*S);
	
	}
	
	
}
