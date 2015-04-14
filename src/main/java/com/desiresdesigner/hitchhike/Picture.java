package com.desiresdesigner.hitchhike;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by DesiresDesigner on 4/3/15.
 **/

public class Picture {
    Map<String, Describable> parts;

    public Picture() {
        parts = new HashMap();
    }

    public void add(String name, Describable o) {
        parts.put(name, o);
    }

    public String describe() {
        Set<String> keys = parts.keySet();
        String result = "";
        for (String key : keys)
            result += parts.get(key).describe();
        return result;
    }
}