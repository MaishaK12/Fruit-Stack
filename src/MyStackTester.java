public class MyStackTester {

    public static void main(String[] args) {
        MyStack<Fruit> stack = new MyStack<>();

        // Add three items to stack using push method
        stack.push(new Fruit("Apple"));
        stack.push(new Fruit("Banana"));
        stack.push(new Fruit("Orange"));

        // Display items in stack using view method
        System.out.println("########Push########");
        stack.view();

        // Display number of items in stack using toString method
        System.out.println(stack);

        // Peek at top item and display it
        System.out.println("########Peek########");
        System.out.println(stack.peek());

        // Display number of items in stack again
        System.out.println(stack);

        // Pop items from stack using while loop
        System.out.println("########Pop########");
        while (!stack.isEmpty()) {
            System.out.println("POP: " + stack.pop());
        }

        // Display number of items in stack once again
        System.out.println(stack);
    }
}
