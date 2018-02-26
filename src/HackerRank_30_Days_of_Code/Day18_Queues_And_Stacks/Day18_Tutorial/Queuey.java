package HackerRank_30_Days_of_Code.Day18_Queues_And_Stacks.Day18_Tutorial;

import java.util.LinkedList;

public class Queuey {
    //FIFO - First In First Out
    LinkedList queue;

    public Queuey() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(int n) {
        queue.addLast(n);
    }

    public int dequeue() {
        return (int) queue.remove(0);
    }

    public int peek() {
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out:"+numberQueue.dequeue());
        System.out.println("Peek at second item:"+numberQueue.peek());
        System.out.println("Second out:"+numberQueue.dequeue());
        System.out.println("Third out:"+numberQueue.dequeue());
    }
}
