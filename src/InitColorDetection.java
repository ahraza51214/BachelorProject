import InitSensor.ColorSensor;
import InitSensor.DetectingMotor;

public class InitColorDetection {
    private DetectingMotor detectingMotor;
    protected ColorSensor colorSensor;
    private InitRobot robot;

    public InitColorDetection(){
        detectingMotor = new DetectingMotor();
        colorSensor = new ColorSensor();
        robot = InitRobot.instance;
    }

    public void detect(){
        detectingMotor.setSpeed();
        detectingMotor.setRotation();
        colorSensor.detect();
    }

    public void makeTurnToAvoid(){
        robot.getPilot().travel(-5);
        robot.getPilot().rotate(90);
        robot.getPilot().travel(20);
        robot.getPilot().rotate(-90);
        robot.getPilot().travel(35);
        robot.getPilot().rotate(-90);
        robot.getPilot().travel(20);
        robot.getPilot().rotate(90);
    }

    public void stop(){
        detectingMotor.stop();
    }
}