package KebunBinatang;

class Queue {
    private int maxSize;
    private Hewan[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new Hewan[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(Hewan hewan) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            rear++;
            queueArray[rear] = hewan;
            nItems++;
        }
    }

    public Hewan dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Hewan temp = queueArray[front];
            front++;
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
