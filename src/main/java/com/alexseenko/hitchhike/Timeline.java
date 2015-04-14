/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexseenko.hitchhike;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 123
 */
public class Timeline {

    private List<Event> events;
    
    public Timeline() {
        events = new ArrayList();
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    public int getAmountOfSameEvents(Event e) {
        return Collections.frequency(events, e);
    }

    public int getTimeIDFromBegining(Event e) {
        return events.indexOf(e);
    }

    public String describeHistory() {
        String res = "";
        for (Event e : events)
            res += e.describe() + "\n";
        return res;
    }
    
}
