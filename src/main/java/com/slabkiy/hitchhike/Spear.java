package com.slabkiy.hitchhike;

/**
 * Created by Natalia on 02.04.2015.
 */
public class Spear extends Weapon {
    private boolean power;

    public Spear() {
        name = "spear";
    }

    @Override
    public String describe() {
        return "I'm a spear and " + ((hitArea == null)? "I haven't hit anything yet" : "and I've hit a " + hitArea.getName());
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
