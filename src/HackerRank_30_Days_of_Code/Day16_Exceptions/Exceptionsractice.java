package HackerRank_30_Days_of_Code.Day16_Exceptions;

public class Exceptionsractice {
    public static void main(String[] args) {
        try {
            int[] c = new int[5];
            System.out.println(c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            System.out.println("Finally finished try-catch");
        }
    }
}