package com.desiresdesigner.hitchhike;

/**
 * Created by DesiresDesigner on 4/3/15.
 */
public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void seePicture(Picture picture){
        if (picture == null)
            System.out.println("...");
        else
            System.out.println(picture.describe());
    }
}
