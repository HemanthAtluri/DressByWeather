/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dressbyweather;

import java.util.ArrayList;

/**
 * This is an interface with two static methods and two Abstract methods for which definitions will be provided by the class which implements this Interface
 * @author Hemanth Atluri
 */
public interface Temperature {

    ArrayList<String> output = new ArrayList<String>();

    /*
	 * This method is static void in interface which is new features in Java 8 and used this method for printing elements in ArrayList
     */
    public static void printOutput() {
        output.forEach((str) -> {
            System.out.println(str);
        });

    }

    /*
	 * This method accepts string as input and input is added to the ArrayList
	 * @param s is input of type String and this input element has to be added to the ArrayList
     */
    public static void addOutput(String s) {
        output.add(s);
    }

    /*
	 * This is a Abstract method and its definition depends on the class which implements this Interface
	 * @param s is input type of String.
     */
    public void getCommand(String s);

    /*
	 * This is a Abstract method and its definition depends on the class which implements this Interface
	 * @param s is input type of String.
     */
    public void doPerform(String[] s);

}
