/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitchhike.alexseenko;


import com.alexseenko.hitchhike.Building;
import com.alexseenko.hitchhike.Event;
import com.alexseenko.hitchhike.Platform;
import com.alexseenko.hitchhike.Speaker;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 *
 * @author 123
 */
public class SpeakerTest {
    
    @Test
    public void skeakTest() throws Exception {
        String speach = "This novel explores the big questions of life through the story of a highly dysfunctional \n" +
                "\"family\": three sons basically neglected and abandoned by their father Fyodor. The oldest, Dmitry,\n" +
                "is engaged to the beautiful Katerina Invanova yet irresistibly drawn to Grushenka, the same woman \n" +
                "his wealthy lecherous buffoon of a father is lusting after. To make matters worse, Dmitry has given up \n" +
                "rights to a future inheritance to finance his extravagances and now feels his father is cheating him. \n" +
                "Perhaps the half brothers he is just getting to know can help resolve these problems.";

        double[] coords = {0.0, 0.0};
        Speaker speaker = new Speaker("Slava", new Building(coords, 1, 1));
        Event expResult = new Event("Slava says: \n" + speach + "\n");
        Event result = speaker.speak(speach, 100);

        assertEquals(expResult.describe(), result.describe());        
    }
    
}
