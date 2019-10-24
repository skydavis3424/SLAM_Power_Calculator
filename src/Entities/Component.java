package Entities;

import lombok.Getter;
import lombok.Setter;

public abstract class Component implements SharedComponentBehavior {
    
    // class fields //
    @Getter @Setter
    String name;
    
    @Getter @Setter
    double inputVoltage, currentDraw;
    
    
    // class constructor //
    public Component(String name, double inputVoltage, double currentDraw)  {
        this.name = name;
        this.inputVoltage = inputVoltage;
        this.currentDraw = currentDraw;
    }
    
    
    // class methods //
    @Override
    public String profile()  {
        return "Name: " + name + "\n" +
                "Input Voltage: " + inputVoltage + " V" + "\n" +
                "Current Draw: " + currentDraw + " mA" + "\n";
    }
    
}
