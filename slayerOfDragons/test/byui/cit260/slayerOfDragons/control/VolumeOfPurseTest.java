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
public class VolumeOfPurseTest {
    
    public VolumeOfPurseTest() {
    }

    /**
     * Test of calcVolumeOfItemContainer method, of class VolumeOfPurse.
     */
    @Test
    public void testCalcVolumeOfPurse() {
        System.out.println("calcVolumeOfPurse");
        
        //Test #1
        
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double height = 3.0;
        double diameter = 12.0;
        
        double expResult = 1.1780972450961724;
        
        VolumeOfPurse instance = new VolumeOfPurse(); //expected output returned value
        
        //call function to run test
        double result = instance.calcVolumeOfPurse(height, diameter);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        // Test case #2
        System.out.println("\tTest case #2");
        
        //input values for test case 2
        height = -1.0;
        diameter = 12.0;
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfPurse(height, diameter);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        // Test case #3
        System.out.println("\tTest case #3");
        
        //input values for test case 3
        height = 3.0;
        diameter = -1.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfPurse(height, diameter);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        // Test case #4
        System.out.println("\tTest case #4");
        
        //input values for test case 4
        height = 3.0;
        diameter = 25.0;
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfPurse(height, diameter);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        // Test case #5
        System.out.println("\tTest case #5");
        
        //input values for test case 5
        height = 0;
        diameter = 12.0;
        
        expResult = 0; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfPurse(height, diameter);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case #6
        System.out.println("\tTest case #6");
        
        //input values for test case 6
        height = 6.0;
        diameter = 0;
        
        expResult = 0.0; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfPurse(height, diameter);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        // Test case #7
        System.out.println("\tTest case #7");
        
        //input values for test case 7
        height = 6.0;
        diameter = 24.0;
        
        expResult = 18.84955592153876; //expected output returned value
        
        //call function to run test
        result = instance.calcVolumeOfPurse(height, diameter);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
    
    }
    
}
