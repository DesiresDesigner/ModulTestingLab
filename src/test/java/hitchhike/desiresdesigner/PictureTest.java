package hitchhike.desiresdesigner;

import com.desiresdesigner.hitchhike.*;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class PictureTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void desribTest() throws InterruptedException {
        String expect = "I'm a Star System with 2 stars \n" +
                "I'm a star with size - size of a plate\n" +
                "My color is red\n" +
                "I'm a star with size - size of a plate\n" +
                "My color is red\n" +
                "I'm a planet:red\n" +
                "black\n" +
                ", i'm here: 90, 90, 90\n" +
                "I'm a screen with size - great ";

        Screen screen = new Screen(Size.GREAT);
        StarSystem starSystem = new StarSystem();
        starSystem.constructBinarySystem(100, 100, 100);

        Gradient planetColor = new Gradient();
        planetColor.addColor(Color.RED);
        planetColor.addColor(Color.BLACK);
        Planet planet = new Planet(planetColor);

        Picture picture = new Picture();
        picture.add("screen", screen);
        picture.add("star system", starSystem);
        picture.add("planet", planet);
        assertEquals(picture.describe(), expect);
    }
}
