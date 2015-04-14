package com.alexseenko;

import java.util.ArrayList;

public class Sin {
    public static double value(double x) {
        ArrayList<Double> elem = new ArrayList<Double>();
        elem.add(x);
        for(int i = 1; i < 97; ++i)
        {
            elem.add(-1 * elem.get(i - 1) * x * x / ((i * 2) * (i * 2 + 1)));
        }
        return elem.stream().mapToDouble(Double::doubleValue).sum();
    }
}
