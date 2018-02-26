package HackerRank_30_Days_of_Code.Day18_Queues_And_Stacks.Day18_Tutorial;

import java.util.Stack;

public class Stacks {
    //Last In First Out

    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop()+" ");
        System.out.println("Peek:"+stacky.peek());
        System.out.println(stacky.pop()+"!");
        System.out.println("Size " + stacky.size());
    }
}