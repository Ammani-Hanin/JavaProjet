package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs; // Nombre de pattes de l'animal terrestre

    // Constructeur par défaut
    public Terrestrial() {
        super("Terrestrial", "Unknown", 0, true);
        this.nbrLegs = 0;
    }

    // Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Getter
    public int getNbrLegs() {
        return nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}
