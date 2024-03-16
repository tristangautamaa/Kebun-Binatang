package KebunBinatang;

public class Karnivora extends Herbivora {
        public Karnivora(String name, String makanan, String habitat) {
            super(name, makanan, habitat);
        }
    
        @Override
        public void info() { 
            System.out.println("Nama Hewan: " + namahewan);
            System.out.println("Makanan: " + makanan);
            System.out.println("Habitat: " + habitat);
            System.out.println("Deskripsi: " + deskripsi);
            System.out.println("Suara: " + suara);
            System.out.println("Kegiatan: " + kegiatan);
        }
}


