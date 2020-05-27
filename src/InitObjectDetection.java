import InitSensor.ObjectSensor;

public class InitObjectDetection {
    protected ObjectSensor objectSensor;
    private InitRobot robot;

    public InitObjectDetection(){
        objectSensor = new ObjectSensor();
        robot = InitRobot.instance;
    }

    public void detect(){
        objectSensor.getDistance();
    }

    public void makeTurnToAvoid(){
        robot.getPilot().rotate(90);
        robot.getPilot().travel(20);
        robot.getPilot().rotate(-90);
        robot.getPilot().travel(45);
        robot.getPilot().rotate(-90);
        robot.getPilot().travel(20);
        robot.getPilot().rotate(90);
    }
}