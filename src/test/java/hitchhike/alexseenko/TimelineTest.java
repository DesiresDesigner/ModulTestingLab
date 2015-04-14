package hitchhike.alexseenko;

import static junit.framework.Assert.*;
import org.junit.Test;
import com.alexseenko.hitchhike.*;

public class TimelineTest {

    @Test
    public void countSameEventsTest() {
        Timeline tl = new Timeline();
        tl.addEvent(new Event("event #1"));
        tl.addEvent(new Event("event #2"));
        tl.addEvent(new Event("event #3"));
        tl.addEvent(new Event("event #1"));
        tl.addEvent(new Event("event #2"));
        tl.addEvent(new Event("event #2"));

        assertEquals(tl.getAmountOfSameEvents(new Event("event #1")), 2);
        assertEquals(tl.getAmountOfSameEvents(new Event("event #2")), 3);
    }

    @Test
    public void EventsOrderTest() {
        Timeline timeline = new Timeline();
        Event e1 = new Event("Event#1");
        Event e2 = new Event("Event#2");
        timeline.addEvent(e1);
        timeline.addEvent(e2);

        assertEquals(timeline.getTimeIDFromBegining(e1) <  timeline.getTimeIDFromBegining(e2), true);

    }

}