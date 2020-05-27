package InitSensor;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

public class ColorSensor {
    private EV3ColorSensor colorSensor;

    public ColorSensor(){
       colorSensor  = new EV3ColorSensor(SensorPort.S2);
    }

    public int detect() {
        int color = colorSensor.getColorID();
        return color;
    }
}
