package hitchhike.alexseenko;

import com.alexseenko.hitchhike.*;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by DesiresDesigner on 4/14/15.
 */
public class EventTest {

    @Test
    public void descriptionTest() {
        Event e = new Event("Description of event");
        assertEquals(e.describe(), "Description of event");
    }

    @Test
    public void corporationTest() {
        Event e = new Event("Description of event");
        assertEquals(e.equals(new Event("Description of event")), true);
    }
}
