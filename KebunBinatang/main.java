package KebunBinatang;

public class main {
    public static void main(String[] args) {
        // TAMBAHIN SUARA, KEGIATAN, DESKRIPSI
        Karnivora hewan1 = new Karnivora("Harimau", "Daging", "Hutan");
        Karnivora hewan3 = new Karnivora("Elang", "Daging", "Gunung", "suara");

        Herbivora hewan2 = new Herbivora("Kambing", "Rumput", "Ladang");

        Pengunjung pengunjung1 = new Pengunjung("Jonathan", 17, "Jakarta");
        Pengunjung pengunjung2 = new Pengunjung("Fernando", 18, "Pontianak");

        hewan1.info();
        hewan2.info();
        hewan3.info();
        pengunjung1.info();
        pengunjung2.info();

        // variable cuman bisa di panggil sekali kalo lebih dari satu maka akan
        // overlap/duplicate
        // bikin public void buat output, bukan getting setter

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