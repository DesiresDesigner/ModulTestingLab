import com.desiresdesigner.PowerSeries;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Natalia on 19.03.2015.
 */
public class ArcTanTest {
    double inaccuracy = 0.01;

    @Test
    public void testZero() throws Exception{
        assertEquals(PowerSeries.arcTan(0), Math.atan(0), inaccuracy);
    }

    @Test
    public void testOne() throws Exception{
        //assertEquals(Math.abs((com.desiresdesigner.PowerSeries.arcTan(1) - Math.PI/4)) < inaccuracy, true);
        assertEquals(PowerSeries.arcTan(1), Math.atan(1), inaccuracy);
    }

    @Test
    public void testMinusOne() throws Exception{
        //assertEquals(Math.abs((com.desiresdesigner.PowerSeries.arcTan(-1) + Math.PI/4)) < inaccuracy, true);
        assertEquals(PowerSeries.arcTan(-1), Math.atan(-1), inaccuracy);
    }

    @Test
    public void testOneSqrtTree() throws Exception{
        //assertEquals(Math.abs((com.desiresdesigner.PowerSeries.arcTan(1/Math.sqrt(3)) - Math.PI/6)) < inaccuracy, true);
        assertEquals(PowerSeries.arcTan(1/Math.sqrt(3)), Math.atan(1/Math.sqrt(3)), inaccuracy);
    }

    @Test
    public void testMinusOneSqrtThree() throws Exception{
        //assertEquals(Math.abs((com.desiresdesigner.PowerSeries.arcTan(-1/Math.sqrt(3)) + Math.PI/6)) < inaccuracy, true);
        assertEquals(PowerSeries.arcTan(-1/Math.sqrt(3)), Math.atan(-1/Math.sqrt(3)), inaccuracy);
    }
}