package com.slabkiy.hitchhike;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natalia on 02.04.2015.
 */
public class Mind extends BodyPart {
    List<Picture> history;

    public Mind() {
        name = "mind";
        history = new ArrayList();
    }

    public String playPicture(Picture picture) {
        history.add(picture);
        return picture.getFullDescription();
    }

    public boolean isHistoryContains(Picture picture){
        return history.contains(picture);
    }

    public Picture constructThink(Describable[] objects) {
        Picture picture = new Picture();
        for (Describable o : objects)
            picture.add(o.getClass().getSimpleName(), o);
        return picture;
    }

    @Override
    public String describe() {
        return "I'm a mind and I have shown " + history.size() + " pictures to my dear human being";
    }
}
