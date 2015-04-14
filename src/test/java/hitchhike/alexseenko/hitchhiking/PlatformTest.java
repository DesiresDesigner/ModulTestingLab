/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitchhike.alexseenko.hitchhiking;


import org.junit.Test;
import static junit.framework.Assert.*;
import com.alexseenko.hitchhiking.*;

/**
 *
 * @author 123
 */
public class PlatformTest {
    
    @Test
    public void testTurnOnBroadcast() throws Exception {
        String speach = "This novel explores the big questions of life through the story of a highly dysfunctional \r\n" +
                "\"family\": three sons basically neglected and abandoned by their father Fyodor. The oldest, Dmitry,\r\n" +
                "is engaged to the beautiful Katerina Invanova yet irresistibly drawn to Grushenka, the same woman \r\n" +
                "his wealthy lecherous buffoon of a father is lusting after. To make matters worse, Dmitry has given up \r\n" + 
                "rights to a future inheritance to finance his extravagances and now feels his father is cheating him. \r\n" + 
                "Perhaps the half brothers he is just getting to know can help resolve these problems.";
        double[] coords = {0.0, 0.0};
        Speaker speaker = new Speaker("Slava", new Building(coords, 1, 1));
        Platform instance = new Platform(speaker);
        Event expResult = new Event("Slava says: \r\n" + speach);
        Event result = instance.turnOnBroadcast(speach);
        assertEquals(expResult.describe(), result.describe());        
    }
    
}
