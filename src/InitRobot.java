import InitSensor.Motor;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.localization.OdometryPoseProvider;
import lejos.robotics.navigation.MovePilot;
import lejos.robotics.navigation.Navigator;

public class InitRobot {
	static InitRobot instance;
    private Motor motor;
    private MovePilot pilot;
    private OdometryPoseProvider locationProvider;
    private Navigator navigator;
    private InitColorDetection colorDetection;
    private InitObjectDetection objectDetection;


    public InitRobot(){
        instance = this;
        motor = new Motor();
        pilot = new MovePilot(chassis());
        locationProvider = new OdometryPoseProvider(getPilot());
        navigator = new Navigator(getPilot(), getLocationProvider());
    	colorDetection = new InitColorDetection();
    	objectDetection = new InitObjectDetection();
    }

    public Chassis chassis() {
        // Setting up the wheel diameter (3.12 cm), and the distance from center of a wheel to center of robot (offset= 8,75 cm)
        Wheel wheel1 = WheeledChassis.modelWheel(motor.leftMotor, 3.12).offset(-8.75);
        Wheel wheel2 = WheeledChassis.modelWheel(motor.rightMotor, 3.12).offset(8.75);

        // Setting up the chassis type, Using the Chassis leJOS class, with Differential pilot interface.
        Chassis chassis = new WheeledChassis(new Wheel[] { wheel1, wheel2 }, WheeledChassis.TYPE_DIFFERENTIAL);
        return chassis;
    }

    public MovePilot getPilot() {
        return this.pilot;
    }

    public OdometryPoseProvider getLocationProvider(){
        return this.locationProvider;
    }

    public Navigator getNavigator(){
        return this.navigator;
    }

    public InitColorDetection getColorDetection(){
        return this.colorDetection;
    }

    public InitObjectDetection getObjectDetection(){
        return this.objectDetection;
    }
}