package hitchhike.slabkiy;

import com.slabkiy.hitchhike.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Natalia on 02.04.2015.
 */
public class MindTest {

    @Test
    public void constructThinkTest() {
        Mind mind = new Mind();
        List<Describable> partsOfThink = new ArrayList<Describable>();
        partsOfThink.add(new Human("Name", null, null));
        partsOfThink.add(new Spear());
        partsOfThink.add(new Back());
        partsOfThink.add(new Mouth());

        Picture picture = mind.constructThink(partsOfThink.toArray(new Describable[partsOfThink.size()]));

        assertEquals(picture.getPartsName().size(), partsOfThink.size());
        for (Object s : picture.getPartsName())
            assertEquals(partsOfThink.contains(picture.getPartWithName((String) s)), true);
    }

    @Test
    public void playThinkTest() {
        Mind mind = new Mind();
        List<Describable> partsOfThink = new ArrayList<Describable>();
        partsOfThink.add(new Human("Name", null, null));
        partsOfThink.add(new Spear());
        partsOfThink.add(new Back());
        partsOfThink.add(new Mouth());

        Picture picture = mind.constructThink(partsOfThink.toArray(new Describable[partsOfThink.size()]));

        System.out.println(mind.playPicture(picture)); // ToDo
        assertEquals(mind.isHistoryContains(picture), true);
    }
}
