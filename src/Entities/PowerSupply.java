package Entities;

import lombok.Getter;
import lombok.Setter;

public class PowerSupply implements SharedComponentBehavior {
    
    // class fields //
    @Getter @Setter
    private String name;
    
    @Getter @Setter
    private double outputVoltage, ampHours;
    
    
    // class constructor //
    public PowerSupply(String name, double outputVoltage, double ampHours)  {
        this.name = name;
        this.outputVoltage = outputVoltage;
        this.ampHours = ampHours;
    }
    
    
    // class methods //
    @Override
    public String profile()  {
        return "Name: " + name + "\n" +
                "Output Voltage: " + outputVoltage + " V" + "\n" +
                "Amp Hours: " + ampHours + " mA hrs" + "\n";
    }
    
    
}
