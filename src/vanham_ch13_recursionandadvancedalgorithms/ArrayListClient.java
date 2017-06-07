/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vanham_ch13_recursionandadvancedalgorithms;

/**
 *
 * @author vanhk5054
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ArrayListClient {

    public static void displayArray(ArrayList<Comparable> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numItems;
        ArrayList test = new ArrayList();;
        Random rand = new Random();

        System.out.print("Enter number of elements: ");
        numItems = input.nextInt();

        /* populate array with random integers */
        for (int i = 0; i < numItems; i++) {
            test.add(new Circle(rand.nextInt(100)));
        }

        System.out.println("Unsorted:");
        displayArray(test);

        //UNCOMMENT TO CHOOSE A SORTING ALGORITHM-------------------------------
//        Sorts.selectionSort(test);
//        Sorts.insertionSort(test);
//        Sorts.mergesort(test, 0, test.size() - 1);

        System.out.println("Sorted:");
        displayArray(test);
    }
}
