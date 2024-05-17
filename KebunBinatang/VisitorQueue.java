package KebunBinatang;

import java.util.Scanner;

class VisitorQueue {
    private Node head;
    private Node tail;

    public VisitorQueue() {
        head = null;
        tail = null;
    }

    public void tambahPengunjung(Scanner scanner) {
        System.out.print("Nama pengunjung: ");
        String nama = scanner.nextLine();
        System.out.print("Umur pengunjung: ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Asal pengunjung: ");
        String asal = scanner.nextLine();
        System.out.print("Jenis kelamin pengunjung: ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Hewan favorit pengunjung: ");
        String hewanFavorit = scanner.nextLine();

        Pengunjung pengunjung = new Pengunjung(nama, umur, asal, jenisKelamin, hewanFavorit);

        if (isInQueue(pengunjung.getNama())) {
            System.out.println("Pengunjung " + pengunjung.getNama() + " sudah berada di antrian.");
            return;
        }

        enqueue(pengunjung);
        System.out.println("Pengunjung berhasil ditambahkan ke antrian.");

        if (!isEmpty()) {
            System.out
                    .println("\nPengunjung saat ini sedang mengunjungi Kebun Binatang: " + head.data.getNama());
            System.out.println("Pengunjung " + pengunjung.getNama() + " sedang menunggu dalam antrian.");
        }
    }

    public void tampilkanPengunjung() {
        if (isEmpty()) {
            System.out.println("Tidak ada pengunjung dalam antrian.");
            return;
        }

        System.out.println("\nAntrian Pengunjung:");
        Node current = head;
        int i = 1;
        while (current != null) {
            System.out.println(i + ". " + current.data.getNama());
            current = current.next;
            i++;
        }
    }

    public void enqueue(Pengunjung pengunjung) {
        Node newNode = new Node(pengunjung);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Pengunjung dequeue() {
        if (isEmpty()) {
            return null;
        }
        Pengunjung temp = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void visitZoo() {
        if (!isEmpty()) {
            Pengunjung currentVisitor = dequeue();
            System.out.println(
                    "\nPengunjung " + currentVisitor.getNama() + " sekarang sedang mengunjungi Kebun Binatang.");
        } else {
            System.out.println("\nTidak ada orang dalam antrian.");
        }
    }

    private class Node {
        private Pengunjung data;
        private Node next;

        public Node(Pengunjung data) {
            this.data = data;
            this.next = null;
        }
    }

    private boolean isInQueue(String visitorName) {
        Node current = head;
        while (current != null) {
            if (current.data.getNama().equals(visitorName)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
