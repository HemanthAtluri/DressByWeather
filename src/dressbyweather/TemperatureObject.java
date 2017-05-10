/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dressbyweather;

/**
 *This class represents temperature object with two properties
 * @author Hemanth Atluri
 */
public class TemperatureObject {

    private String temperature;
    private String[] commands;
    
    /**
     *This is default constructor
     */
    public TemperatureObject() {
        
    }

    /**
     *This getter method returns Temperature object or null basing on the input given by the user
     * @return Temperature object basing on the input given by user
     */
    public Temperature getTemperature() {
        if (temperature.equals("HOT")) {
            return new HotTemperature();
        } else if (temperature.equals("COLD")) {
            return new ColdTemperature();
        } else {
            System.out.println("fail");
            return null;
        }
    }

    /**
     *This is setter method which initializes temperature property with the input passed by this method
     * @param temperature is input parameter of type String
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     *This is a getter method which returns array of Strings
     * @return array of Strings
     */
    public String[] getCommands() {
        return commands;
    }

    /**
     *This is setter method which initializes command property with the input passed by this method
     * @param commands is input parameter which is array of type String
     */
    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    /**
     *This is constructor with two properties.
     * @param temperature input parameter of type String
     * @param commands input parameter which is array of type String
     */
    public TemperatureObject(String temperature, String[] commands) {
        this.temperature = temperature;
        this.commands = commands;
    }

}
