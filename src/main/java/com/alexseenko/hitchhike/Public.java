package com.alexseenko.hitchhike;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DesiresDesigner on 4/14/15.
 */
public class Public {
    List<Human> content;

    Public() {
        content = new ArrayList<Human>();
    }

    public Public(int amountOfPeople) {
        content = new ArrayList<Human>(amountOfPeople);
        for (int i = 0; i < amountOfPeople; i++) {
            content.add(new Human("Human#" + i, null));
        }
    }

    public void addHuman(Human h) {
        content.add(h);
    }

    public Event breakInto(Smashing smash) {
        String eventDescription = "";
        for (Human h : content) {
            eventDescription += h.breakInto(smash).describe() + "\n";
        }
        return new Event(eventDescription);
    }
}
