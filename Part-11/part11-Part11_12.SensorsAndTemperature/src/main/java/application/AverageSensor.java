package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readingValues;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readingValues = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return readingValues;
    }
    
    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty()) throw new IllegalStateException("No sensors added to Average Sensor");
        if (!this.isOn()) throw new IllegalStateException("Some sensors are Off");
        
        int sum = this.sensors.stream().map(i -> i.read()).reduce(0, (prev, curr) -> prev + curr);
        int count = this.sensors.size();
        int result = sum / count;
        this.readingValues.add(result);
        return result;
    }

}
