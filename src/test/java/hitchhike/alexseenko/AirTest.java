package hitchhike.alexseenko;

import org.junit.Test;
import static junit.framework.Assert.*;
import com.alexseenko.hitchhike.*;


/**
 * Created by DesiresDesigner on 4/14/15.
 */
public class AirTest {

    @Test
    public void nameTest() {
        Slippery air = new Air();
        assertEquals(air.getName(), "air");
    }
}
