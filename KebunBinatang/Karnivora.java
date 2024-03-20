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
        System.out.println();
    }

    public void deskripsi() {
        System.out.println("Deskripsi: " + deskripsi);
    }

    public void suara() {
        System.out.println("Suara: " + suara);
    }

    public void kegiatan() {
        System.out.println("Kegiatan: " + kegiatan);
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