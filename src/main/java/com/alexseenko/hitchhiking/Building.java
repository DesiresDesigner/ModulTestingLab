package com.alexseenko.hitchhiking;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 123
 */
public class Building extends Place {
    
    List<List<Window>> windows;
    
    public Building(double[] coords, int width, int height) {
        name = "building";
        x = coords[0];
        y = coords[1];
        
        windows = new ArrayList<List<Window>>(height);
        for (int i = 0; i < height; i++){
            windows.add(i, new ArrayList(width));
            for (int j = 0; j < width; j++) {
                windows.get(i).add(j, new Window(false, null, i+1));
            }
        }
    }
    
    public String showFacade(){
        String res = "";
        for (int i = windows.size() - 1; i > -1 ; i--){
            for (int j = 0; j < windows.get(i).size(); j++) {
                res += "(" + windows.get(i).get(j).getLevel() + ": " + 
                        (windows.get(i).get(j).isStately() ? 1 : 0) + ", " +
                        (windows.get(i).get(j).getPlatform() != null ? 1 : 0) + ")";
            }
            res += "\r\n";
        }
        return res;
    }
    
    public void setStatelyWindow(int level, int position) {
        windows.get(level-1).get(position-1).setStately(true);
    }
    
    public void setPlatformToWindow(int level, int position, Platform platform) {
        windows.get(level-1).get(position-1).setPlatform(platform);
    }
    
}
