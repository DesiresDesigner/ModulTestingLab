package com.desiresdesigner.hitchhike;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class Trajectory {
    private List<Coordinates> path;
    private int pointer = 0;

    public Trajectory() {
        path = new ArrayList();
    }

    public void addCoordinates(Coordinates c) {
        path.add(c);
    }

    public boolean hasNext() {
        return pointer < path.size();
    }

    public Coordinates getNext() {
        return hasNext() ? path.get(pointer++) : null;
    }

    public void nullPointer() {
        pointer = 0;
    }

}
