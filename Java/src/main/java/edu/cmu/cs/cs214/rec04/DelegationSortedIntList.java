package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Heng Jiang
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    SortedIntList sortedList = new SortedIntList();
    int totalAdded = 0;

    @Override
    public boolean add(int num) {
        sortedList.add(num);
        totalAdded += 1;
        return true;
    }

    @Override
    public boolean addAll(IntegerList list) {
        sortedList.addAll(list);
        totalAdded += list.size();
        return true;
    }

    @Override
    public int get(int index) {
        return sortedList.get(index);
    }

    @Override
    public boolean remove(int num) {
        return sortedList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedList.removeAll(list);
    }

    @Override
    public int size() {
        return sortedList.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}