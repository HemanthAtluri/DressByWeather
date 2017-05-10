/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTesting;

import dressbyweather.Temperature;
import dressbyweather.TemperatureObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Hemanth Atluri
 */
public class DressByWeatherTest {

    private TemperatureObject hotTemperature;
    private Temperature temperature;

    @Before
    public void beforeTest() {
        hotTemperature = new TemperatureObject();
        hotTemperature.setTemperature("HOT");
        String[] commands = {"8", "6", "4", "2","1","7"};
        hotTemperature.setCommands(commands);
        temperature = hotTemperature.getTemperature();
    }

    @Test
    public void testDressByWeather() {
      temperature.doPerform(hotTemperature.getCommands());
        
            }

    @After
    public void afterTest() {
        temperature = null;
        hotTemperature = null;
          }

}
