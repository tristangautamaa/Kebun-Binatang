package KebunBinatang;

public class main {
    public static void main(String[] args) {
        Karnivora hewan1 = new Karnivora("Harimau", "Daging", "Hutan");
        Karnivora hewan3 = new Karnivora("Elang", "Daging", "Gunung");
        Herbivora hewan2 = new Herbivora("Kambing", "Rumput", "Ladang");

        Pengunjung pengunjung1 = new Pengunjung("Jonathan", 17, "Jakarta");
        Pengunjung pengunjung2 = new Pengunjung("Fernando", 18, "Pontianak");

        hewan1.info();
        hewan2.info();
        hewan3.info();
        pengunjung1.info();
        pengunjung2.info();

        hewan1.setDeskripsi("Hewan karnivora yang dengan cakar yang besar");
        hewan1.setSuara("roar");
        hewan1.setKegiatan("makan");

        hewan2.setDeskripsi("Hewan herbivora yang memakan dedaunan");
        hewan2.setSuara("mbeee");
        hewan2.setKegiatan("tidur");

        hewan3.setDeskripsi("Hewan berdarah panas, mempunyai sayap dan tubuh yang diselubungi bulu pelepah");
        hewan3.setSuara("skriaa");
        hewan3.setKegiatan("bertengger");
    }
}