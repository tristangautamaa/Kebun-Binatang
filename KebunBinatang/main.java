package KebunBinatang;

import java.util.Scanner;

public class main {
    static Hewan[] hewanArray = new Hewan[10]; // Adjust size as needed
    static int hewanCount = 0;
    static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Tampilkan Hewan");
            System.out.println("3. Swipe Hewan");
            System.out.println("4. Keluar");
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

        if (aksi == 1) {
            currentIndex = (currentIndex + 1) % hewanCount;
        } else if (aksi == 2) {
            currentIndex = (currentIndex - 1 + hewanCount) % hewanCount;
        } else {
            System.out.println("Aksi tidak valid.");
            return;
        }

        System.out.println("\nInformasi Hewan:");
        System.out.println("\nInformasi Hewan:");
        hewanArray[currentIndex].info();
        hewanArray[currentIndex].deskripsi();
        hewanArray[currentIndex].suara();
    }
}