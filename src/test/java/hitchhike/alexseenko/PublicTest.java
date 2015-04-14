package hitchhike.alexseenko;

import junit.framework.TestCase;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

import com.alexseenko.hitchhike.*;

public class PublicTest extends TestCase {

    @Test
    public void testBreakInto() {
        /*ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream defaultOut = System.out;
        System.setOut(new PrintStream(outContent));*/

        Event expectedEvent = new Event("Human#0 broke into jubilant cry\n" +
                "Human#1 broke into jubilant cry\n" +
                "Human#2 broke into jubilant cry\n" +
                "Human#3 broke into jubilant cry\n" +
                "Human#4 broke into jubilant cry\n" +
                "Human#5 broke into jubilant cry\n" +
                "Human#6 broke into jubilant cry\n" +
                "Human#7 broke into jubilant cry\n" +
                "Human#8 broke into jubilant cry\n" +
                "Human#9 broke into jubilant cry\n" +
                "Human#10 broke into jubilant cry\n" +
                "Human#11 broke into jubilant cry\n" +
                "Human#12 broke into jubilant cry\n" +
                "Human#13 broke into jubilant cry\n" +
                "Human#14 broke into jubilant cry\n");

        Public p = new Public(15);
        Smashing smash = new Cry(true);
        assertEquals(p.breakInto(smash), expectedEvent);

        //System.setOut(defaultOut);
    }

}