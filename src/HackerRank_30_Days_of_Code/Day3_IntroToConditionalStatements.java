package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day3_IntroToConditionalStatements {
    /**
     * Task
     * Given an integer n perform the following conditional actions:
     * If n is odd, print Weird
     * If n is even and in the inclusive range of 2 to 5, print "Not Weird"
     * If n is even and in the inclusive range of 6 to 20, print "Weird"
     * If n is even and greater than 20, print "Not Weird"
     */
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        scan.close();
//        String ans = "Weird";
//        if (n % 2 == 1) {
//            System.out.println(ans);
//        } else {
//            if (n >= 2 && n <= 5) {
//                System.out.println("Not " + ans);
//            }
//            if (n <= 20 && n <= 6) {
//                System.out.println(ans);
//            }
//            if (n > 20) {
//                System.out.println("Not " + ans);
//            } else {
//                System.out.println(ans);
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "Weird";
        if ((n % 2 == 1) || ((n % 2 == 0) && (n >= 6 && n <= 20))) {
            System.out.println(ans);
        } else {
            System.out.println("Not " + ans);
        }
    }
}