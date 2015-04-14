package com.desiresdesigner.hitchhike;

/**
 * Created by Наталия on 03.04.2015.
 */
public class Planet implements Removable, Describable{
    private Gradient color;
    private Coordinates location;

    public Planet(Gradient color) {
        this.color = color;
        location = new Coordinates(90, 90, 90);
    }

    @Override
    public String describe() {
        return "I'm a planet:" + color.playWithColors() + ", i'm here: " + location.describe() + "\n";
    }

    @Override
    public Coordinates getLocation() {
        return location;
    }

    @Override
    public void move(Coordinates location) {
        this.location = location;
    }
}
