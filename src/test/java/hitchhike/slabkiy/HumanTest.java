package hitchhike.slabkiy;

import com.slabkiy.hitchhike.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Natalia on 02.04.2015.
 */
public class HumanTest {

    @Test
    public void speakTest() {
        Human h = new Human("Natali", new Outside(), null);
        try {
            h.speak("", 0, true);
        } catch (InterruptedException e) {
            assertEquals (true, false);
        }
    }

    @Test
    public void runTest() {
        Human h = new Human("Natali", new Outside(), null);
        Location place  = new House();
        h.run(place);
        assertEquals(h.getLocation(), place);
    }

    @Test
    public void overcameTest() {
        Human dominant = new Human("Natali", new Outside(), null);
        Human submissive = new Human("Kate", new Outside(), null);
        dominant.overcome(submissive);
        assertEquals(dominant.getOvercoming(), submissive);
    }

    @Test
    public void bodyPartTest() {
        Human h = new Human("Natali", new Outside(), null);
        List<BodyPart> body = new ArrayList();
        body.add(new Mouth());
        body.add(new Back());
        body.add(new Mind());

        for (BodyPart part : body)
            h.addBodyPart(part.getName(), part);

        for (BodyPart part : body)
            assertEquals(h.getBodyPartWithName(part.getName()), part);
    }

    @Test
    public void armsIntoBodyTest() {
        Human h = new Human("Natali", new Outside(), null);
        List<BodyPart> body = new ArrayList();
        body.add(new Mouth());
        body.add(new Back());
        body.add(new Mind());

        for (BodyPart part : body)
            h.addBodyPart(part.getName(), part);

        List<Spear> spears = new ArrayList();
        spears.add(new Spear());
        spears.add(new Spear());
        spears.add(new Spear());

        for (Spear spear : spears) {
            spear.setHitArea(h.getBodyPartWithName("Back"));
            h.addArmIntoBody(spear);
        }

        Map<String, Integer> listOfArms = h.getListOfArms();
        assertEquals(listOfArms.size(), 1);

        assertEquals(listOfArms.get("Spear"), new Integer(spears.size()));
    }
}
