/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexseenko.hitchhike;

/**
 *
 * @author 123
 */
public abstract class Place {
    protected double x, y;
    protected String name;
    
    public String getName() {
        return name;
    }
    public double[] getCoords() {
        double[] coords = {x, y};
        return coords;
    }
    
    /*public void setCoords(double[] coords) {
        x = coords[0];
        y = coords[1];
    }*/
}
