import java.util.*;

public class HashTableExample {
    public static void main(String[] args){
        Map<String, Integer> map = new Hashtable<>();
        map.put("ankit",  1);
        map.put("hacker",2);
        map.put("black_hat_hacker", 3);

        map.remove("ankit");
        map.put("Anonymous", 1);
        System.out.println(map);
    }
}
