/**
 * Created by Natalia on 19.03.2015.
 */
package com.slabkiy;

public class PowerSeries {

    public static long factorial(long n){
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }

    public static double arcCos(double cos) { // input expects a value of cos

        if (cos > 1 || cos < -1) {
            System.out.println("You are wrong! X ranges from -1 to 1");
            return -1;
        }

        int accuracy = 50;
        double result = Math.PI / 2;

        for (int i = 0; i < accuracy; i++)
            result -= (factorial(2*i)*Math.pow(cos, 2*i+1))/(Math.pow(4, i)*Math.pow(factorial(i), 2)*(2*i+1));

        System.out.println("For cos = " + cos + " alpha = " + result);

        return result;
    }
}