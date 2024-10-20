package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth; // Profondeur de nage

    // Constructeur par défaut
    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }

    // Constructeur paramétré
    public Penguin(String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super("Spheniscidae", name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
