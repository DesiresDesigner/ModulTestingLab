package com.slabkiy.hitchhike;

/**
 * Created by Natalia on 02.04.2015.
 */
public abstract class Weapon implements Describable {
    protected String name;
    protected BodyPart hitArea;

    public void setHitArea(BodyPart hitArea) {
        this.hitArea = hitArea;
    }

    public BodyPart getHitArea() {
        return hitArea;
    }

    public String getName(){return name;}
}
