import lejos.hardware.Sound;
import lejos.robotics.Color;
import lejos.robotics.subsumption.Behavior;
import lejos.utility.Delay;

public class BEH_ColorDetection implements Behavior {
    private InitRobot robot;

    public BEH_ColorDetection(){
        robot = InitRobot.instance;
    }

    public boolean takeControl() {
        return robot.getColorDetection().colorSensor.detect() == Color.BLUE;
    }

    public void action() {
        Sound.twoBeeps();
        robot.getLocationProvider().getPose();
        System.out.println(robot.getLocationProvider().getPose());
        Delay.msDelay(5000);
        robot.getPilot().setLinearSpeed(4);
        robot.getPilot().setAngularSpeed(25);
        robot.getColorDetection().makeTurnToAvoid();
    }

    public void suppress() {
        robot.getColorDetection().stop();
        robot.getNavigator().stop();
    }
}