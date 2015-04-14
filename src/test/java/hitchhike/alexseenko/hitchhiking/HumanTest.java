/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitchhike.alexseenko.hitchhiking;

import org.junit.Test;
import static junit.framework.Assert.*;
import com.alexseenko.hitchhiking.*;

/**
 *
 * @author 123
 */
public class HumanTest {
    
    @Test
    public void testSlip() {
        System.out.println("slip");
        Slippery surface = new Air();
        
        double[] desCoords = {5.5, 5.5};
        double[] curCoords = {0.1, 0.1};
        Place destination = new Building(desCoords, 1, 1);
        long timems = 4;
        Human instance = new Human("Kate", new Building(curCoords, 1, 1));
        Event expResult = new Event("Kate slip on air from (0.1, 0.1) to (5.55.5)");
        Event result = null;
        try {
            result = instance.slip(surface, destination, timems);
        } catch (InterruptedException e) {
            fail("InterruptedException was thown");
        }
        assertEquals(expResult, result);
    }
    
    @Test
    public void hearTest() {
        System.out.println("hear");
        
        double[] curCoords = {0.1, 0.1};
        Human human = new Human("Kate",  new Building(curCoords, 1, 1));
        
        Event expResult = new Event("Kate heard the next speach: Some very very very very long text, that Kate is listening now!");
        Event result = null;
        
        try {
            long start = System.currentTimeMillis(), end;
            result = human.hear("Some very very very very long text, that Kate is listening now!");
            end = System.currentTimeMillis();
            assertEquals((end-start)/1000, "Some very very very very long text, that Kate is listening now!".length()/15, 0.05);
        } catch (InterruptedException e) {
            fail("InterruptedException was thown");
        }
        assertEquals(expResult, result);
    }
}
