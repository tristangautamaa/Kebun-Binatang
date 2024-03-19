package KebunBinatang;

public class Herbivora extends Hewan {

    private String deskripsi;
    private String suara;
    private String kegiatan;

    public Herbivora(String nama, String makanan, String habitat, String deskripsi, String suara, String kegiatan) {
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
// masukkan deskripsi, suara, kegiatan
// Isinya SUPER dari --> name, makanan, habitat
// Mengandung override sebuah method yang tidak ada di abstract
// Override itu keluarnya bareng tapi outputnya berbeda
// Mengandung hewan sedang melakukan apa
