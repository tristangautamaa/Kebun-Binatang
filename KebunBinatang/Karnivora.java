package KebunBinatang;

public class Karnivora extends Hewan {
    class Karnivora extends Hewan {
        public Karnivora(String name, String makanan, String habitat) {
            super(name, makanan, habitat);
        }
    
        @Override
        void aktivitas() {
            System.out.println(name + " sedang memakan " + makanan + ".");
        }
    }
}

