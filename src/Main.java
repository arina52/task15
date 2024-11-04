import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addElephant(new Elefant("Ella", 10, 2, 3));
        zoo.addElephant(new Elefant("Jack", 7, 3, 2));
        zoo.addElephant(new Elefant("Dumbo", 5, 6, 7));
        zoo.addElephant(new Elefant("Jack", 3, 4, 5));

        zoo.addTiger(new Tigru("Vasile", 5, 5, 30));
        zoo.addTiger(new Tigru("Vasile", 5, 5, 30));
        zoo.addTiger(new Tigru("Angela", 2, 4, 25));

        System.out.println("Elephants: " + zoo.isElephantsEmpty());
        System.out.println("Tigers: " + zoo.isTigersEmpty());

        Animal elephant1 = new Elefant("Ella", 10, 2, 3);
        Animal tiger1 = new Tigru("Vasile", 5, 5, 30);
        System.out.println("Zoo contains elephant1: " + zoo.containsElephants(elephant1));
        System.out.println("Zoo contains tiger1: " + zoo.containsTigers(tiger1));

        zoo.sortElephants();
        zoo.sortTigers();

        System.out.println("Sorted elephants: ");
        for (Animal elephant : zoo.getElephants()) {
            System.out.println(elephant);
        }

        System.out.println("Sorted tigers: ");
        for (Animal tiger : zoo.getTigers()) {
            System.out.println(tiger);
        }

        Animal newElephant = new Animal("Babar", 2);
        zoo.setElephant(newElephant, 0);
        System.out.println("Updated Elephants list: ");
        for (Animal elephant : zoo.getElephants()) {
            System.out.println(elephant);
        }

        Animal newTiger = new Animal("Rajah", 7);
        zoo.setTiger(newTiger, 1);
        System.out.println("Updated Tigers list: ");
        for (Animal tiger : zoo.getTigers()) {
            System.out.println(tiger);
        }

        zoo.removeElephant(elephant1);
        zoo.removeTiger(tiger1);
        System.out.println("Elephants after removal: ");
        for (Animal elephant : zoo.getElephants()) {
            System.out.println(elephant);
        }

        System.out.println("Tigers after removal: ");
        for (Animal tiger : zoo.getTigers()) {
            System.out.println(tiger);
        }

        List<Animal> elephantList = new ArrayList<>();
        elephantList.add(newElephant);
        elephantList.add(elephant1);
        System.out.println("Elephants list equals provided list: " + zoo.equalsElephants(elephantList));

        zoo.clearElephants();
        zoo.clearTigers();
        System.out.println("Is Elephants list empty? " + zoo.isElephantsEmpty());
        System.out.println("Is Tigers list empty? " + zoo.isTigersEmpty());
    }
}
