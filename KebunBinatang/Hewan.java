package KebunBinatang;

public abstract class Hewan {
    private String nama;
    private String makanan;
    private String habitat;

    public Hewan (String nama, String makanan, String habitat){
        this.nama = nama;
        this.makanan = makanan;
        this.habitat = habitat;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getMakanan() {
        return makanan;
    }
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // ISINYA ATRIBUT nama, makanan, habitat dan constructornya sehingga di
    // Karnivora dan Hebivora CUKUP manggil pake SUPER
    // abstract class ini isinya yang dikit itu
    // pasang getter setter disini untuk mencegah input manual
}
