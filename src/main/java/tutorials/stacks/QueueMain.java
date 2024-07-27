package tutorials.stacks;

public class QueueMain {

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();

        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);

        queue.display();


        queue.remove();

        System.out.println("---- After removed------");

        queue.display();
    }
}
