import lejos.robotics.pathfinding.Path;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class LandmineDetector {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        new InitRobot();
        InitPath initPath = new InitPath();
        Path setPath = initPath.getPath();
        Behavior b1 = new BEH_FollowPath(setPath);
        Behavior b2 = new BEH_ObjectDetection();
        Behavior b3 = new BEH_ColorDetection();
        Behavior [] behaviors = {b1, b2, b3};
        Arbitrator arbitrator = new Arbitrator(behaviors);
        arbitrator.go();
    }
}