package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day0_HelloWorld {
    /**
     * Task
     * To complete this challenge, you must save a line of input from stdin to a variable,
     * print "Hello, World." on a single line, and finally print the value of your variable on a second line.
     *
     * Sample Input
     * Welcome to 30 Days of Code!
     *
     * Sample Output
     * Hello, World.
     * Welcome to 30 Days of Code!
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}