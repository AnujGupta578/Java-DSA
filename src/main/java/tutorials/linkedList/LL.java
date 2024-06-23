package tutorials.linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insertAt(int value, int index) {
        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null) {
            tail = null;
        }

        return val;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);

        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteAt(int index) {
        if(index == 0) {
           return deleteFirst();
        }
        if(index == size) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        int val = temp.next.value;
        temp.next = temp.next.next;

        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node findNode(int value) {
        Node node = head;
        while (node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }

}
