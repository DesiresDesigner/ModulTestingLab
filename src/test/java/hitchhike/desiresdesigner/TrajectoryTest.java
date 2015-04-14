package hitchhike.desiresdesigner;

import com.desiresdesigner.hitchhike.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class TrajectoryTest {

    @Test
    public void iterateTest(){
        Trajectory trajectory = new Trajectory();
        List<Coordinates> list = new ArrayList<Coordinates>();

        for (int i = 0; i < 10; i++){
            Coordinates c = new Coordinates(i, i, i);
            list.add(c);
            trajectory.addCoordinates(c);
        }

        for (int i = 0; i < 10; i++){
            assertEquals(trajectory.getNext(), list.get(i));
        }
        assertEquals(trajectory.getNext(), null);
    }
}
