package tutorials.linkedList;

public class QuestionLL {
    private Node head;
    private Node tail;
    private int size;

    QuestionLL() {
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

//    insertion by recursion

    public void insertRec(int val, int index) {
       head = insertRec(index, val, head);

    }

    private Node insertRec(int index, int val, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(index-1, val, node.next);
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
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
