package KebunBinatang;

public class Karnivora extends Herbivora {
    
    private String deskripsi;
    private String suara;
    private String kegiatan;

    public Karnivora(String nama, String makanan, String habitat, String deskripsi, String suara, String kegiatan) {
        super(nama, makanan, habitat); 
        this.deskripsi = deskripsi;
        this.suara = suara;
        this.kegiatan = kegiatan;
    }
    
    @Override
    public void info() {
        super.info(); 
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Suara: " + suara);
        System.out.println("Kegiatan: " + kegiatan);
        System.out.println();
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }
}
