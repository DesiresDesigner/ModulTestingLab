package com.slabkiy.hitchhike;

/**
 * Created by Natalia on 02.04.2015.
 */
public abstract class Location implements Describable{
    protected String name;
    protected int x, y;

    public void setCoordinates(String x_y) {
        String[] coordinates = x_y.split("_");
        x = Integer.parseInt(coordinates[0]);
        y = Integer.parseInt(coordinates[1]);
    }

    public String getCoordinates() {
        return (x + "_" + y);
    }

    public String getName() {
        return name;
    }
}
