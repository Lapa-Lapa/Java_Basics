package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day2_Operators {
    /**
     * Task
     * Given the meal price (base cost of a meal), tip percent the percentage of the meal price being added as tip),
     * and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
     *
     * Sample Input
     * 12.00
     * 20
     * 8
     *
     * Sample Output
     * The total meal cost is 15 dollars.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();
        int totalCost = (int) Math.round(mealCost + mealCost * tipPercent / 100 + mealCost * taxPercent / 100);
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}