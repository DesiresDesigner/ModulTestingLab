package com.alexseenko.hitchhike;

/**
 * Created by DesiresDesigner on 4/14/15.
 */
public class Main {

    public static void main (String [ ] args) throws InterruptedException {
        Timeline timeline = new Timeline();
        Public crowd = new Public(20);
        double[] arthurStartCoords = {0.0, 0.0};
        double[] bulidingCoords = {10.0, 10.0};
        Building building = new Building(bulidingCoords, 10, 10);
        Speaker speaker = new Speaker("Speaker", building);
        Platform platform = new Platform(speaker);
        Human Arthur = new Human("Arthur", new Outdoors(arthurStartCoords));
        Slippery arthueSlipsOn = new Air();

        building.setStatelyWindow(2, 5);
        building.setPlatformToWindow(2, 5, platform);

        timeline.addEvent(crowd.breakInto(new Cry(true)));
        timeline.addEvent(platform.turnOnBroadcast("Seven and a half million years our people have waited" +
                " for this day for Hope Great insight!"));
        timeline.addEvent(crowd.breakInto(new Cry(true)));
        Event slipOnAir = Arthur.slip(arthueSlipsOn, building.getWindow(2, 5), 1000);
        timeline.addEvent(slipOnAir);
        timeline.addEvent(Arthur.detect(slipOnAir));

        System.out.print(timeline.describeHistory());
    }

}
