package HackerRank_30_Days_of_Code;

import java.util.Random;
import java.util.Scanner;

public class Day4_Game_Guess_my_Number {
    int theNUMBER;
    int MAX;
    Scanner scanner = new Scanner(System.in);

    public Day4_Game_Guess_my_Number() {
        Random rand = new Random();
        MAX = 100;
        theNUMBER = Math.abs(rand.nextInt()) % (MAX + 1);
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big");
            } else if (move < theNUMBER) {
                System.out.println("Your number is too small");
            } else {
                System.out.printf("YOU GOT IT BRO!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Day4_Game_Guess_my_Number guessGame = new Day4_Game_Guess_my_Number();
        System.out.println("Lat's play a game. Try to guess what is my number. " +
                "\nIt's between 0 and 100. Print your variant.");
        guessGame.play();
    }
}