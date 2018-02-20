package HackerRank_30_Days_of_Code.Day16_Exceptions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /**
     * Task
     * Read a string S and print its integer value;
     * if S cannot be converted to an integer, print "Bad String".
     * Note: You must use the String-to-Integer and exception handling constructs built into your submission language.
     * If you attempt to use loops/conditional statements, you will get a 0 score.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            //http://study-java.ru/uroki-java/urok-7-preobrazovanie-tipov-v-java/#Stringtoint
            //Integer i = new Integer(S);
            int i = new Integer(S);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}