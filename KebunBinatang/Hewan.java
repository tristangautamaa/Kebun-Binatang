package KebunBinatang;

public abstract class Hewan {
protected String namahewan;
protected String makanan;
protected String habitat;
protected String deskripsi;
protected String suara;
protected String kegiatan;

public Hewan(String namahewan, String makanan, String habitat) {
    this.namahewan = namahewan;
    this.makanan = makanan;
    this.habitat = habitat;
}

public String getNamahewan() {
    return namahewan;
}

public void setNamahewan(String namahewan) {
    this.namahewan = namahewan;
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

public void setDeskripsi(String deskripsi) {
    this.deskripsi = deskripsi;
}

public void setSuara(String suara) {
    this.suara = suara;
}

public void setKegiatan(String kegiatan) {
    this.kegiatan = kegiatan;
}

// Add a method to display the information
public abstract void info();

}
    // ISINYA ATRIBUT nama, makanan, habitat dan constructornya sehingga di
    // Karnivora dan Hebivora CUKUP manggil pake SUPER
    // abstract class ini isinya yang dikit itu
    // pasang getter setter disini untuk mencegah input manual

