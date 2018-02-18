package HackerRank_30_Days_of_Code.Day15_Linked_List.Day15_Task;

import java.util.Scanner;

class Solution {
    /**
     * Task
     * Complete the insert function in your editor so that it creates a new Node
     * (pass dat as the Node constructor argument) and inserts it at the tail of the linked list
     * referenced by the head parameter. Once the new node is added,
     * return the reference to the head node.
     * Note: If the head argument passed to the insert function is null,
     * then the initial list is empty.
     */
    public static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);//null,2 //head =head(null,2).3//
        }
        display(head);
        sc.close();
    }
}