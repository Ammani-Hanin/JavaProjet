import java.util.Scanner;

public class ZooManagement {

    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();  // Instanciation de l'objet
        zoo.getUserInput();  // Appel de la méthode pour saisir les informations
        zoo.displayInfo();   // Affichage des informations

        // Création d'un animal (lion)
        Animal lion = new Animal("Feli", "Lion", 5, true);

        // Création d'un zoo (myZoo)
        Zoo myZoo = new Zoo("africa", "Tunis", 25);

        // Ajout de l'animal au zoo
        myZoo.addAnimal(lion, 0);

        // Affichage des informations du zoo
        myZoo.displayZoo();

        // Affichage du zoo avec les deux instructions
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        nbrCages = scanner.nextInt();

        scanner.close();
    }

    public void displayInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}
