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
public class Event {
    private String description;
    
    public String describe() {
        return description;
    }
    
    public Event(String description) {
        this.description = description;
    }
    
    @Override
    public boolean equals(Object o) {
        return description.equals(((Event)o).describe());
    }
    
}
