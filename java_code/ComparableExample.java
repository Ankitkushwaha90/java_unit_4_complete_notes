import java.util.*;

class Fruit implements Comparable<Fruit> {
    String name;
    int quantity;

    Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Fruit other) {
        return this.quantity - other.quantity;
    }

    @Override
    public String toString() {
        return name + ": " + quantity;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("Apple", 10));
        list.add(new Fruit("Banana", 20));
        list.add(new Fruit("Orange", 5));
        Collections.sort(list);
        System.out.println(list);
    }
}
