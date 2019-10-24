package Entities;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

public class PowerConfiguration {
    
    // class fields //
    @Getter @Setter
    private String name;
    
    @Getter @Setter
    private ArrayList<PowerSupply> powerSupplies;
    
    @Getter @Setter
    private ArrayList<Sensor> sensors;
    
    @Getter @Setter
    private ArrayList<Motor> motors;
    
    @Getter @Setter
    private ArrayList<Camera> cameras;
    
    @Getter @Setter
    private ArrayList<Microprocessor> microprocessors;
    
    
    // class constructor //
    public PowerConfiguration(String name)  {
        this.powerSupplies = new ArrayList();
        this.sensors = new ArrayList();
        this.motors = new ArrayList();
        this.cameras = new ArrayList();
        this.microprocessors = new ArrayList();
        this.name = name;
    }
    
    
    // class methods //
    public void addPowerSupplies(PowerSupply...powerSupplies)  {
        for (int i = 0; i < powerSupplies.length; i++)  {
            this.powerSupplies.add(powerSupplies[i]);
        }
    }
    
    public void addSensors(Sensor...sensors)  {
        for (int i = 0; i < sensors.length; i++)  {
            this.sensors.add(sensors[i]);
        }
    }
    
    public void addMotors(Motor...motors)  {
        for (int i = 0; i < motors.length; i++)  {
            this.motors.add(motors[i]);
        }
    }
    
    public void addCamera(Camera...cameras)  {
        for (int i = 0; i < cameras.length; i++)  {
            this.cameras.add(cameras[i]);
        }
    }
    
    public void addMicroprocessor(Microprocessor...microprocessors)  {
        for (int i = 0; i < microprocessors.length; i++)  {
            this.microprocessors.add(microprocessors[i]);
        }
    }
    
}
