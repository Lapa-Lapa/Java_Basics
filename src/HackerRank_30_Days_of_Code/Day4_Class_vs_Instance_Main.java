package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day4_Class_vs_Instance_Main {
    /**
     * Task
     * Write a Person class with an instance variable age and a constructor
     * that takes an integer initialAge as a parameter. The constructor must assign initialAge
     * to age after confirming the argument passed as initialAge is not negative;
     * if a negative argument is passed as initialAge the constructor should set age to 0
     * and print "Age is not valid, setting age to 0.". In addition, you must write
     * the following instance methods:
     * yearPasses() should increase the age instance variable by 1.
     * amIOld() should perform the following conditional actions:
     * If age<13 print "You are young.".
     * If age>=13 and age<18 print "You are a teenager.".
     * Otherwise, print "You are old.".
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 4;
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4_Class_vs_Instance_Person p = new Day4_Class_vs_Instance_Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}