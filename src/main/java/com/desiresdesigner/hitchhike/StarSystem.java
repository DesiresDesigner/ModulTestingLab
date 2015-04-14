package com.desiresdesigner.hitchhike;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Наталия on 03.04.2015.
 */
public class StarSystem implements Removable, Describable{
    private List<Star> parts;
    private Coordinates location;

    public StarSystem() {
        parts = new ArrayList();
    }

    public void constructBinarySystem(int x, int y, int z) {
        location = new Coordinates(x, y, z);
        for (int i = 0; i < 2; i ++){
            Star star = new Star(Size.SIZE_OF_A_PLATE, Color.RED);
            star.move(new Coordinates(x - i, y - i, z));
            parts.add(star);
        }
    }

    public boolean isBinary() {
        return (parts.size() == 2);
    }

    @Override
    public Coordinates getLocation() {
        return null;
    }

    @Override
    public void move(Coordinates location) {
        for (int i = 0; i < parts.size(); i++){
            parts.get(i).move(new Coordinates(location.getX() - i, location.getY() - i, location.getZ() - i));
        }
    }

    @Override
    public String describe() {
        String res =  "I'm a Star System with " + parts.size() + " stars \n";
        for (Star s : parts) {
            res += s.describe();
        }
        return res;
    }
}
