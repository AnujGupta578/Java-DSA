package tutorials.stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    int ptr = -1;


    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if(isFull()) {
            System.out.println("Stack is fill !");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Can not pop from empty stack!!");

        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException {
        if(isEmpty()) {
            throw  new StackException("Can not peek from empty stack!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length -1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public void display() {
        for (int stack: data) {
            if(stack != 0) {
                System.out.println(stack);
            }
        }
    }

}
