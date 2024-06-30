import java.util.*;

public class HashMapExample {
    public static void main(String[] args){
        Map<String, Integer> map_data = new HashMap<>();
        map_data.put("Apple", 1);
        map_data.put("Banana", 2);
        map_data.put("Orange", 3);
        map_data.put("pine_apple", 4);
        map_data.remove("Apple");

        System.out.println(map_data);
    }
}
