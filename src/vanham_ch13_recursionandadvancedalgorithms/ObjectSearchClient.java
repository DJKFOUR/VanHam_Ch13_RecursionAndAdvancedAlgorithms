package vanham_ch13_recursionandadvancedalgorithms;

import java.util.Scanner;
import java.util.Random;

public class ObjectSearchClient {

    public static void displayArray(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numItems, searchNum, location;
        Comparable[] test;
        Random rand = new Random();
        
        System.out.print("Enter number of elements: ");
        numItems = input.nextInt();
        
        /* populate and sort array */
        test = new Comparable[numItems];
        for (int i = 0; i < test.length; i++) {
            test[i] = new Circle(rand.nextInt(100));
        }
        Sorts.mergesort(test, 0, test.length - 1);
        System.out.println("Sorted:");
        displayArray(test);
        
        /* search for number in sorted array */
        System.out.print("Enter a radius to search for: ");
        searchNum = input.nextInt();
        
        while (searchNum != -1) {
            location = Searches.binarySearch(test, 0,
                    test.length - 1, new Circle(searchNum));
            System.out.println("Number at position: " + location);
            System.out.print("Enter a number to search for: ");
            searchNum = input.nextInt();
        }
    }
}