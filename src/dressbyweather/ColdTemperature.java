/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dressbyweather;

import java.util.HashMap;

/**
 *This is the class for cold temperature, implements Temperature interface.This class provides definition for the abstract methods.
 * @author Hemanth Atluri
 */
public class ColdTemperature implements Temperature {

    /**
     *This method provides definition by overriding method in interface and this method uses switch case basing on the input
     * @param s is a input of type String, this is command entered by the used
     */
    @Override
    public void getCommand(String s) {
        switch (s) {

            case " 1":
                Temperature.addOutput("boots");
                break;
            case " 2":
                Temperature.addOutput("hat");
                break;
            case " 3":
                Temperature.addOutput("socks");
                break;
            case " 4":
                Temperature.addOutput("shirt");
                break;
            case " 5":
                Temperature.addOutput("jacket");
                break;
            case " 6":
                Temperature.addOutput("pants");
                break;
            case " 7":
                Temperature.addOutput("leaving house");
                break;
            case " 8":
                Temperature.addOutput("Removing PJs");
                break;
            default:
                Temperature.addOutput("fail");
                break;
        }
    }

    /**
     *This method performs the logic basing on the business rules
     * @param s is an array of Strings entered by the user
     */
    @Override
    public void doPerform(String[] s) {
        HashMap hashMap = new HashMap();
        if (!s[0].equals(" 8")) {
            System.out.println("fail");
            return;
        }

        for (int i = 0; i < s.length; i++) {
            if (hashMap.containsKey(s[i])) {
                Temperature.addOutput("fail");
                break;
            }

            hashMap.put(s[i], i);
            
            if (hashMap.containsKey(" 3") && hashMap.containsKey(" 1") && ((int) hashMap.get(" 3") > (int) hashMap.get(" 1"))) {
                Temperature.addOutput("fail");
                break;
            } else if (hashMap.containsKey(" 6") && hashMap.containsKey(" 1") && ((int) hashMap.get(" 6") > (int) hashMap.get(" 1"))) {
                Temperature.addOutput("fail");
                break;
            } else if (hashMap.containsKey(" 4") && hashMap.containsKey(" 2") && hashMap.containsKey(" 5") && ((int) hashMap.get(" 4") > (int) hashMap.get(" 2")) && ((int) hashMap.get(" 4") > (int) hashMap.get(" 5"))) {
                Temperature.addOutput("fail");
                break;
            } else if (s[i].equals(" 7")) {
                if (!(hashMap.containsKey(" 1") && hashMap.containsKey(" 2") && hashMap.containsKey(" 4") && hashMap.containsKey(" 6"))) {
                    Temperature.addOutput("fail");
                    break;
                } else {
                    getCommand(s[i]);
                    break;
                }
            } else {
                getCommand(s[i]);
            }
        }

        Temperature.printOutput();

    }

}
