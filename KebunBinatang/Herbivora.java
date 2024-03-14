package KebunBinatang;

public class Herbivora extends Hewan {
    Public Herbivora (String nama, String makanan, String habitat) {
        super(nama, makanan, habitat);
        }

        @Override
        void aktivitas(){
            System.out.println( nama + " sedang memakan " + makanan + ".");
        }

    // Isinya SUPER dari --> name, makanan, habitat
    // Mengandung override sebuah method yang tidak ada di abstract
    // Override itu keluarnya bareng tapi outputnya berbeda
    // Mengandung hewan sedang melakukan apa
}
