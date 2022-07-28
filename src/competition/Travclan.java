package competition;

import java.util.Scanner;
import java.util.Stack;

public class Travclan {
    static Node head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SIZE = 6;
        int[] array = new int[SIZE];
        for (int index = 0; index < SIZE; index++) {
            array[index] = sc.nextInt();
        }
        for (int index = 0; index < SIZE; index++) {
            add(array[index]);
        }

        printList(head);
        reverseList();
    }

    public static Node middleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void add(int data) {
        Node toAdd = new Node(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public static boolean isEmpty() {
        return head == null;
    }

    static void reverseList() {

        Stack<Node> s = new Stack<>();
        Node temp = head;
        while (temp.next != null) {
            s.add(temp);
            temp = temp.next;
        }
        head = temp;
        while (!s.isEmpty()) {
            temp.next = s.peek();
            s.pop();
            temp = temp.next;
        }
        temp.next = null;
    }

    static void printList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void insertBack(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
        } else {
            Node last_node = head;
            while (last_node.next != null) last_node = last_node.next;
            last_node.next = temp;
        }
    }

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
