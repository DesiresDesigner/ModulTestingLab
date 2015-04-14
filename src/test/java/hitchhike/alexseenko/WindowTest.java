package hitchhike.alexseenko;

import com.alexseenko.hitchhike.*;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by DesiresDesigner on 4/14/15.
 */
public class WindowTest {

    @Test
    public void statelyTest() {
        double[] coords = {0.0, 0.0};
        Window window = new Window(coords, false, null, 0);
        assertEquals(window.isStately(), false);
        window.setStately(true);
        assertEquals(window.isStately(), true);
    }

    @Test
    public void platformTest() {
        double[] coords = {0.0, 0.0};
        Window window = new Window(coords, false, null, 0);
        assertEquals(window.getPlatform(), null);
        window.setPlatform(new Platform(new Speaker("Slava", window)));
        assertEquals(window.getPlatform() != null, true);
    }
}
