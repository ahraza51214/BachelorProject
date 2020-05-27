package InitSensor;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.NXTUltrasonicSensor;
import lejos.robotics.SampleProvider;

public class ObjectSensor {
    private NXTUltrasonicSensor objectSensor;

    public ObjectSensor() {
        objectSensor = new NXTUltrasonicSensor(SensorPort.S1);
    }

    public float getDistance(){
        SampleProvider sp = objectSensor.getDistanceMode();
        float[] sample = new float[sp.sampleSize()];
        sp.fetchSample(sample,0);
        float distance = sample[0];
        return distance;
    }
}
