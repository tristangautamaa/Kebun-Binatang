package KebunBinatang;

public class main {
        public static void main(String[] args) {
                Karnivora hewan1 = new Karnivora("Harimau", "Daging", "Hutan",
                                "Hewan karnivora yang memiliki cakar yang besar",
                                "Roar", "Makan");
                Herbivora hewan2 = new Herbivora("Kambing", "Rumput", "Ladang",
                                "Hewan herbivora yang suka memakan dedaunan",
                                "Mbee", "Tidur");
                Karnivora hewan3 = new Karnivora("Elang", "Daging", "Gunung",
                                "Hewan berdarah panas, mempunyai sayap dan tubuh yang diselubungi bulu pelepah",
                                "Skriaa",
                                "Bertengger");

                Pengunjung pengunjung1 = new Pengunjung("Jonathan", 17, "Jakarta", "Laki-laki", "Kambing");
                Pengunjung pengunjung2 = new Pengunjung("Fernando", 18, "Pontianak", "Perempuan", "Harimau");

                hewan1.info();
                hewan2.info();
                hewan3.info();

                hewan1.deskripsi();
                hewan1.suara();
                hewan2.suara();
                hewan3.kegiatan();

                pengunjung1.info();
                pengunjung2.info();

                pengunjung1.HewanFavorit();
                pengunjung2.HewanFavorit();
        }
}