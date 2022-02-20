package lists;

public class MyLinkedList<e> {
    Node<e> head;

    public void add(e data) {
        Node<e> toAdd = new Node<>(data);
        if (isEmpty()) {
            head = toAdd;
            return;
        }

        Node<e> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;

    }

    public e get(int a) {
        Node<e> temp = head;
        for (int i = 0; i < a; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void remove(e a) {
        Node<e> temp = head;
        Node<e> prev = null;
        if (temp != null && temp.data == a) {
            head = temp.next; // Changed head 
            return;
        }
        while (temp != null && temp.data != a) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;

        prev.next = temp.next;

    }

    public boolean contains(e a) {
        Node<e> temp = head;
        if (temp == null) return false;
        while (temp != null) {
            if (temp.data == a) {
                return true;
            }
            temp = temp.next;
        }
        return false;


    }

    public void remove(int a) {
        Node<e> temp = head;
        Node<e> prev = null;
        if (temp != null && 1 == a) {
            head = temp.next; // Changed head 
            return;
        }
        for (int i = 1; i < a; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;

        prev.next = temp.next;

//		remove(temp.data);
    }

    public e set(int a, e dat) {
        Node<e> temp = head;
        for (int i = 0; i < a; i++) {
            temp = temp.next;
        }
        temp.data = dat;
        return temp.data;
    }

    public int size() {
        int length = 0;
        Node<e> temp = head;
        while (temp != null) {
//			 System.out.print(temp.data + " ");
            temp = temp.next;
            length++;
        }
        return length;
    }

    public void print() {
        Node<e> temp = head;
        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    public void clear() {
        head = null;
    }

    public void removeAll(MyLinkedList<e> l) {
//		Node<e> temp1 = l.head;
        Node<e> temp = head;
//		Node<e> prev = null;
        for (int i = 1; i < size() - l.size(); i++) {
//			 prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;

        temp.next = null;

    }

    public void addAll(MyLinkedList<e> l) {
//		Node<e> temp = l.head;
        Node<e> temp1 = head;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = l.head;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public <T> int[] toArray() {
        Node<e> temp = head;

        int[] arr = new int[size()];
        for (int i = 0; i < size(); i++) {
            arr[i] = (int) temp.data;
            temp = temp.next;
        }
        return arr;
    }

    public <E> e removeLast() throws Exception {
        Node<e> temp = head;
        if (temp == null) {
            throw new Exception("cant remove last element from empty stack");
        }
        if (temp.next == null) {
            Node<e> toRemove = head;
            head = null;
            return toRemove.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node<e> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }

    public <E> e getLast() throws Exception {
        Node<e> temp = head;
        if (temp == null) {
            throw new Exception("cant peek last element from empty stack");
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public static class Node<e> {
        public e data;
        public Node<e> next;

        public Node(e data) {
            this.data = data;
            next = null;
        }
    }


}
