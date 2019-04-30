package hu.codecool.stack.staticstack;

public class StaticStack {

    private int [] stack;
    private int counter;

    public StaticStack(int length) {
        this.stack = new int [length];
        this.counter = 0;
    }

    public void push(int number) {
        if (counter < stack.length) {
            stack[counter] = number;
            counter++;
        } else {
            try {
                throw new StackOverflowExeption("The Stack is full!");
            } catch (StackOverflowExeption stackOverflowExeption) {
                stackOverflowExeption.printStackTrace();
            }
        }
    }

    public int pop() {
        if (counter < 0) {
            try {
                throw new StackUnderflowExeption("The Stack is empty!");
            } catch (StackUnderflowExeption stackUnderflowExeption) {
                stackUnderflowExeption.printStackTrace();
            }
        }
        int last = stack[counter-1];
        stack[counter-1] = 0;
        counter--;
        return last;
    }

    public int peek() {
        if (counter < 0) {
            try {
                throw new StackUnderflowExeption("The Stack is empty!");
            } catch (StackUnderflowExeption stackUnderflowExeption) {
                stackUnderflowExeption.printStackTrace();
            }
        }
        return stack[counter-1];
    }

    public int length() {
        return counter;
    }
}
