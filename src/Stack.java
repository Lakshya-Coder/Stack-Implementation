public class Stack <T> implements Iterable <T>{

    private java.util.LinkedList <T> list  = new java.util.LinkedList<>();

    // Create an empty stack
    public Stack() {}

    // Create a Stack with an initial element
    public Stack(T first_elem) {
        push(first_elem);
    }

    // Return the number of elements in the stack
    public int size() {
        return list.size();
    }

    // Check is the Stack is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Push element on the stack
    public void push(T elem) {
        list.addLast(elem );
    }

    // Pop an element off the stack
    // Throws an error is stack is empty
    public T pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.removeLast();
    }

    // Peek the top of the stack without removing an element
    // Throws an error is stack is empty
    public T peek()  {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.peekLast();
    }

    // Allow the user to iterate the stack using an iterator
    @Override
    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
