package KebunBinatang;

class Pengunjung {
    // isinya atribut dan constructor dari pengunjungnya
    private String nama;
    private int umur;
    private String asal;
    private String jenisKelamin;
    private String hewanFavorit;

    public Pengunjung(String nama, int umur, String asal, String jenisKelamin, String hewanFavorit) {
        this.nama = nama;
        this.umur = umur;
        this.asal = asal;
        this.jenisKelamin = jenisKelamin;
        this.hewanFavorit = hewanFavorit;
    }

    // getter setter untuk mencegah input manual
    public String getNama() {
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

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getHewanFavorit() {
        return hewanFavorit;
    }

    public void setHewanFavorit(String hewanFavorit) {
        this.hewanFavorit = hewanFavorit;
    }

    public void info() {
        System.out.println();
        System.out.println("Pengunjung ini bernama " + nama);
        System.out.println(nama + " berasal dari " + asal + " dan berusia " + umur + " tahun");
    }

    public void HewanFavorit() {
        System.out.println("hewan favorit " + nama + " adalah " + hewanFavorit);
    }
}
