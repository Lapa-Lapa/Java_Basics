package HackerRank_30_Days_of_Code.Day15_Linked_List.Day15_Tutorial;

public class Node {
    //Properties
    Node next;
    int data;

    public Node (int newData){
        data =newData;
        next = null;
    }
    public Node (int newData,Node newNext){
        data =newData;
        next = newNext;
    }

    //Getters and Setters
    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setData(int newData) {
        this.data = newData;
    }
    public void setNext(Node newNode) {
        this.next = newNode;
    }
}
