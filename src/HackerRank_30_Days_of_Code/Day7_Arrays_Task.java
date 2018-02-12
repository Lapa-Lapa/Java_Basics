package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day7_Arrays_Task {
    /**
     * Task
     * Given an array of integers, print its elements in reverse order
     * as a single line of space-separated numbers.
     * Input Format
     * The first line contains an integer, N (the size of our array).
     * The second line contains space-separated integers - array elements.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}