package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntListTest {

    private InheritanceSortedIntList list1;
    private InheritanceSortedIntList list2;

    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
    }

    @Test
    public void testAdd() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);

        assertEquals(4, list1.getTotalAdded());

        assertEquals(1, list1.get(0));
        assertEquals(2, list1.get(1));
        assertEquals(3, list1.get(2));
        assertEquals(4, list1.get(3));
    }

    @Test
    public void testAddAll() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        assertEquals(5, list1.getTotalAdded());

        list2.add(3);
        list2.add(0);

        assertEquals(2, list2.getTotalAdded());

        list2.addAll(list1);

        assertEquals(7, list2.getTotalAdded());

        assertEquals(0, list2.get(0));
        assertEquals(1, list2.get(1));
        assertEquals(2, list2.get(2));
        assertEquals(2, list2.get(3));  
        assertEquals(3, list2.get(4));
        assertEquals(3, list2.get(5));
        assertEquals(4, list2.get(6));
    }
}