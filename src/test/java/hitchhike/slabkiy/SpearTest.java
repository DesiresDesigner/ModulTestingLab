package hitchhike.slabkiy;

import com.slabkiy.hitchhike.Back;
import com.slabkiy.hitchhike.Spear;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Natalia on 02.04.2015.
 */
public class SpearTest {

    @Test
    public void setHitAreaTest() {
        Spear spear = new Spear();
        Back back = new Back();
        spear.setHitArea(back);
        assertEquals(spear.getHitArea().getName(), "back");
    }


}
