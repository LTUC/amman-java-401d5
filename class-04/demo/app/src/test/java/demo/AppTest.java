/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {


    @Test public void testDuplicatesFunction(){
        // Test -> testing arrays with no duplicates, and making sure the result is false
        //      -> testing arrays with duplicates, and making sure the result is true
        int[] containsDuplicatesArray = {1,5,8,4,1,2,6,7};
        int[] doesntContainDuplicatesArray = {1,2,4,5,6,7};
        int[] emptyArray = {};
        assertFalse("Testing contains duplicates for an array that doesn't contain duplicates",App.containsDuplicates(doesntContainDuplicatesArray));
        assertTrue("Testing contains duplicates for an array that contains duplicates",App.containsDuplicates(containsDuplicatesArray));
        assertFalse("Testing contains duplicates for an array that is empty", App.containsDuplicates(emptyArray));
    }

    @Test public void testGetLowestAverageArray(){
        int[][] valuesTestArray = {{1,4,8,7,5}
                                  ,{2,4,7}
                                  ,{10,10,10}
                                  ,{2,4,1,0}};

        assertEquals("Testing lowest average array", valuesTestArray[3],App.lowestArray(valuesTestArray));
    }

    @Test public void testTally(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("a");
        names.add("a");
        names.add("a");
        names.add("a");
        names.add("b");
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        String result = "a";

        assertEquals("Testing tally function", result, App.tally(names));


    }
}
