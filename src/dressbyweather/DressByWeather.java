/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dressbyweather;

import java.util.Scanner;

/**
 *This is main class of the Application from where execution starts
 * @author Hemanth Atluri
 */
public class DressByWeather {

    /**
     * Main method for entire application
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String temperature = scan.next();
        String[] commandSequence = scan.nextLine().split(",");
        TemperatureObject tempObj = new TemperatureObject(temperature, commandSequence);
        Temperature temp = tempObj.getTemperature();
        if(temp != null){
            temp.doPerform(commandSequence);
        }
        else{
        return;
        }
        
    }
    
}
