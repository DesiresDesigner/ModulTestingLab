package com.desiresdesigner; /**
 * Created by Natalia on 19.03.2015.
 */

public class PowerSeries {

    //public static int main(String[] args) { // input expects a value of cosines
    public static double arcTan(double tan) { // input expects a value of cosines

        /*if (tan > 1 || tan < -1) {
            System.out.println("You are wrong! X ranges from -1 to 1");
            return -1;
        }*/


        int accuracy = 50;
        double result = 0;

        for (int i = 0; i < accuracy; i++)
            result += (Math.pow(-1, i)*Math.pow(tan, 2*i+1))/(2*i+1);

        /*double result = tan;
        result -= Math.pow(tan, 3) / 3;
        result += Math.pow(tan, 5) / 5;
        result -= Math.pow(tan, 7) / 7;*/
        System.out.println("For tan = " + tan + " alpha = " + result);
        return result;
    }
}