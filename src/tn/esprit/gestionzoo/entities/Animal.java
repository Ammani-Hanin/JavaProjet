package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age; // L'âge ne doit pas être négatif
    private boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Getters
    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    // Override toString() pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
