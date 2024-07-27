package tutorials.stacks;

import java.util.Stack;

public class QueueUsingStackRemoved {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemoved() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
       first.push(item);

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public void removed() throws Exception {
        first.pop();
    }

    public int peek() throws Exception {
        return first.peek();
    }

    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }
}
