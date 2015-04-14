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
public class Window extends Place {
    private boolean stately;
    private Platform platform;
    private int level;

    public Window(double[] coords, boolean stately, Platform platform, int level) {
        name = "window";
        x = coords[0];
        y = coords[1];
        this.stately = stately;
        this.platform = platform;
        this.level = level;
    }

    public boolean isStately() {
        return stately;
    }

    public void setStately(boolean stately) {
        this.stately = stately;
    }

    public int getLevel() {
        return level;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        platform.setLevel(level);
        this.platform = platform;
        
    }
    
    
}
