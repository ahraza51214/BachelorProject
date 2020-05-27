package InitSensor;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class DetectingMotor {
    private EV3MediumRegulatedMotor detectingMotor;

    public DetectingMotor() {
        detectingMotor = new EV3MediumRegulatedMotor(MotorPort.C);
    }

    public void setSpeed(){
        detectingMotor.setSpeed(50);
    }

    public void setRotation(){
        detectingMotor.rotateTo(20);
        detectingMotor.rotateTo(-20);
    }

    public void stop(){
        detectingMotor.stop();
    }
}