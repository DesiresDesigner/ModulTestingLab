/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexseenko.hitchhike;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author 123
 */
public class Speaker extends Human{

    public Speaker(String name, Place location) {
        super(name, location);
    }
    
    public Event speak(String speech, long timeNS) throws InterruptedException {
        if (timeNS == 0)
            timeNS = 1000000000;
        String res = name + " says: \n";
        System.out.print(res);
        if (speech.length() > 0) {
            long timeToWait = timeNS/speech.length();
            for (int i = 0; i < speech.length(); i++) {
                System.out.print(speech.charAt(i));
                res += speech.charAt(i);
                TimeUnit.NANOSECONDS.sleep(timeToWait);
            }
            res += "\n";
            System.out.println();
        } else {
            res = "...\n";
            System.out.println("...");
        }
        return new Event(res);
    }
}
