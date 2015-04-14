package com.alexseenko.hitchhike;

/**
 * Created by DesiresDesigner on 4/14/15.
 */
public class Cry implements Smashing {

    private boolean jubilant;

    public Cry(boolean jubilant) {
        this.jubilant = jubilant;
    }

    @Override
    public String description() {
        return (jubilant ? "jubilant " : "") + "cry";
    }
}
