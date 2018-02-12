package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day10_BinaryNumbers {
    /**
     * Task
     * Given a base-10 integer n convert it to binary (base-2).
     * Then find and print the base-10 integer
     * denoting the maximum number of consecutive 1's
     * in n's binary representation.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; n != 0; i++) {
            if (n % 2 == 1) {
                int[] array = new int[i];
                array[i - 1] = 1;
                n= (n-1)/2;
                System.out.println(array[i-1]);
            } else {
                int[] array = new int[i];
                array[i - 1] = 0;
                n= (n-1)/2;
                System.out.println(array[i-1]);
            }
        }
    }
}