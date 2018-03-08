package HackerRank_30_Days_of_Code.Day20_Sorting.Day20_Task;

import java.util.Scanner;

public class Solution {
//    Consider the following version of Bubble Sort:
//    for (int i = 0; i < n; i++) {
//        // Track number of elements swapped during a single array traversal
//        int numberOfSwaps = 0;
//        for (int j = 0; j < n - 1; j++) {
//            // Swap adjacent elements if they are in decreasing order
//            if (a[j] > a[j + 1]) {
//                swap(a[j], a[j + 1]);
//                numberOfSwaps++;
//            }
//        }
//        // If no elements were swapped during a traversal, array is sorted
//        if (numberOfSwaps == 0) {
//            break;
//        }
//    }

    /**
     * Task
     * Given an array a of size n distinct elements, sort the array in ascending order
     * using the Bubble Sort algorithm above. Once sorted, print the following  lines:
     * Array is sorted in numSwaps swaps.
     * where numSwaps is the number of swaps that took place.
     * First Element: firstElement
     * where firstElement is the first element in the sorted array.
     * Last Element: lastElement
     * where lastElement is the last element in the sorted array.
     * Hint: To complete this challenge, you will need to add a variable
     * that keeps a running tally of all swaps that occur during execution.
     * Sample Input:
     * 3 - integer denoting the number of elements in array
     * 1 2 3 - array
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        //Sorting
        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    //select piece of code that must be a separate method
                    //press [Ctrl+Alt+M] and enter method's name :)
                    swap(a, j);
                    numSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

    private static void swap(int[] a, int j) {
        int temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;
    }
}