package hitchhike.slabkiy;

import com.slabkiy.hitchhike.Flame;
import com.slabkiy.hitchhike.House;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Natalia on 02.04.2015.
 */
public class HouseTest {

    @Test
    public void eatenUpTest() {
        House house = new House();
        Flame flame = new Flame();
        assertEquals(house.isEatingUpBy(), null);
        house.eatUp(flame);
        assertEquals(house.isEatingUpBy(), flame);
        house.stopEating();
        assertEquals(house.isEatingUpBy(), null);
    }


}
