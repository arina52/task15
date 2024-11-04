import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class Zoo {
    private List<Animal> elephants = new ArrayList<>();
    private List<Animal> tigers = new ArrayList<>();
    public List<Animal> getElephants() {
        return elephants;
    }
    public List<Animal> getTigers() {
        return tigers;
    }
    public void addElephant(Animal animal) {
        elephants.add(animal);
    }
    public void addTiger(Animal animal) {
        tigers.add(animal);
    }
    public void removeElephant(Animal animal) {
        elephants.remove(animal);
    }
    public void removeTiger(Animal animal) {
        tigers.remove(animal);
    }
    public void setElephant(Animal animal, int index) {
        elephants.set(index, animal);
    }
    public void setTiger(Animal animal, int index) {
        tigers.set(index, animal);
    }
    public boolean isElephantsEmpty() {
        return elephants.isEmpty();
    }
    public boolean isTigersEmpty() {
        return tigers.isEmpty();
    }
    public void clearElephants() {
        elephants.clear();
    }
    public void clearTigers() {
        tigers.clear();
    }
    public boolean containsElephants(Animal animal) {
        return elephants.contains(animal);
    }
    public boolean containsTigers(Animal animal) {
        return tigers.contains(animal);
    }
    public boolean equalsElephants(List<Animal> animal) {
        return elephants.equals(animal);
    }
    public void sortElephants() {
        elephants.sort(Comparator.comparing(Animal::getName));
    }
    public void sortTigers() {
        tigers.sort(Comparator.comparing(Animal::getName));
    }
}
