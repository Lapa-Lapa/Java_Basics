package HackerRank_30_Days_of_Code.Day15_Linked_List.Day15_Tutorial;

import java.util.LinkedList;

public class LinkedListOurCustom {
    /**
     * Like TRAIN!
     */
    Node head;
    int count;

    public LinkedListOurCustom() {
        head = null;
        count = 0;
    }

    public LinkedListOurCustom(Node newHead) {
        head = newHead;
        count = 1;
    }

    //Methods
    //add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    //size
    public int size() {
        return count;
    }

    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    //remove
    public void remove(){
        //remove from the back of the list
        Node current = head;
        while (current.getNext().getNext()!=null){
            current =current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList =new LinkedList();
        linkedList.add("Already implemented");
        System.out.println(linkedList);
        linkedList.add("Like kind of Array, but we are not limited! We can add, remove new elements");
        System.out.println(linkedList);

    }
}