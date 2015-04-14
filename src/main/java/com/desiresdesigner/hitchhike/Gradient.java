package com.desiresdesigner.hitchhike;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Наталия on 03.04.2015.
 */
public class Gradient {
    private List<Color> gradient;

    public Gradient(){
        gradient = new ArrayList();
    }

    public void addColor(Color c) {
        gradient.add(c);
    }

    public String playWithColors() {
        String res = "";
        for (Color c : gradient) {
            if (c == Color.BLACK)
                res += "black\n";
            else if (c == Color.RED)
                res += "red\n";
        }
        return res;
    }
}
