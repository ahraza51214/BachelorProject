package InitSensor;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Motor {
    public EV3LargeRegulatedMotor leftMotor;
    public EV3LargeRegulatedMotor rightMotor;

    public Motor(){
        leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);
        rightMotor = new EV3LargeRegulatedMotor(MotorPort.D);
    }
}
