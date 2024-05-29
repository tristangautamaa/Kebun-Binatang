package KebunBinatang;

import java.util.Scanner;

class ZooKeeper implements ZooInterface {
    Hewan[] hewanArray = new Hewan[10];
    int hewanCount = 0;
    int currentIndex = 0;
    UndoAction[] undoStack = new UndoAction[10];
    int top = -1;

    @Override
    public void tampilkanHewan() {
        if (hewanCount == 0) {
            System.out.println("Tidak ada hewan di dalam daftar.");
            return;
        }

        System.out.println("\nDaftar Hewan:");
        for (int i = 0; i < hewanCount; i++) {
            System.out.println((i + 1) + ". " + hewanArray[i].getNamahewan());
        }
    }

    @Override
    public void swipeHewan(Scanner scanner) {
        if (hewanCount == 0) {
            System.out.println("Tidak ada hewan di dalam daftar.");
            return;
        }

        System.out.println("\nInformasi Hewan Saat Ini:");
        hewanArray[currentIndex].info();
        hewanArray[currentIndex].deskripsi();
        hewanArray[currentIndex].suara();
        hewanArray[currentIndex].kegiatan();

        while (true) {
            System.out.println("\nSwipe Hewan:");
            System.out.println("1. Swipe ke kanan (Next)");
            System.out.println("2. Swipe ke kiri (Previous)");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih aksi: ");

            int aksi = scanner.nextInt();
            scanner.nextLine();

            if (aksi == 1) {
                currentIndex = (currentIndex + 1) % hewanCount;
                System.out.println("\nInformasi Hewan:");
                hewanArray[currentIndex].info();
                hewanArray[currentIndex].deskripsi();
                hewanArray[currentIndex].suara();
                hewanArray[currentIndex].kegiatan();
            } else if (aksi == 2) {
                currentIndex = (currentIndex - 1 + hewanCount) % hewanCount;
                System.out.println("\nInformasi Hewan:");
                hewanArray[currentIndex].info();
                hewanArray[currentIndex].deskripsi();
                hewanArray[currentIndex].suara();
                hewanArray[currentIndex].kegiatan();
            } else if (aksi == 3) {
                break;
            } else {
                System.out.println("Aksi tidak valid.");
            }

            push(new UndoAction(UndoAction.Type.SWIPE, currentIndex));
        }
    }

    @Override
    public void undo() {
        if (isEmpty()) {
            System.out.println("Tidak ada aksi yang dapat di-undo.");
            return;
        }

        UndoAction action = undoStack[top];
        top--;

        if (action.getType() == UndoAction.Type.ADD) {
            hewanCount--;
            hewanArray[hewanCount] = null;
        } else if (action.getType() == UndoAction.Type.SWIPE) {
            currentIndex = action.getIndex();
        } else if (action.getType() == UndoAction.Type.SWAP) {
            Hewan temp = hewanArray[action.getIndex1()];
            hewanArray[action.getIndex1()] = hewanArray[action.getIndex2()];
            hewanArray[action.getIndex2()] = temp;
        }

        System.out.println("Aksi berhasil di-undo.");
    }

    @Override
    public void swapHewan(Scanner scanner) {
        if (hewanCount < 2) {
            System.out.println("Tidak cukup hewan untuk di-swap.");
            return;
        }

        tampilkanHewan();

        System.out.println("\nSwap Hewan:");
        System.out.print("Masukkan urutan hewan pertama: ");
        int index1 = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.print("Masukkan urutan hewan kedua: ");
        int index2 = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index1 < 0 || index1 >= hewanCount || index2 < 0 || index2 >= hewanCount) {
            System.out.println("Indeks hewan tidak valid.");
            return;
        }

        Hewan temp = hewanArray[index1];
        hewanArray[index1] = hewanArray[index2];
        hewanArray[index2] = temp;

        push(new UndoAction(UndoAction.Type.SWAP, index1, index2));

        System.out.println("Hewan berhasil di-swap!");
    }

    @Override
    public void deleteHewan(Scanner scanner) {
        if (hewanCount == 0) {
            System.out.println("Tidak ada hewan di dalam daftar.");
            return;
        }

        tampilkanHewan();

        System.out.print("\nMasukkan urutan hewan yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= hewanCount) {
            System.out.println("Indeks hewan tidak valid.");
            return;
        }

        for (int i = index; i < hewanCount - 1; i++) {
            hewanArray[i] = hewanArray[i + 1];
        }

        hewanCount--;
        hewanArray[hewanCount] = null;

        if (currentIndex >= index) {
            currentIndex = (currentIndex - 1 + hewanCount) % hewanCount;
        }

        push(new UndoAction(UndoAction.Type.ADD, index));

        System.out.println("Hewan berhasil dihapus!");
    }

    @Override
    public void tambahHewan(Scanner scanner) {
        System.out.println("\nJenis Hewan:");
        System.out.println("- Herbivora");
        System.out.println("- Karnivora");
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

        push(new UndoAction(UndoAction.Type.ADD, hewanCount - 1));

        System.out.println("Hewan berhasil ditambahkan!");
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(UndoAction action) {
        if (isFull()) {

            for (int i = 0; i < top; i++) {
                undoStack[i] = undoStack[i + 1];
            }
            top--;
        }

        top++;
        undoStack[top] = action;
    }

    boolean isFull() {
        return (top == undoStack.length - 1);
    }
}