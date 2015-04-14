package com.desiresdesigner.hitchhike;

import java.util.concurrent.TimeUnit;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class Screen implements Describable{

    Size size;

    public Screen(Size size) {
        this.size = size;
    }


    public void show (Removable object, Trajectory path) throws InterruptedException {
        //Coordinates current = object.getLocation();
        /*
        Coordinates newLocation;
        while ((newLocation = path.getNext()) != null) {
            object.move(newLocation);
            TimeUnit.NANOSECONDS.sleep(100);
        }*/

    }

    @Override
    public String describe() {
        return "I'm a screen with size - " + size.toString(size);
    }
}
