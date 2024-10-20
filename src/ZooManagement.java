import java.util.Scanner;

public class ZooManagement {



/*

1/ Instruction 1 :

    static int nbrCages = 20;
    static String zooName = "my zoo";

    public static void main(String[] args) {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}

*/

// 2/ Instruction 2 :

    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();  // Instanciation de l'objet
        zoo.getUserInput();  // Appel de la méthode pour saisir les informations
        zoo.displayInfo();   // Affichage des informations
    }

    // pour récupérer l'entrée utilisateur
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();  // Lecture du nom du zoo

        System.out.print("Entrez le nombre de cages : ");
        nbrCages = scanner.nextInt();  // pour lire le nombre de cages

        scanner.close();  // Fermeture du Scanner
    }

    // pour afficher les informations du zoo
    public void displayInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}
