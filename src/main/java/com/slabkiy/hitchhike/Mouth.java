package com.slabkiy.hitchhike;

/**
 * Created by Natalia on 02.04.2015.
 */
public class Mouth extends BodyPart {
    private boolean open;

    public Mouth() {
        name = "mouth";
        open = false;
    }

    public void close(){
        open = false;
    }

    public void open(){
        open = true;
    }

    public boolean isOpen(){
        return open;
    }

    @Override
    public String describe() {
        return "I'm a mouth and I'm " + (open ? "open" : "close");
    }
}
