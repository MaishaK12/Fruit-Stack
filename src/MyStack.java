import java.util.LinkedList;

public class MyStack<E> {

    private LinkedList<E> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    // Push method to add element to top of stack
    public void push(E element) {
        stack.push(element);
    }

    // Pop method to return and remove element at top of stack
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stack.pop();
    }

    // Peek method to return (not remove) element at top of stack
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stack.peek();
    }

    // Size method to return number of entries in stack
    public int size() {
        return stack.size();
    }

    // View method to display elements in stack
    public void view() {
        for (E element : stack) {
            System.out.println(element);
        }
    }

    @Override
    public String toString() {
        int size = size();
        return switch (size) {
            case 0 -> "The stack contains 0 items";
            case 1 -> "The stack contains 1 item";
            default -> "The stack contains " + size + " items";
        };
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
