package KebunBinatang;

public class main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Harimau", "Daging", "Hutan");
        Hewan hewan2 = new Hewan("Kambing", "Rumput", "Ladang");
        Hewan hewan3 = new Hewan("Elang", "Daging", "Gunung");
        Pengunjung pengunjung1 = new pengunjung("Jonathan", "17");
        Pengunjung pengunjung2 = new pengunjung("Fernando", "18");

        // to be continued
        pengunjung1.info();
        pengunjung2.info();
        pengunjung1.info();
    }
}