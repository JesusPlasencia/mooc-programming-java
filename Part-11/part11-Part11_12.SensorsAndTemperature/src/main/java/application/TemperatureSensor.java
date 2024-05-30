package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean state;

    public TemperatureSensor() {
        this.state = false;
    }
    
    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        if (!isOn()) throw new IllegalStateException("Temperature State is off");
        return new Random().nextInt(61) - 30; // [0-60] - 30 = [-30 -- 30]
    }

    
    
}
