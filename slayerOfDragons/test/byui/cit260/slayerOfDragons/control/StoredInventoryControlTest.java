/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trevoralbrethsen
 */
public class StoredInventoryControlTest {
    
    public StoredInventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfItemsChest method, of class StoredInventoryControl.
     */
    @Test
    public void testCalcVolumeOfItemsChest() {
        System.out.println("calcVolumeOfItemsChest");
        
        //Test case #1
        
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        
        double height = 24.0;
        double width = 6.0;
        double length = 12.0;
        
        double expResult = 1.0; //expected output returned value
        
        //create instance of StoredInventoryControl class
        StoredInventoryControl instance = new StoredInventoryControl();
        
        //call function to run test
        double result = instance.calcVolumeOfItemsChest(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #2
        
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        
        height = -1.0;
        width = 6.0;
        length = 12.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfItemsChest(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #3
        
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        
        height = 24.0;
        width = 18.0;
        length = 12.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfItemsChest(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #4
        
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        
        height = 24.0;
        width = 6.0;
        length = -1.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfItemsChest(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #5
        
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        
        height = 0.0;
        width = 6.0;
        length = 12.0;
        
        expResult = 0; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfItemsChest(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #6
        
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        
        height = 24.0;
        width = 0.0;
        length = 12.0;
        
        expResult = 0; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfItemsChest(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #7
        
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        
        height = 24.0;
        width = 9.0;
        length = 18.0;
        
        expResult = 2.25; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfItemsChest(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
    }
    
}
