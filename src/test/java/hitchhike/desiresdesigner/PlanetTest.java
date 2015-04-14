package hitchhike.desiresdesigner;

import com.desiresdesigner.hitchhike.*;
import junit.framework.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class PlanetTest {
    @Test
    public void moveTest() {
        Coordinates coordinates = new Coordinates(150, 150, 150);
        Gradient gradient = new Gradient();
        gradient.addColor(Color.BLACK);
        gradient.addColor(Color.RED);
        Planet planet = new Planet(gradient);
        planet.move(coordinates);
        assertEquals(planet.getLocation(), coordinates);
    }
}
