package hitchhike.slabkiy;

import com.slabkiy.hitchhike.Mouth;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Natalia on 02.04.2015.
 */
public class MouthTest {

    @Test
    public void nameTest() {
        Mouth mouth = new Mouth();
        assertEquals(mouth.getName(), "mouth");
    }

    @Test
    public void openTest() {
        Mouth mouth = new Mouth();
        mouth.close();
        mouth.open();
        assertEquals(mouth.isOpen(), true);
    }

    @Test
    public void closeTest() {
        Mouth mouth = new Mouth();
        mouth.open();
        mouth.close();
        assertEquals(mouth.isOpen(), false);
    }
}
