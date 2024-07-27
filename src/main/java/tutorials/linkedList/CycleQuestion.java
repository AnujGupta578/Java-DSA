package tutorials.linkedList;

public class CycleQuestion {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }

        return false;
    }

    public int getCycleLength(ListNode head) {
        CycleQuestion cycleQuestion  = new CycleQuestion();
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
//                calculate length of cycle
                ListNode temp = slow;
                int length = 0;
                while (temp.next != fast) {
                    temp = temp.next;
                    length +=1;
                }
                return length;
            }
        }

        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
//                calculate length of cycle
                length = getCycleLength(head);
                break;
            }
        }

        if(length == 0) {
            return null;
        }

//        find a start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

//        keep moving both forward and they will meet at cycle start;

        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;

    }

    public boolean isHappy(int num) {
        int fast = num;
        int slow = num;

        do {
            slow = findSquare(num);
            fast = findSquare(findSquare(num));

        } while (fast != slow);

        if (slow == 1) {
            return true;
        }
        return false;


    }

    private int findSquare(int num) {
        int sum = 0;
        while (num>0) {
            int rem = num % 10; // give the last digit 145 % 10 -> 5
            sum += rem * rem;
            num /= 10;   // give the rest num 145 / 10 -> 14
        }
        return sum;
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


    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
            next = null;
        }
    }
}
