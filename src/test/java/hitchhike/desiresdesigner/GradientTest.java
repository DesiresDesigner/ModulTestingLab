package hitchhike.desiresdesigner;

import com.desiresdesigner.hitchhike.*;
import junit.framework.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class GradientTest {

    @Test
    public void showTest() {
        String expect = "black\n" +
                "red\n";

        Gradient gradient = new Gradient();
        gradient.addColor(Color.BLACK);
        gradient.addColor(Color.RED);

        assertEquals(gradient.playWithColors(), expect);
    }
}
