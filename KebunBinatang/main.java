package KebunBinatang;

import java.util.Scanner;

public class main {
    static Hewan[] hewanArray = new Hewan[10]; // Adjust size as needed
    static int hewanCount = 0;
    static int currentIndex = 0;
    static UndoAction[] undoStack = new UndoAction[10]; // Array-based stack
    static int top = -1; // Index of the top element in the stack

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Tampilkan Hewan");
            System.out.println("3. Swipe Hewan");
            System.out.println("4. Swap Hewan");
            System.out.println("5. Undo"); // Add the Undo option
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (pilihan) {
                case 1:
                    tambahHewan(scanner);
                    break;
                case 2:
                    tampilkanHewan();
                    break;
                case 3:
                    swipeHewan(scanner);
                    break;
                case 4:
                    swapHewan(scanner);
                    break;
                case 5:
                    undo(); // Call the undo function
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void tambahHewan(Scanner scanner) {
        System.out.println("\nJenis Hewan:");
        System.out.println("1. Herbivora");
        System.out.println("2. Karnivora");
        System.out.print("Pilih jenis hewan: ");

        String jenisHewanInput = scanner.nextLine().trim().toLowerCase();

        int jenisHewan = 0;
        if (jenisHewanInput.equals("herbivora")) {
            jenisHewan = 1;
        } else if (jenisHewanInput.equals("karnivora")) {
            jenisHewan = 2;
        } else {
            System.out.println("Jenis hewan tidak valid. Masukkan 'Herbivora' atau 'Karnivora'.");
            return;
        }

        // Get animal details from the user
        System.out.print("Nama hewan: ");
        String namaHewan = scanner.nextLine();
        System.out.print("Makanan: ");
        String makanan = scanner.nextLine();
        System.out.print("Habitat: ");
        String habitat = scanner.nextLine();
        System.out.print("Deskripsi: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Suara: ");
        String suara = scanner.nextLine();
        System.out.print("Kegiatan: ");
        String kegiatan = scanner.nextLine();

        // Declare hewan outside the if blocks
        Hewan hewan;

        if (jenisHewan == 1) {
            hewan = new Herbivora(namaHewan, makanan, habitat, deskripsi, suara, kegiatan);
        } else if (jenisHewan == 2) {
            hewan = new Karnivora(namaHewan, makanan, habitat, deskripsi, suara, kegiatan);
        } else {
            System.out.println("Jenis hewan tidak valid.");
            return;
        }

        hewanArray[hewanCount] = hewan;
        hewanCount++;

        // Push the add action onto the undo stack
        push(new UndoAction(UndoAction.Type.ADD, hewanCount - 1));

        System.out.println("Hewan berhasil ditambahkan!");
    }

    static void tampilkanHewan() {
        if (hewanCount == 0) {
            System.out.println("Tidak ada hewan di dalam daftar.");
            return;
        }

        System.out.println("\nDaftar Hewan:");
        for (int i = 0; i < hewanCount; i++) {
            System.out.println((i + 1) + ". " + hewanArray[i].getNamahewan());
        }
    }

    static void swipeHewan(Scanner scanner) {
        if (hewanCount == 0) {
            System.out.println("Tidak ada hewan di dalam daftar.");
            return;
        }

        System.out.println("\nSwipe Hewan:");
        System.out.println("1. Swipe ke kanan (Next)");
        System.out.println("2. Swipe ke kiri (Previous)");
        System.out.print("Pilih aksi: ");

        int aksi = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        int previousIndex = currentIndex; // Store the previous index for undo

        if (aksi == 1) {
            currentIndex = (currentIndex + 1) % hewanCount;
        } else if (aksi == 2) {
            currentIndex = (currentIndex - 1 + hewanCount) % hewanCount;
        } else {
            System.out.println("Aksi tidak valid.");
            return;
        }

        System.out.println("\nInformasi Hewan:");
        hewanArray[currentIndex].info();
        hewanArray[currentIndex].deskripsi();
        hewanArray[currentIndex].suara();

        // Push the swipe action onto the undo stack
        push(new UndoAction(UndoAction.Type.SWIPE, currentIndex));
    }

    static void swapHewan(Scanner scanner) {
        if (hewanCount < 2) {
            System.out.println("Tidak cukup hewan untuk di-swap.");
            return;
        }

        System.out.println("\nSwap Hewan:");
        System.out.print("Masukkan indeks hewan pertama: ");
        int index1 = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline character

        System.out.print("Masukkan indeks hewan kedua: ");
        int index2 = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline character

        if (index1 < 0 || index1 >= hewanCount || index2 < 0 || index2 >= hewanCount) {
            System.out.println("Indeks hewan tidak valid.");
            return;
        }

        // Swap the animals in the array
        Hewan temp = hewanArray[index1];
        hewanArray[index1] = hewanArray[index2];
        hewanArray[index2] = temp;

        // Push the swap action onto the undo stack
        push(new UndoAction(UndoAction.Type.SWAP, index1, index2));

        System.out.println("Hewan berhasil di-swap!");
    }

    static void undo() {
        if (isEmpty()) {
            System.out.println("Tidak ada aksi yang dapat di-undo.");
            return;
        }

        UndoAction action = undoStack[top]; // Get the top action
        top--; // Pop the top action

        // Perform the undo operation based on the action type
        if (action.getType() == UndoAction.Type.ADD) {
            hewanCount--;
            hewanArray[hewanCount] = null;
        } else if (action.getType() == UndoAction.Type.SWIPE) {
            currentIndex = action.getIndex();
        } else if (action.getType() == UndoAction.Type.SWAP) {
            // Swap back to the original positions
            Hewan temp = hewanArray[action.getIndex1()];
            hewanArray[action.getIndex1()] = hewanArray[action.getIndex2()];
            hewanArray[action.getIndex2()] = temp;
        }

        System.out.println("Aksi berhasil di-undo.");
    }

    // Helper functions for the manual stack
    static boolean isEmpty() {
        return (top == -1);
    }

    static void push(UndoAction action) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++; // Increment top index
        undoStack[top] = action; // Assign the action to the current top index
    }

    static boolean isFull() {
        return (top == undoStack.length - 1);
    }
}