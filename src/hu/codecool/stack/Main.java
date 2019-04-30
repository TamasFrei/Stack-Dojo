package hu.codecool.stack;

import hu.codecool.stack.staticstack.StaticStack;

public class Main {

    public static void main(String[] args) {
        StaticStack staticStack = new StaticStack(3);
        staticStack.push(1);
        staticStack.push(2);
        staticStack.push(3);
        staticStack.push(3);
        staticStack.push(3);

    }
}
