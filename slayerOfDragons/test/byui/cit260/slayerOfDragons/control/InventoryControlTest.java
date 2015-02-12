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
 * @author ianmartin
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfItemContainer method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfItemContainer() {
        System.out.println("calcVolumeOfItemContainer");
        
        
        //Test case #1
        
        System.out.println("\tTest case #1");
        
        // input values for da test case 1
        
        double height = 14.0;
        double width = 14.0;
        double length = 14.0;
        
        double expResult = 1.5879; //expected output returned value
        
        //create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcVolumeOfItemContainer(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
     //Test case #2
        
        System.out.println("\tTest case #2");
        
        // input values for da test case 2
        
        height = -1.0;
        width = 14.0;
        length = 14.0;
        
        expResult = -1; //expected output returned value
       
        
        //call function to run test
        result = instance.calcVolumeOfItemContainer(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        //Test case #3
        
        System.out.println("\tTest case #3");
        
        // input values for da test case 3
        
        height = 14.0;
        width = -1.0;
        length = 14.0;
        
        expResult = -1; //expected output returned value
       
        
        //call function to run test
        result = instance.calcVolumeOfItemContainer(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #4
        
        System.out.println("\tTest case #4");
        
        // input values for da test case 4
        
        height = 14.0;
        width = 14.0;
        length = 2000.0;
        
        expResult = -1; //expected output returned value
       
        
        //call function to run test
        result = instance.calcVolumeOfItemContainer(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #5
        
        System.out.println("\tTest case #5");
        
        // input values for da test case 5
        
        height = 0;
        width = 14.0;
        length = 0;
        
        expResult = 0; //expected output returned value
       
        
        //call function to run test
        result = instance.calcVolumeOfItemContainer(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #6
        
        System.out.println("\tTest case #6");
        
        // input values for da test case 6
        
        height = 7.0;
        width = 0;
        length = 0;
        
        expResult = 0; //expected output returned value
       
        
        //call function to run test
        result = instance.calcVolumeOfItemContainer(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        //Test case #7
        
        System.out.println("\tTest case #7");
        
        // input values for da test case 7
        
        height = 18.0;
        width = 18.0;
        length = 18.0;
        
        expResult = 3.375; //expected output returned value
       
        
        //call function to run test
        result = instance.calcVolumeOfItemContainer(height, width, length);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    }
    
}
