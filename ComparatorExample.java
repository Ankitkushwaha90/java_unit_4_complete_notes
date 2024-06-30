import java.util.*;

class Fruit {
    String name;
    int quantity;

    Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + quantity;
    }
}

class NameComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit f1, Fruit f2) {
        return f1.name.compareTo(f2.name);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("Apple", 10));
        list.add(new Fruit("Banana", 20));
        list.add(new Fruit("Orange", 5));
        Collections.sort(list, new NameComparator());
        System.out.println(list);
    }
}