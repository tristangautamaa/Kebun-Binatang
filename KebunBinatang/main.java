package KebunBinatang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static Hewan[] hewanArray = new Hewan[10];
    static int hewanCount = 0;
    static int currentIndex = 0;
    static UndoAction[] undoStack = new UndoAction[10];
    static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooKeeper zooKeeper = new ZooKeeper();
        VisitorQueue visitorQueue = new VisitorQueue();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Tampilkan Hewan");
            System.out.println("3. Swipe Hewan");
            System.out.println("4. Swap Hewan");
            System.out.println("5. Hapus Hewan");
            System.out.println("6. Batal Tambah Hewan");
            System.out.println("7. Tambah Pengunjung");
            System.out.println("8. Tampilkan Pengunjung");
            System.out.println("9. Pengunjung Masuk");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");

            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        zooKeeper.tambahHewan(scanner);
                        break;
                    case 2:
                        zooKeeper.tampilkanHewan();
                        break;
                    case 3:
                        zooKeeper.swipeHewan(scanner);
                        break;
                    case 4:
                        zooKeeper.swapHewan(scanner);
                        break;
                    case 5:
                        zooKeeper.deleteHewan(scanner);
                        break;
                    case 6:
                        zooKeeper.undo();
                        break;
                    case 7:
                        visitorQueue.tambahPengunjung(scanner);
                        break;
                    case 8:
                        visitorQueue.tampilkanPengunjung();
                        break;
                    case 9:
                        visitorQueue.visitZoo();
                        break;
                    case 10:
                        System.out.println("Terima kasih sudah berkunjung ke kebun binatang.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine();
            }
        }
    }

    static boolean isEmpty() {
        return (top == -1);
    }
}