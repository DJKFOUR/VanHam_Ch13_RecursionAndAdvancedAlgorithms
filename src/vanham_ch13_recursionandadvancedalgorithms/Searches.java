/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vanham_ch13_recursionandadvancedalgorithms;

/**
 *
 * @author vanhk5054
 */
public class Searches {

    /**
     * Searches items array of ints for goal
     * pre: items is sorted from low to high
     * post: Position of goal has been returned, or -1 has been returned if goal not found.
     */
    public static int binarySearch(int[] items, int start, int end, int goal) {
        if (start > end) {
            return (-1);
        } else {
            int mid = (start + end) / 2;
            if (goal == items[mid]) {
                return (mid);
            } else if (goal < items[mid]) {
                return (binarySearch(items, start, mid - 1, goal));
            } else {
                return (binarySearch(items, mid + 1, end, goal));
            }
        }
    }
    
    /**
     * Searches items array of ints for goal
     * pre: items is sorted from low to high
     * post: Position of goal has been returned, or -1 has been returned if goal not found.
     * All search locations printed.
     */
    public static int binarySearchWithRuntimeOutput(int[] items, int start, int end, int goal) {
       
        if (start > end) {
            return (-1);
        } else {
            int mid = (start + end) / 2;
            System.out.println("Examining position " + mid);
            if (goal == items[mid]) {
                return (mid);
            } else if (goal < items[mid]) {
                return (binarySearchWithRuntimeOutput(items, start, mid - 1, goal));
            } else {
                return (binarySearchWithRuntimeOutput(items, mid + 1, end, goal));
            }
        }
    }
    
    /**
     * Searches items array of objects for goal
     * pre: items is sorted from low to high
     * post: Position of goal has been returned, or -1 has been returned if goal not found.
     */
    public static int binarySearch(Comparable[] items, int start, int end, Comparable goal) {
        if (start > end) {
            return (-1);
        } else {
            int mid = (start + end) / 2;
            if (goal.compareTo(items[mid]) == 0) {
                return (mid);
            } else if (goal.compareTo(items[mid]) == -1) {
                return (binarySearch(items, start, mid - 1, goal));
            } else {
                return (binarySearch(items, mid + 1, end, goal));
            }
        }
    }
}
