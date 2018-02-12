package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day5_Loops {
    /**
     * Task
     * Given an integer n print its first 10 multiples.
     * Each multiple should be printed on a new line in the form: n x i = result.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for (int x = 1; x < 11; x++) {
            System.out.println(n + " x " + x + " = " + n * x);
        }
    }
}