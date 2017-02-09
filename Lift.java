package org.usfirst.frc.team5554.robot;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;

public class Lift {
	
	private Victor Lift;
	private DigitalInput upSwitch;
	private DigitalInput downSwitch;
	
	
	Lift(int LIFT_MOTOR_PORT, int UP_MICROSWITCH_PORT , int DOWN_MICROSWITCH_PORT){
		Lift = new Victor (LIFT_MOTOR_PORT) ;
		upSwitch = new DigitalInput(UP_MICROSWITCH_PORT);
		downSwitch = new DigitalInput(DOWN_MICROSWITCH_PORT);
	}
	
	public void upLifting(){
		if (upSwitch.get()== true)
		Lift.set(0.4);
	}
	
	public void downLifting(){
		if (downSwitch.get()== true)	
		Lift.set(-0.2);
	}
	
	public void Stop(){
		Lift.set(0);
	}
	
}
