package HackerRank_30_Days_of_Code.Day14_Scope.Day14_Task;

import java.util.Arrays;

public class Difference {
    private int[] elements;
    public int maximumDifference;
    /**
     * Task
     * Complete the Difference class by writing the following:
     * A class constructor that takes an array of integers as a parameter
     * and saves it to the elements instance variable.
     * A computeDifference method that finds the maximum absolute difference
     * between any 2 numbers in N and stores it in the maximumDifference instance variable.
     */
    Difference(int[]elements){
        this.elements=elements;
    }

    public int computeDifference( ){
        for(int i=0;i<elements.length;i++){
         for (int j=0;j<elements.length;j++){
             //Math.abs(n) — возвращает модуль числа n.
             int diff=Math.abs(elements[i]-elements[j]);
             if (maximumDifference<diff){
                 maximumDifference=diff;
             }
         }
        }
        // VS
        //Arrays.sort(elements);
        //maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
        return maximumDifference;
    }
}
