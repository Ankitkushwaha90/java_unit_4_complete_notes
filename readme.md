![Collection hierarchy](./Java.util.Collection_hierarchy.svg)
### 1. Collection in Java
- The Collection interface is the root of the collection hierarchy. It defines operations that are common to all collections.

```java
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Orange");
        System.out.println(collection);
    }
}
```

### 2. List Interface and ArrayList
A List is an ordered collection that can contain duplicate elements. ArrayList is a resizable array implementation of the List interface.

```java
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list);
    }
}
```
### 3. LinkedList
- LinkedList is a doubly-linked list implementation of the List and Deque interfaces.

```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list);
    }
}
```
### 4. Vector
- Vector is a synchronized, resizable array implementation of the List interface.

```java
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println(vector);
    }
}
```
### 5. Stack
- Stack is a subclass of Vector that implements a standard last-in, first-out stack.

```java
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
```
### 6. Queue Interface and PriorityQueue
- A Queue is a collection used to hold multiple elements prior to processing. PriorityQueue is an implementation of the Queue interface.

```java
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
```
### 7. Set Interface and HashSet
A Set is a collection that cannot contain duplicate elements. HashSet is a hash table-backed implementation of the Set interface.

```java
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println(set);
    }
}
```
### 8. LinkedHashSet
- LinkedHashSet maintains a linked list of the entries in the set, in the order in which they were inserted.

```java
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println(set);
    }
}
```
### 9. SortedSet Interface and TreeSet
- A SortedSet is a Set that maintains its elements in ascending order. TreeSet is a NavigableSet implementation based on a TreeMap.

```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println(set);
    }
}
```
### 10. Map Interface and HashMap
A Map is an object that maps keys to values. HashMap is a hash table-based implementation of the Map interface.

```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println(map);
    }
}
```
### 11. LinkedHashMap
- LinkedHashMap maintains a doubly-linked list running through all its entries to maintain the insertion order.

```java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println(map);
    }
}
```
### 12. TreeMap
TreeMap is a Red-Black tree-based implementation of the Map interface. It sorts its entries by their keys.

```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println(map);
    }
}
```
### 13. Hashtable
- Hashtable is a synchronized implementation of the Map interface.

```java
import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println(map);
    }
}
```
### 14. Sorting with Comparable Interface
The Comparable interface imposes a total ordering on the objects of each class that implements it.

```java
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
```
### 15. Sorting with Comparator Interface
- The Comparator interface defines a compare method to impose a total ordering on some collection of objects.

```java
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
```

### 16. Properties Class in Java
- The Properties class is a subclass of Hashtable and represents a persistent set of properties.

```java
import java.util.*;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username", "admin");
        properties.setProperty("password", "1234");
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
    }
}
```
These examples cover the basics of the Java Collections Framework. Each class and interface offers a variety of methods and capabilities that can be explored further as needed.
