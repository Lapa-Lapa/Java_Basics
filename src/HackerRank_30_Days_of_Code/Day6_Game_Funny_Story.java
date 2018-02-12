package HackerRank_30_Days_of_Code;

import java.util.Random;
import java.util.Scanner;

public class Day6_Game_Funny_Story {
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    public void setStory(String newStory) {
        this.story = newStory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[2] + ", but " + numberHolder[1];
    }

    public void enterName() {
        setName(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give me a noun:");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun:");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Give me the last noun:");
        setNoun3(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Give me an adjective:");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("Give me another adjective:");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Give me an adverb:");
        setAdverb(scanner.nextLine());
    }

    public void printInstructions() {
        System.out.println("Welcome to MadLibs game. If you type in "
                + "words, we'll give you a story. Start by typing in a name:");
    }

    public void putTogetherTneStory() {
        String story = "Jesse and her best friend " + getName() + " went to Disney World today! " +
                "\nThey saw a " + getNoun1() + " in a show at the Magic Kingdom "
                + "and ate a " + getAdjective1() + " feast for dinner. \nThe next day I"
                + " ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2() +
                " and then that night \nI gazed at the " + getRandomNums() +
                " " + getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        setStory(story);
    }

    public void play() {
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdjective1();
        enterAdjective2();
        enterAdverb();
        setRandomNums();
        putTogetherTneStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        Day6_Game_Funny_Story game = new Day6_Game_Funny_Story();
        game.printInstructions();
        game.play();
    }
}