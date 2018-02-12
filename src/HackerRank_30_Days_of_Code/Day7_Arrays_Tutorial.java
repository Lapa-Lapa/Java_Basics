package HackerRank_30_Days_of_Code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Day7_Arrays_Tutorial {
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]); //Retrieve objects - Извлечь
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        //  0  1  2  3  4  --> index
        // [0, 5, 3, 2, 1] --> length 5
        int[] intArray1;                    //Declaring
        int[] intArray2 = new int[4];       //Allocating
        int[] intArray3 = {5, 2, 9, 1, 3};  //Initializing
        intArray3[0] = 10;
        printArray(intArray3);
        Arrays.sort(intArray3);
        printArray(intArray3);
        System.out.println(Array.get(intArray3, 4));
        String[] shoppingList = {"peach", "banana", "apple"};
        for (String s : shoppingList) {
            System.out.print(s + " ");
        }
        Random rand = new Random();
        System.out.print(Array.get(shoppingList,Math.abs(rand.nextInt()) % shoppingList.length));
    }
}
