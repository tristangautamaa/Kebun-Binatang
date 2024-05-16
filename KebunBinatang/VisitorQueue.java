package KebunBinatang;

import java.util.Scanner;

class VisitorQueue {
    private int maxSize = 5;
    private Pengunjung[] queueArray = new Pengunjung[maxSize];
    private int front;
    private int rear;
    private int nItems;

    public VisitorQueue() {
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void tambahPengunjung(Scanner scanner) {
        if (isFull()) {
            System.out.println("Antrian Pengunjung penuh.");
            return;
        }

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

        enqueue(pengunjung);
        System.out.println("Pengunjung berhasil ditambahkan ke antrian.");
    }

    public void tampilkanPengunjung() {
        if (isEmpty()) {
            System.out.println("Tidak ada pengunjung dalam antrian.");
            return;
        }

        System.out.println("\nAntrian Pengunjung:");
        for (int i = 0; i < nItems; i++) {
            int index = (front + i) % maxSize; // Calculate the actual index
            System.out.println((i + 1) + ". " + queueArray[index].getNama());
        }
    }

    // Queue operations
    public void enqueue(Pengunjung pengunjung) {
        if (rear == maxSize - 1) {
            rear = -1; // Wrap around to the beginning
        }
        rear++;
        queueArray[rear] = pengunjung;
        nItems++;
    }

    public Pengunjung dequeue() {
        if (isEmpty()) {
            return null;
        }
        Pengunjung temp = queueArray[front];
        front = (front + 1) % maxSize; // Wrap around
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
