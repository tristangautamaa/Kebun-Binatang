package KebunBinatang;

public class Pengunjung { 
    // isinya atribut dan constructor dari pengunjungnya
    private String nama;
    private int umur;
    private String asal;

    public Pengunjung(String nama, int umur, String asal) {
    this.nama = nama;
    this.umur = umur;
    this.asal = asal;
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

    public String getAsal(){
        return asal;
    }

    public void setAsal(String asal){
         this.asal;
    }
}
