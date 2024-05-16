package KebunBinatang;

class Stack {
    private int maxSize;
    private Hewan[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new Hewan[maxSize];
        top = -1;
    }

    public void push(Hewan hewan) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            stackArray[top] = hewan;
        }
    }

    public Hewan pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
