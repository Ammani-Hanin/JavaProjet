public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Méthode pour ajouter un animal au zoo
    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < nbrCages) {
            animals[index] = animal;
        } else {
            System.out.println("Index out of bounds!");
        }
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    // Override toString() pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
