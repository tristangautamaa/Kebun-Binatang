package KebunBinatang;
public class Herbivora extends Hewan {

    public Herbivora(String nama, String habitat) {
        super(nama, "Rumput", habitat);
    }

    @Override
    
    // nah ini masih blom pasti, soalnya belum ada gambaran 
    // yang jelas dengan outputnya
    // soal kegiatan atau info..
    public void info() { 
        System.out.println("Nama: " + nama);
        System.out.println("Makanan: " + makanan);
        System.out.println("Habitat: " + habitat);
    }
}

    // Isinya SUPER dari --> name, makanan, habitat
    // Mengandung override sebuah method yang tidak ada di abstract
    // Override itu keluarnya bareng tapi outputnya berbeda
    // Mengandung hewan sedang melakukan apa

