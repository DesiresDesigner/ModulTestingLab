package com.slabkiy.hitchhike;

/**
 * Created by Natalia on 02.04.2015.
 */
public class Outside extends Location {
    public Outside() {
        name = "outside";
    }

    Outside(String x_y) {
        name = "outside";
        setCoordinates(x_y);
    }

    @Override
    public String describe() {
        return "I'm Outside!";
    }
}
