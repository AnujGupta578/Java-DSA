package tutorials.stacks;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if(isEmpty()) {
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;

        return true;

    }

    public int remove() throws Exception {

        if(isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;

    }

    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        return data[front];
    }

    public void display() throws Exception {

        if(isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        int i = front;

         do {
             System.out.println(data[i] + "->");
             i++;
         } while (i != end);
        System.out.println("End");
//        for (int i = front; i < end; i++) {
//            System.out.println(data[i] + "->");
//        }
    }
}
