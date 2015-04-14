package com.slabkiy.hitchhike;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Natalia on 02.04.2015.
 */
public class Human implements Describable{

    private String name;
    private Map<String, BodyPart> bodyParts;
    private List<Weapon> arms;
    private Location location;
    private Object overcoming;

    public Human(String name, Location location, Object overcoming) {
        this.name = name;
        this.location = location;
        this.overcoming = overcoming;

        bodyParts = new HashMap();
        arms = new ArrayList();
    }

    public void addBodyPart(String name, BodyPart bodyPart){
        bodyParts.put(name, bodyPart);
    }

    public BodyPart getBodyPartWithName(String name) {
        return bodyParts.get(name);
    }

    public void addArmIntoBody(Weapon arm) {
        arms.add(arm);
    }

    public Map getListOfArms() {
        Map<String, Integer> list = new HashMap();
        for (Weapon weapon : arms){
            if (list.containsKey(weapon.getClass().getSimpleName()))
                list.put(weapon.getClass().getSimpleName(), list.get(weapon.getClass().getSimpleName()) + 1);
            else
                list.put(weapon.getClass().getSimpleName(), 1);
        }
        return list;
    }

    public void run(Location place) {  //ch
        location = place;
    }

    public void speak(String speech, long timeNS, boolean tremor) throws InterruptedException {
        if (timeNS == 0)
            timeNS = 1000000000;
        System.out.println(name + " says: ");
        if (speech.length() > 0) {
            long timeToWait = timeNS/speech.length();
            for (int i = 0; i < speech.length(); i++) {
                System.out.print(speech.charAt(i));
                TimeUnit.NANOSECONDS.sleep(timeToWait);
            }
            System.out.println();
        } else {
            System.out.println("...");
        }
        if (tremor)
            System.out.println("with tremor");
    }

    public void overcome(Object o) {
        overcoming = o;
    }

    @Override
    public String describe() {
        String result = "I'm a human being, my name is " + name + ".\n I have ";
        Set<String> bodyPartsNames = bodyParts.keySet();
        for (String part : bodyPartsNames)
                result += "a " + part + ", ";
        if (arms.size() > 0)
            result += "\nI have " + arms.size() + " arms in my body\n";
        if (location != null)
            result += "I am here: " + location.getName() + "\n";
        if (overcoming != null)
            result += "I am overcoming something\n";
        return result;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public Object getOvercoming() {
        return overcoming;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
