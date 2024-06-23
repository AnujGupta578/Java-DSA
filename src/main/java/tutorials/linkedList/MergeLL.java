package tutorials.linkedList;

public class MergeLL {
    int size;
    Node head;
    Node tail;

    MergeLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size +=1;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size +=1;

    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public static MergeLL mergeLL(MergeLL first, MergeLL second) {

        Node fn = first.head;
        Node sn = second.head;


        MergeLL ans = new MergeLL();

        while (fn != null && sn != null) {
            if(fn.val < sn.val) {
                ans.insertLast(fn.val);
                fn = fn.next;
            } else {
                ans.insertLast(sn.val);
                sn = sn.next;
            }
        }

        while (fn != null) {
            ans.insertLast(fn.val);
            fn = fn.next;
        }

        while (sn != null) {
            ans.insertLast(sn.val);
            sn = sn.next;
        }

        return ans;
    }

    public static void main(String[] args) {

        MergeLL l1 = new MergeLL();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(8);

        l1.insertLast(10);
        l1.insertLast(15);

        MergeLL l2 = new MergeLL();
        l2.insertLast(1);
        l2.insertLast(2);
        l2.insertLast(3);

        MergeLL mergeLL = MergeLL.mergeLL(l1, l2);

        mergeLL.display();


    }

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
