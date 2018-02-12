package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day9_Recursion_Task {
    /**
     * Task
     * Write a factorial function that takes a positive integer N
     * as a parameter and prints the result of N! ( factorial).
     */
    /*static int factorial(int n) {     //// WITH RECURSION
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /*int result = factorial(n);*/
        int result=1;
        for (int i = n; i > 1; i--) {   // W/O RECURSION
            result *= i;                //Оператор присваивания «Умножение»
        }                               //умножает правый операнд на левый операнд
        if (n == 1) {                   //C * = A эквивалентно C = C * A
            result = 1;                 //http://proglang.su/java/operators
        }
        System.out.println(result);
    }
}