package hitchhike.alexseenko;

import com.alexseenko.hitchhike.*;
import com.alexseenko.hitchhike.Smashing;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by DesiresDesigner on 4/14/15.
 */
public class CryTest {

    @Test
    public void descriptionTest() {
        Smashing cry = new Cry(true);
        assertEquals(cry.description(), "jubilant cry");

    }
}
