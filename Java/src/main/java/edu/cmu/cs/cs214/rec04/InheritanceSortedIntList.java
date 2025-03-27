package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a subclass of AbstractIntList that tracks the number of elements added.
 * This class inherits from AbstractIntList and overrides the add and addAll methods to track
 * how many elements have been added to the list.
 * 
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntList extends SortedIntList {
    int totalAdded = 0;
    // Write your implementation below with API documentation
    @Override
    public boolean add(int num) {
        super.add(num);
        totalAdded += 1;
        return true;
    }

    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}