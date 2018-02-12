package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day1_DataTypes {
    /**
     * Task
     * Complete the code in the editor below. The variables i, d and s
     * are already declared and initialized for you. You must:
     * Declare  variables: one of type int, one of type double, and one of type String.
     * Read  lines of input from stdin (according to the sequence given in the Input Format section below)
     * and initialize your  variables.
     * Use the  operator to perform the following operations:
     * Print the sum of  plus your int variable on a new line.
     * Print the sum of  plus your double variable to a scale of one decimal place on a new line.
     * Concatenate  with the string you read as input and print the result on a new line.
     * <p>
     * Sample Input
     * 12
     * 4.0
     * is the best place to learn and practice coding!
     * <p>
     * Sample Output
     * 16
     * 8.0
     * HackerRank is the best place to learn and practice coding!
     */
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int i2;
        double d2;
        String s2;
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();
        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);
        scan.close();
    }
}