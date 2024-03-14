package KebunBinatang;

public class Kegiatan {
    // Attribute to Astronaut Class
    String name;

    // Constructor to initialize the attributes
    public Kegiatan(String name) {
        this.name = name;
    }

    public void checkCondition() {
        System.out.println(name + " is busy playing.");
    }
}
