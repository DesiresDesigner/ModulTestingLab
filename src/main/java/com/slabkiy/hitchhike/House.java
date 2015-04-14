package com.slabkiy.hitchhike;

/**
 * Created by Natalia on 02.04.2015.
 */
public class House extends Location {
    private Object eatenBy;
    private Human owner;

    public House() {
        name = "house";
    }

    House(String x_y) {
        name = "outside";
        setCoordinates(x_y);
    }

    public void eatUp(Object o) {
        eatenBy = o;
    }

    public void stopEating() {
        eatenBy = null;
    }

    public Object isEatingUpBy() {
        return eatenBy;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    @Override
    public String describe() {
        String result =  "I'm a house\n";
        if (eatenBy != null)
            result += "i'm eaten by " + eatenBy.getClass().getSimpleName() + "\n";
        if (owner != null)
            result += "my owner is " + owner.getName();
        return result;
    }
}
