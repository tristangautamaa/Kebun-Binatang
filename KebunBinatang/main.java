package KebunBinatang;

public class main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Harimau", "Daging", "Hutan");
        Hewan hewan2 = new Hewan("Kambing", "Rumput", "Ladang");
        Pengunjung pengunjung1 = new pengjunjung("Jonathan", "17");
        Pengunjung pengunjung2 = new pengunjung("Fernando", "18");

        Kegiatan kegiatan1 = new Kegiatan("Makan");
        Kegiatan kegiatan2 = new Kegiatan("Mandi");

        // to be continued
        hewan1.kegiatan1();
        hewan2.kegiatan2();
    }
}