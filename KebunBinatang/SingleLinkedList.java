package KebunBinatang;

class SingleLinkedList {
    Node head;

    class Node {
        Hewan hewan;
        Node next;

        Node(Hewan hewan) {
            this.hewan = hewan;
            this.next = null;
        }
    }

    public void add(Hewan hewan) {
        Node newNode = new Node(hewan);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.hewan.getNamahewan());
            current = current.next;
        }
    }
}