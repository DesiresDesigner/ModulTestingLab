/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexseenko.hitchhike;

/**
 *
 * @author 123
 */
public class Platform {
    private Speaker speaker;
    private int level;

    public Platform(Speaker speaker) {
        this.speaker = speaker;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
    
    public Event turnOnBroadcast(String speach) throws InterruptedException {
        Event speakEvent = speaker.speak(speach, 10000);
        return new Event(speakEvent.describe() + "from platform on " + level + " level");
    }
    
}
