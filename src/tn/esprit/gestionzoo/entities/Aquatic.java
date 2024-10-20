package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat; // Habitat de l'animal aquatique

    // Constructeur par défaut
    public Aquatic() {
        super("Aquatic", "Unknown", 0, true);
        this.habitat = "Unknown";
    }

    // Constructeur paramétré
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Getter
    public String getHabitat() {
        return habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }
}
