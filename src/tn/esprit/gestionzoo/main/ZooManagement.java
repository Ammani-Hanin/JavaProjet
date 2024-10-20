package tn.esprit.gestionzoo.main;

import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;

public class ZooManagement {
    private String zooName;
    private final int nbrCages;
    private Zoo myZoo; // Instance de zoo

    public ZooManagement(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des informations du zoo
        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        int cages = scanner.nextInt();

        // Instanciation de l'objet ZooManagement
        ZooManagement zooManagement = new ZooManagement(cages);
        zooManagement.myZoo = new Zoo(zooName, "Tunis", cages);

        // Création d'un animal terrestre
        Terrestrial tiger = new Terrestrial("Felidae", "Tiger", 4, true, 4);

        // Création d'un dauphin
        Dolphin dolphin = new Dolphin("Dolphin", 3, true, "Ocean", 25.5f);

        // Création d'un pingouin
        Penguin penguin = new Penguin("Penguin", 2, true, "Antarctica", 15.0f);

        // Affichage des informations
        System.out.println(tiger);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Appel de la méthode swim()
        dolphin.swim();
        penguin.swim();

        // Affichage des informations du zoo
        zooManagement.displayInfo();

        // Affichage des animaux dans le zoo
        zooManagement.myZoo.displayAnimals();

        // Affichage du zoo avec les deux instructions
        System.out.println(zooManagement.myZoo);
        System.out.println(zooManagement.myZoo.toString());

        // Fermeture du scanner
        scanner.close();
    }

    public void displayInfo() {
        System.out.println(myZoo.getName() + " comporte " + nbrCages + " cages.");
    }
}
