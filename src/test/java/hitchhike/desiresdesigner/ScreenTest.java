package hitchhike.desiresdesigner;
import com.desiresdesigner.hitchhike.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class ScreenTest {

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
    public void showTest() throws InterruptedException {
        String expect = "new location: 100, 100, 100\n" +
                "new location: 99, 99, 100\n" +
                "new location: 110, 110, 100\n" +
                "new location: 109, 109, 99\n" +
                "new location: 120, 120, 100\n" +
                "new location: 119, 119, 99\n" +
                "new location: 130, 130, 100\n" +
                "new location: 129, 129, 99\n" +
                "new location: 140, 140, 100\n" +
                "new location: 139, 139, 99\n" +
                "new location: 150, 150, 100\n" +
                "new location: 149, 149, 99\n";

        Screen screen = new Screen(Size.SIZE_OF_A_PLATE);
        StarSystem starSystem = new StarSystem();
        starSystem.constructBinarySystem(100, 100, 100);
        Trajectory path = new Trajectory();
        path.addCoordinates(new Coordinates(110, 110, 100));
        path.addCoordinates(new Coordinates(120, 120, 100));
        path.addCoordinates(new Coordinates(130, 130, 100));
        path.addCoordinates(new Coordinates(140, 140, 100));
        path.addCoordinates(new Coordinates(150, 150, 100));
        screen.show(starSystem, path);
        assertEquals(expect, outContent.toString());
    }
}
