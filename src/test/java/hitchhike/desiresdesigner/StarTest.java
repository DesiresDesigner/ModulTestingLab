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
public class StarTest {
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
    public void moveTest() {
        Coordinates coordinates = new Coordinates(150, 150, 150);
        Star star = new Star(Size.SIZE_OF_A_PLATE, Color.BLACK);
        star.move(coordinates);
        assertEquals(star.getLocation(), coordinates);
    }
}
