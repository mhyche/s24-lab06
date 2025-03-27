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
        list1.add(2);
        System.out.println(list1.getTotalAdded());
        assertTrue(list1.getTotalAdded() == 5);
        printList(list1);
    }

    @Test
    public void testAddAll() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        assertTrue(list1.getTotalAdded() == 5);

        list2.add(3);
        list2.add(0);

        assertTrue(list2.getTotalAdded() == 2);

        list2.addAll(list1);

        assertTrue(list2.getTotalAdded() == 7);
    }

    private void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i));
        System.out.print(", ");
        }
        System.out.println();
    }
}