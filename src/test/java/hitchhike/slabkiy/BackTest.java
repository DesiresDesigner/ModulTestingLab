package hitchhike.slabkiy;

import com.slabkiy.hitchhike.Back;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Natalia on 02.04.2015.
 */
public class BackTest {

    @Test
    public void nameTest() {
        Back back = new Back();
        assertEquals(back.getName(), "back");
    }
}
