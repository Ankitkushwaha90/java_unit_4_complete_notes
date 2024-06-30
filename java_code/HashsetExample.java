import java.util.*;
public class HashsetExample {
    public static void main(String[] args){
        Set<String> name_data = new HashSet<>();
        name_data.add("hey");
        name_data.add("welcome");
        name_data.add("hii");

        name_data.remove("hey");

        System.out.println(name_data);
    }
}
