package tutorials.linkedList;

public class DuplicatesNode {
    private Node head;
    private Node tail;
    private int size;

    public DuplicatesNode() {
        this.size = 0;
    }

    public static void main(String[] args) {
        DuplicatesNode dl = new DuplicatesNode();
        dl.insertLast(1);
        dl.insertLast(1);
        dl.insertLast(1);
        dl.insertLast(2);
        dl.insertLast(4);
        dl.insertLast(4);
        dl.display();
        dl.removeDuplicate();
        dl.display();
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void removeDuplicate() {
        Node currentNode = head;

        while (currentNode.next != null) {
            if(currentNode.val == currentNode.next.val){
                currentNode.next = currentNode.next.next;
                size--;
            } else {
                currentNode = currentNode.next;
            }
        }

        tail = currentNode;
        tail.next = null;
    }

    private class Node {
        int val;
        Node next;

        public Node (int val) {
            this.val = val;
        }

        public Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
