package hitchhike.desiresdesigner;

import com.desiresdesigner.hitchhike.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Natalia on 02.04.2015.
 */
public class HumanTest {
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
    public void nameTest() {
        Human h = new Human("Natali");
        assertEquals (h.getName(), "Natali");
    }

    @Test
    public void seeNullTest() {
        Human h = new Human("Natali");
        h.seePicture(null);
        assertEquals("...\n", outContent.toString());
    }

    @Test
    public void seeNotNullTest() {
        Human h = new Human("Natali");
        Picture pic = new Picture();
        Screen screen = new Screen(Size.GREAT);
        pic.add("screen", screen);

        h.seePicture(pic);
        assertEquals("I'm a screen with size - great \n", outContent.toString());
    }
}
