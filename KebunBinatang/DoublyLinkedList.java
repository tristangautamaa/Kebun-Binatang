package KebunBinatang;

class DoublyCircularLinkedList {
    Node head;

    class Node {
        Hewan hewan;
        Node prev;
        Node next;

        Node(Hewan hewan) {
            this.hewan = hewan;
            this.prev = null;
            this.next = null;
        }
    }

    public void add(Hewan hewan) {
        Node newNode = new Node(hewan);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.prev = head.prev;
            newNode.next = head;
            head.prev.next = newNode;
            head.prev = newNode;
        }
    }

    public void printList() {
        if (head != null) {
            Node current = head;
            do {
                System.out.println(current.hewan.getNamahewan());
                current = current.next;
            } while (current != head);
        }
    }
}