package KebunBinatang;
public class Herbivora extends Hewan {

    public Herbivora(String nama, String makanan, String habitat) {
        super(nama, makanan, habitat);
    }

    @Override
    
    // nah ini masih blom pasti, soalnya belum ada gambaran 
    // yang jelas dengan outputnya
    // soal kegiatan atau info..
    public void info() {
        System.out.println("Nama Hewan: " + namahewan);
        System.out.println("Makanan: " + makanan);
        System.out.println("Habitat: " + habitat);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Suara: " + suara);
        System.out.println("Kegiatan: " + kegiatan);
    }
}

    // Isinya SUPER dari --> name, makanan, habitat
    // Mengandung override sebuah method yang tidak ada di abstract
    // Override itu keluarnya bareng tapi outputnya berbeda
    // Mengandung hewan sedang melakukan apa

