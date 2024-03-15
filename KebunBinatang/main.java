package KebunBinatang;

public class main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Harimau", "Daging", "Hutan");
        Hewan hewan2 = new Hewan("Kambing", "Rumput", "Ladang");
        Hewan hewan3 = new Hewan("Elang", "Daging", "Gunung");
        Pengunjung pengunjung1 = new Pengunjung("Jonathan", 17, "Jakarta");
        Pengunjung pengunjung2 = new Pengunjung("Fernando", 18, "Pontianak");
        
        pengunjung1.info();
        pengunjung2.info();

        Hewan hewan1 = new Hewan("Harimau", "Daging", "Hutan");
        hewan1.setDeskripsi("Mamalia besar dengan gigi tajam dan loreng oranye hitam.");
        hewan1.setSuara("roar");
        hewan1.setKegiatan("makan")
    
        Hewan hewan2 = new Hewan("Kambing", "Rumput", "Ladang");
        hewan2.setDeskripsi("Hewan herbivora yang memakan dedaunan")
        hewan2.setSuara("mbeee");
        hewan2.setKegiatan("tidur")
    
        Hewan hewan3 = new Hewan("Elang", "Daging", "Gunung");
        hewan3.setDeskripsi("Hewan berdarah panas, mempunyai sayap dan tubuh yang diselubungi bulu pelepah");
        hewan3.setSuara("skriaa");
        hewan3.setKegiatan("bertengger")
    }
}