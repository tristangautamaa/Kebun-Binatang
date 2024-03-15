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
    public String nama() {
        return nama;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String makanan() {
        return makanan;
    }
    public void setmakanan(String makanan) {
        this.makanan = makanan;
    }
    public String habitat() {
        return habitat;
    }
    public void sethabitat(String habitat) {
        this.habitat = habitat;
    }

    // ISINYA ATRIBUT nama, makanan, habitat dan constructornya sehingga di
    // Karnivora dan Hebivora CUKUP manggil pake SUPER
    // abstract class ini isinya yang dikit itu
    // pasang getter setter disini untuk mencegah input manual
}
