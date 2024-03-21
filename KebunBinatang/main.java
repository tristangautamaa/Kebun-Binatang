package KebunBinatang;

public class main {
    public static void main(String[] args) {
        Hewan[] daftarHewan = new Hewan[3];
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

        daftarHewan[0] = hewan1;
        daftarHewan[1] = hewan2;
        daftarHewan[2] = hewan3;

        for (Hewan hewan : daftarHewan) {
            hewan.info();
            if (hewan instanceof Karnivora) {
                Karnivora karnivora = (Karnivora) hewan;
                karnivora.deskripsi();
                karnivora.suara();
                karnivora.kegiatan();
            } else if (hewan instanceof Herbivora) {
                Herbivora herbivora = (Herbivora) hewan;
                herbivora.deskripsi();
                herbivora.suara();
                herbivora.kegiatan();
            }
        }

        int jumlahBinatang = daftarHewan.length;
        System.out.println("Jumlah hewan di kebun binatang: " + jumlahBinatang);
        System.out.println("=======================================");

        Pengunjung pengunjung1 = new Pengunjung("Jonathan", 17, "Jakarta",
                "Laki-laki", "Kambing");
        Pengunjung pengunjung2 = new Pengunjung("Fernando", 18, "Pontianak",
                "Perempuan", "Harimau");

        hewan1.deskripsi();
        hewan2.suara();
        hewan3.kegiatan();

        pengunjung1.info();
        pengunjung2.info();
        System.out.println();

        pengunjung1.HewanFavorit();
        pengunjung2.HewanFavorit();
    }
}