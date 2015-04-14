package com.slabkiy.hitchhike;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Natalia on 02.04.2015.
 */
public class Picture {
    private boolean explanation;
    private int attractive;
    private Map<String, Describable> parts;

    public Picture() {
        parts = new HashMap();
        attractive = 0;
        explanation = true;
    }

    public Picture add(String name, Describable o) {
        parts.put(name, o);
        return this;
    }

    public String getSimpleDescription() {
        Set<String> objects = parts.keySet();
        String result = "";
        for (String key : objects) {
            result += key + '(' + parts.get(key).getClass().getSimpleName() + ')' + '\n';
        }
        return result;
    }

    public String getFullDescription() {
        Set<String> objects = parts.keySet();
        String result = "";
        for (String key : objects) {
            result += parts.get(key).describe() + '\n';
        }
        return result;
    }

    public Set getPartsName() {
        return parts.keySet();
    }

    public Object getPartWithName(String name) {
        return parts.get(name);
    }

    public boolean isExplicable() {
        return explanation;
    }

    public void setExplanation(boolean explanation) {
        this.explanation = explanation;
    }

    public int getAttractive() {
        return attractive;
    }

    public void setAttractive(int attractive) {
        this.attractive = attractive;
    }
}
