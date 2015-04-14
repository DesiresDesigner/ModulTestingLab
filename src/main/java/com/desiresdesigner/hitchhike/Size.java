package com.desiresdesigner.hitchhike;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public enum Size {
    LARGE,
    GREAT,
    SIZE_OF_A_PLATE;

    public String toString(Size s) {
        if (s == Size.SIZE_OF_A_PLATE)
            return "size of a plate";
        else if (s == Size.LARGE)
            return  "large";
        else if (s == Size.GREAT)
            return "great ";
        return "";
    }
}
