package KebunBinatang;

public class Pengunjung {
    // isinya atribut dan constructor dari pengunjungnya
    private String nama;
    private int umur;

    public Pengunjung(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
    }

    // getter setter untuk mencegah input manual
    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
