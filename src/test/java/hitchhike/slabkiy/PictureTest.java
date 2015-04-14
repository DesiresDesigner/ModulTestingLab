package hitchhike.slabkiy;

import com.slabkiy.hitchhike.Human;
import com.slabkiy.hitchhike.Mouth;
import com.slabkiy.hitchhike.Picture;
import com.slabkiy.hitchhike.Spear;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by Natalia on 02.04.2015.
 */
public class PictureTest {

    @Test
    public void attractiveTest() {
        Picture picture = new Picture();
        assertEquals(picture.getAttractive(), 0);
        picture.setAttractive(5);
        assertEquals(picture.getAttractive(), 5);
    }

    @Test
    public void explicableTest() {
        Picture picture = new Picture();
        assertEquals(picture.isExplicable(), true);
        picture.setExplanation(false);
        assertEquals(picture.isExplicable(), false);
    }

    @Test
    public void describePictureTest() {
        String expect = "spear(Spear)\nmouth(Mouth)\nhuman(Human)\n";

        Picture picture = new Picture();
        Human part1 = new Human("Name", null, null);
        Mouth part2 = new Mouth();
        Spear part3 = new Spear();

        picture.add("human", part1)
               .add("mouth", part2)
               .add("spear", part3);

        assertEquals(picture.getSimpleDescription(), expect);
    }

    @Test
    public void constructPictureTest() {
        Set<String> expectKeys = new HashSet();
        Set<Object> expectParts = new HashSet();

        expectKeys.add("spear");
        expectKeys.add("mouth");
        expectKeys.add("human");

        Human part1 = new Human("Name", null, null);
        Mouth part2 = new Mouth();
        Spear part3 = new Spear();

        expectParts.add(part1);
        expectParts.add(part2);
        expectParts.add(part3);

        Picture picture = new Picture();
        picture.add("human", part1)
               .add("mouth", part2)
               .add("spear", part3);

        assertEquals(picture.getPartsName().size(), expectKeys.size());
        for (Object s : picture.getPartsName())
            assertEquals(expectParts.contains(picture.getPartWithName((String)s)), true);
    }
}
