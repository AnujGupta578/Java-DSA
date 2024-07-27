package tutorials.stacks;

public class Main {

    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack();

        DynamicStack stack = new DynamicStack();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(35);

        stack.display();

//        System.out.println("-------------------- pop --------------------");
//
//        System.out.println(stack.pop());
//
//        System.out.println("-------------------- peak ------------------");
//
//        System.out.println(stack.peek());
    }
}
