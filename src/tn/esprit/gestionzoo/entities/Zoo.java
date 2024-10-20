
package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name; // Le nom du zoo ne doit pas être vide
    private String city;
    private final int nbrCages; // Rendre nbrCages constant
    private int animalCount; // Compteur d'animaux

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.animals = new Animal[nbrCages]; // Limite à nbrCages animaux
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages; // Constante
        this.animalCount = 0; // Compteur d'animaux
    }

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return false; // Zoo est plein
        }

        // Pour vérifier si l'animal est déjà dans le zoo
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal est déjà présent dans le zoo !");
            return false; // Animal déjà existant
        }

        // Pour ajouter l'animal à la première case disponible
        animals[animalCount] = animal;
        animalCount++;
        return true; // Ajout réussi
    }

    // Méthode pour supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'est pas dans le zoo !");
            return false; // Animal non trouvé
        }

        // Supprimer l'animal en décalant les éléments
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--; // Décrémenter le compteur
        return true; // Suppression réussie
    }

    // Méthode pour afficher les animaux
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Méthode pour rechercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i; // Retourner l'indice si trouvé
            }
        }
        return -1; // Pas trouvé
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Méthode pour comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Current Animal Count: " + animalCount);
    }

    // Override toString() pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }

    // Getter pour le nom du zoo
    public String getName() {
        return name;
    }
}
