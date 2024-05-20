package KebunBinatang;

public class DoubleCircularLinkedList {
    private Node head;
    private Node tail;

    private class Node {
        Pengunjung data;
        Node next;
        Node prev;

        public Node(Pengunjung data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public DoubleCircularLinkedList() {
        head = null;
        tail = null;
    }

    public void addLast(Pengunjung pengunjung) {
        Node newNode = new Node(pengunjung);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public Pengunjung removeFirst() {
        if (head == null) {
            return null;
        }
        Pengunjung removedData = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        return removedData;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(String name) {
        if (isEmpty()) {
            return false;
        }
        Node current = head;
        do {
            if (current.data.getNama().equals(name)) {
                return true;
            }
            current = current.next;
        } while (current != head);
        return false;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Tidak ada pengunjung dalam antrian.");
            return;
        }
        Node current = head;
        int i = 1;
        do {
            System.out.println(i + ". " + current.data.getNama());
            current = current.next;
            i++;
        } while (current != head);
    }
}
