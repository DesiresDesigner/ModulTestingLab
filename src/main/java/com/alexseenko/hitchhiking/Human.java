/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexseenko.hitchhiking;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author 123
 */
public class Human {
   
    protected String name;
    protected Place location;
    
    public Human(String name, Place location) {
        this.name = name;
        this.location = location;
    }
     
    public String getName() {
        return name;
    }
    
    public Event detect(Event e) {
        return new Event(name + "detect new event: " + e.describe());
    }
    
    public Event slip (Slippery surface, Place destination, long timems) throws InterruptedException {
        double currentX = location.getCoords()[0], currentY = location.getCoords()[1];
        double deltaX = currentX-destination.getCoords()[0], deltaY = currentY-destination.getCoords()[1];
        
        while (currentX != destination.getCoords()[0]) {
            currentX -= deltaX/timems;
            System.out.println("New coordinates: " + currentX + ", " + currentY);
            TimeUnit.MICROSECONDS.sleep(1);
        }
        
        while (currentY != destination.getCoords()[1]) {
            currentY -= deltaY/timems;
            System.out.println("New coordinates: " + currentX + ", " + currentY);
            TimeUnit.MICROSECONDS.sleep(1);
        }
        
        String event = name + " slip on " + surface.getName() + " from (" + location.getCoords()[0] + ", " + location.getCoords()[1] +
                ") to (" + destination.getCoords()[0] + destination.getCoords()[1] + ")";
        location = destination;
        
        return new Event(event);
    }
    
    public Event hear(String speach) throws InterruptedException {
        TimeUnit.SECONDS.sleep(speach.length()/15);
        return new Event(name + " heard the next speach: " + speach);
    }
    
    
    
    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }
}
