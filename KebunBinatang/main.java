package KebunBinatang;

public class main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("Harimau", "Daging", "Hutan");
        Hewan hewan2 = new Hewan("Kambing", "Rumput", "Ladang");
        Zookeper zookeper1 = new zookeper("Jonathan", "Feeding");
        Zookeper zookeper2 = new zookeper("Fernando", "Playing");

        // to be continued
        hewan1.performTidur();
        zookeper1.performMakan();
        hewan2.performMandi();
    }
}