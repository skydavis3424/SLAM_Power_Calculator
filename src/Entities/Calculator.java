package Entities;

import lombok.Getter;
import lombok.Setter;

public final class Calculator {

    // class constructor //
    private Calculator()  {
        // private default constructor //
    }
    
    // class methods //
    public static void calculate(PowerConfiguration config)  {
        
        if (config.getPowerSupplies().size() > 1)  {
            System.out.println("Only a single power supply is allowed with this version.");
            return;
        }
        
        PowerSupply battery = config.getPowerSupplies().get(0);
        double capacity = config.getPowerSupplies().get(0).getAmpHours();
        double currentDraw = 0;
        
        System.out.println(battery.profile());
        
        for (int i = 0; i < config.getCameras().size(); i++)  {
            currentDraw = currentDraw + config.getCameras().get(i).getCurrentDraw();
            System.out.println(config.getCameras().get(i).profile());
        }
        
        for (int i = 0; i < config.getMotors().size(); i++)  {
            currentDraw = currentDraw + config.getMotors().get(i).getCurrentDraw();
            System.out.println(config.getMotors().get(i).profile());
        }
        
        for (int i = 0; i < config.getSensors().size(); i++)  {
            currentDraw = currentDraw + config.getSensors().get(i).getCurrentDraw();
            System.out.println(config.getSensors().get(i).profile());
        }
        
        for (int i = 0; i < config.getMicroprocessors().size(); i++)  {
            currentDraw = currentDraw + config.getMicroprocessors().get(i).getCurrentDraw();
            System.out.println(config.getMicroprocessors().get(i).profile());
        }
        
        double hours = capacity / currentDraw;
        
        System.out.println("This configuration will run for " + hours + " hrs");
        
        
    }
}
