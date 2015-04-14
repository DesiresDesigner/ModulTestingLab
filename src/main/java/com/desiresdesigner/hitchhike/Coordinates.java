package com.desiresdesigner.hitchhike;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class Coordinates implements Describable {
    private int x, y, z;

    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String describe() {
        return (x + ", " + y + ", " + z);
    }
}
