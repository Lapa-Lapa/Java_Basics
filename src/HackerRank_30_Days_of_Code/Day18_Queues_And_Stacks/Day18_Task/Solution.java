package HackerRank_30_Days_of_Code.Day18_Queues_And_Stacks.Day18_Task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    /**
     * Write the following declarations and implementations:
     * Two instance variables: one for your stack, and one for your queue.
     * A void pushCharacter(char ch) method that pushes a character onto a stack.
     * A void enqueueCharacter(char ch) method that enqueues a character
     * in the queue instance variable.
     * A char popCharacter() method that pops and returns the character
     * at the top of the stack instance variable.
     * A char dequeueCharacter() method that dequeues and returns the first character
     * in the queue instance variable.
     */
    Stack<Character> stacky = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    public void pushCharacter(char ch) {
        stacky.push(ch);
    }

    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public char popCharacter() {
        return stacky.pop();
    }

    public char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        // Convert input String to an array of characters:
        char[] s = input.toCharArray();
        // Create a Solution object:
        Solution p = new Solution();
        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}