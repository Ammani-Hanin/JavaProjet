import java.util.Scanner;

public class ZooManagement {

    private String zooName;
    private final int nbrCages;
    private Zoo myZoo; // Instance de zoo

    public ZooManagement(int nbrCages) {
        this.nbrCages = nbrCages;
        this.myZoo = new Zoo(zooName, "Tunis", nbrCages); // Créez le zoo avec le nombre de cages
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

        // Création d'un animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Ajout de l'animal au zoo
        if (zooManagement.myZoo.addAnimal(lion)) {
            System.out.println("L'animal a été ajouté avec succès.");
        } else {
            System.out.println("Échec de l'ajout de l'animal.");
        }

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
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}

