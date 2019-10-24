package Entities;

public class Example {

    public static void main(String[] args) {
        
        // make some components //
        PowerSupply powerOne = new PowerSupply("Example Battery", 9, 10);
        Motor motorOne = new Motor("Example Motor", 5, 5);
        Camera cameraOne = new Camera("Example Camera", 5, 2);
        Microprocessor microprocessorOne = new Microprocessor("Example Microprocessor", 2, 2);
        Sensor sensorOne = new Sensor("Example Sensor", 2, 2);
        
        
        // make a new power configuration //
        PowerConfiguration powerConfig = new PowerConfiguration("My Configuration");
        
        
        // add some components to the configuration //
        powerConfig.addPowerSupplies(powerOne);
        powerConfig.addCamera(cameraOne);
        powerConfig.addMotors(motorOne);
        powerConfig.addMicroprocessor(microprocessorOne);
        powerConfig.addSensors(sensorOne);
        
        
        // now we can calculate the performance of the configuration //
        Calculator.calculate(powerConfig);
        
    }
    
}
    

