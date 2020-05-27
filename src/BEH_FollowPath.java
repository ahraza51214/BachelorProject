import lejos.robotics.pathfinding.Path;
import lejos.robotics.subsumption.Behavior;

public class BEH_FollowPath implements Behavior {
    private InitRobot robot;

    public BEH_FollowPath(Path route) {
        robot = InitRobot.instance;
        robot.getNavigator().setPath(route);
    }

    public boolean takeControl() {
        return !robot.getNavigator().pathCompleted();
    }

    public void action() {
        robot.getPilot().setLinearSpeed(4);
        robot.getPilot().setAngularSpeed(25);
        robot.getNavigator().followPath();
        robot.getColorDetection().detect();
        robot.getObjectDetection().detect();
    }

    public void suppress() {
        robot.getNavigator().stop();
        robot.getColorDetection().stop();
    }
}