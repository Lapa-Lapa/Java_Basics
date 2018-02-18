package HackerRank_30_Days_of_Code.Day11_2D_Arrays;

import java.util.Scanner;

public class Day11_Task {
    /**
     * Task
     * Given 6x6 2D Array A:
     * 1 1 1 0 0 0
     * 0 1 0 0 0 0
     * 1 1 1 0 0 0
     * 0 0 2 4 4 0
     * 0 0 0 2 0 0
     * 0 0 1 2 4 0
     * hourglass - песочные часы
     * We define an hourglass in  to be a subset of values
     * with indices falling in this pattern in A's graphical representation:
     * a b c
     *   d
     * e f g
     * There are  hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
     * Task
     * Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int SUM = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j + 2] +
                        arr[i+1][j+1] +
                        arr[i + 2][j] + arr[i + 2][j+1] + arr[i + 2][j + 2];
                if (currentSum > SUM) {
                    SUM = currentSum;
                }
            }
        }
        System.out.println(SUM);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
    }
}