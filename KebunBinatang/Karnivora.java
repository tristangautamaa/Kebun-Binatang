package KebunBinatang;

public class Karnivora extends Hewan {

    private String deskripsi;
    private String suara;
    private String kegiatan;

    public Karnivora(String namahewan, String makanan, String habitat, String deskripsi, String suara,
            String kegiatan) {
        super(namahewan, makanan, habitat, deskripsi, suara, kegiatan);
        this.deskripsi = deskripsi;
        this.suara = suara;
        this.kegiatan = kegiatan;
    }

    @Override
    public void info() {
        System.out.println("Nama Hewan: " + namahewan);
        System.out.println("Jenis Makanan: " + makanan);
        System.out.println("Habitat: " + habitat);
    }

    public void deskripsi() {
        System.out.println("Deskripsi dari " + namahewan + ": " + deskripsi);
    }

    public void suara() {
        System.out.println("Suara dari " + namahewan + ": " + suara);
    }

    public void kegiatan() {
        System.out.println("Kegiatan dari " + namahewan + ": " + kegiatan);
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