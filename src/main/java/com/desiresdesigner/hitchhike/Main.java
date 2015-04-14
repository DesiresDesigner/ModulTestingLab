package com.desiresdesigner.hitchhike;


/**
 * Created by Наталия on 03.04.2015.
 */
public class Main {
    public static void main (String [ ] args) throws InterruptedException {
        Human witness = new Human("Someone");
        witness.seePicture(null);

        Screen screen = new Screen(Size.GREAT);
        StarSystem starSystem = new StarSystem();
        starSystem.constructBinarySystem(100, 100, 100);
        Trajectory path = new Trajectory();
        path.addCoordinates(new Coordinates(110, 110, 100));
        path.addCoordinates(new Coordinates(120, 120, 100));
        path.addCoordinates(new Coordinates(130, 130, 100));
        path.addCoordinates(new Coordinates(140, 140, 100));
        path.addCoordinates(new Coordinates(150, 150, 100));
        screen.show(starSystem, path);

        Gradient planetColor = new Gradient();
        planetColor.addColor(Color.RED);
        planetColor.addColor(Color.BLACK);
        Planet planet = new Planet(planetColor);
        Trajectory planetPath = new Trajectory();
        planetPath.addCoordinates(new Coordinates(100, 100, 100));
        screen.show(planet, planetPath);

        Picture picture = new Picture();
        picture.add("screen", screen);
        picture.add("star system", starSystem);
        picture.add("planet", planet);
        witness.seePicture(picture);
    }
}

