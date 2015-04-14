package com.desiresdesigner.hitchhike;

/**
 * Created by Наталия on 03.04.2015.
 */
public class Star implements Removable, Describable {
    private Size size;
    private Color color;
    private Coordinates coordinates;

    public Star(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public Coordinates getLocation() {
        return coordinates;
    }

    @Override
    public void move(Coordinates location) {/*
        coordinates = location;
        System.out.println("new location: " + location.describe());*/
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String describe() {
        String result = "I'm a star with size - " + size.toString(size) + "\n";
        result += "My color is " + color.toString(color) + "\n";
        return result;
    }
}
