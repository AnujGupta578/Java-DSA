package tutorials.linkedList;

import java.util.List;

public class MergeSort {
    private ListNode head;
    private ListNode tail;
    private int size;

    MergeSort() {
        this.size = 0;
    }

    public static void main(String[] args) {
        MergeSort list = new MergeSort();

        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }

        list.display();

        list.bubbleSort();

        list.display();

        list.reverse(list.head);
        list.display();

    }

    public void insertFirst(int value) {

         ListNode node = new ListNode(value);
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

        ListNode node = new ListNode(value);
        tail.next = node;
        tail = node;
        size += 1;
    }



    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

       return merge(left, right);
    }



    public ListNode merge(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1: list2;
        return dummyHead.next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void bubbleSort(){
        bubbleSort(size - 1, 0);

    }

    public ListNode get(int index) {
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private void bubbleSort(int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            ListNode first = get(col);
            ListNode second = get(col + 1);

            if(first.val > second.val) {
//                swap
                if(first == head) {

                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    first.next = null;
                    tail = first;
                    second.next = tail;
                } else {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        } else {
            bubbleSort(row -1 , 0);
        }
    }

    private void reverse(ListNode node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseInPlace() {
        if(size < 2) {
            return;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if(next != null) {
                next = next.next;
            }

        }

        head = prev;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if(next != null) {
                next = next.next;
            }

        }

        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        for (int i = 0;  current != null && i < left -1; i++) {
            prev = current;
            current = current.next;
            
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse btw left and right
        ListNode next = current.next;

        for (int i = 0;  current != null && i < right - left +1 ; i++) {
            current.next = prev;
            prev = current;
            current = next;

            if(next != null) {
                next = next.next;
            }

        }
        if (last != null){
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;

        return head;


    }

    public boolean isPlaindrome() {
        ListNode mid = middleNode(head);

        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        while (head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            headSecond = headSecond.next;
            head = head.next;
        }

        reverseList(rereverseHead);

        return head == null || headSecond == null;

    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf = head;

        while (hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp  = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if(hf != null) {
            hf.next = null;
        }
    }

    public ListNode reverseKGroup(ListNode head , int k) {

        if(k <= 1 || head == null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (true) {
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse btw left and right
            ListNode next = current.next;

            for (int i = 0;  current != null && i < k ; i++) {
                current.next = prev;
                prev = current;
                current = next;

                if(next != null) {
                    next = next.next;
                }

            }
            if (last != null){
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            if(current == null) {
                break;
            }
            prev = newEnd;
        }

        return head;

    }

    public ListNode rotateRight(ListNode head, int k ) {

        if(k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode last = head;
        int length = 1;
        while (last.next !=null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotation = k % length;
        int skip = length - rotation;
        ListNode newLast = head;

        for (int i = 0; i < skip -1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;


    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
            next = null;
        }

        ListNode() {}
    }
}
