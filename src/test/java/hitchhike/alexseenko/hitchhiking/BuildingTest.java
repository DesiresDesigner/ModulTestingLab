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
public class BuildingTest {
    
   
    @Test
    public void testConstructBuilding() {
        double coords[] = {0.5, 7.5};
        Building instance = new Building(coords, 10, 5);
        String expResult = "(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)\r\n" +
                            "(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)\r\n" +
                            "(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)\r\n" +
                            "(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)\r\n" +
                            "(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)\r\n";
        String result = instance.showFacade();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetWindowPropwrties() {
    double coords[] = {0.5, 7.5};
        Building instance = new Building(coords, 10, 5);
        String expResult = "(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)(5: 0, 0)\r\n" +
                            "(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)(4: 1, 0)(4: 0, 0)(4: 0, 0)(4: 0, 0)\r\n" +
                            "(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)(3: 0, 0)\r\n" +
                            "(2: 0, 0)(2: 0, 0)(2: 0, 1)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)(2: 0, 0)\r\n" +
                            "(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)(1: 0, 0)\r\n";
        
        instance.setStatelyWindow(4, 7);
        instance.setPlatformToWindow(2, 3, new Platform(null));
        
        String result = instance.showFacade();
        assertEquals(expResult, result);
    }
    
}
