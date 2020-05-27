import lejos.hardware.Sound;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;

public class BEH_ObjectDetection implements Behavior {
    InitRobot robot;

    public BEH_ObjectDetection(){
        robot = InitRobot.instance;
    }

    public boolean takeControl() {
        return robot.getObjectDetection().objectSensor.getDistance() < 0.1;
    }

    public void action() {
        Sound.beep();
        Delay.msDelay(3000);
        robot.getPilot().setLinearSpeed(4);
        robot.getPilot().setAngularSpeed(25);
        robot.getObjectDetection().makeTurnToAvoid();
    }

    public void suppress() {
        robot.getPilot().stop();
        robot.getColorDetection().stop();
    }
}
