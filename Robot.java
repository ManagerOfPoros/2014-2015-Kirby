
package org.usfirst.frc.team5554.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	Lift lift;
	Drive Drive;
	Joystick Joy;
	double Y;
	double X ;
	double Z;
	double S;
	boolean isUp;
	boolean isDown;
	
    public void robotInit() {
    	lift = new Lift (Reference.LIFT_MOTOR_PORT, Reference.UP_MICROSWITCH_PORT, Reference.DOWN_MICROSWITCH_PORT);
    	Drive = new Drive (Reference.RIGHT_MOTOR_PORT, Reference.LEFT_MOTOR_PORT,Reference.OMNI_MOTOR_PORT);
    	Joy = new Joystick (0);
    	isUp = Joy.getRawButton(1);
    	isDown= Joy.getRawButton(2);
    	Y = Joy.getRawAxis(1);
    	X = Joy.getRawAxis(0);
    	Z = Joy.getRawAxis(2);
    	S = Joy.getRawAxis(3);
    }
    
    public void autonomousInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
     }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
    Drive.Driving(Y, X, Z, S);
    
    if (isUp == true)
    	lift.upLifting();
    else
    if (isDown == true)
    	lift.downLifting();
    else
    	lift.Stop();
    	
    	
    	
 
    	
    	
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
