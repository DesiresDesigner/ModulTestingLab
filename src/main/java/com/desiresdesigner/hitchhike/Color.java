package com.desiresdesigner.hitchhike;

/**
 * Created by Наталия on 03.04.2015.
 */
public enum Color {
    RED,
    BLACK;

    public String toString(Color s) {
        if (s == Color.BLACK)
            return "black";
        else if (s == Color.RED)
            return  "red";
        return "";
    }
}
