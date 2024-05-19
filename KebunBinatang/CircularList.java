package KebunBinatang;

class CircularAnimalList {
    private Node head;

    private class Node {
        private Hewan data;
        private Node next;

        public Node(Hewan data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularAnimalList() {
        head = null;
    }

    public void addAnimal(Hewan animal) {
        Node newNode = new Node(animal);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void displayAnimals() {
        if (head == null) {
            System.out.println("No animals in the list.");
            return;
        }

        Node current = head;
        do {
            System.out.println(current.data.getNamahewan());
            current = current.next;
        } while (current != head);
    }

    public Hewan removeAnimal(String name) {
        if (head == null) {
            return null;
        }

        if (head.data.getNamahewan().equals(name)) {
            if (head.next == head) { // Only one node
                head = null;
            } else {
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                head = head.next;
                current.next = head;
            }
            return head.data;
        }

        Node current = head;
        Node previous = null;
        do {
            if (current.data.getNamahewan().equals(name)) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }
                return current.data;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        return null;
    }
}