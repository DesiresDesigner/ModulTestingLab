package hitchhike.desiresdesigner;

import com.desiresdesigner.hitchhike.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class StarSystemTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void constructBinTest(){
        StarSystem starSystem = new StarSystem();
        starSystem.constructBinarySystem(100, 100, 100);
        assertEquals(starSystem.isBinary(), true);
    }
}
