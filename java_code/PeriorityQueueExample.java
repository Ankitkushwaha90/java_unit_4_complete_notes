import java.util.*;

public class PeriorityQueueExample {
    public static void main(String[] args){
        Queue<String> queuedata = new PriorityQueue<>();
        queuedata.add("data_");
        queuedata.add("welcome");
        queuedata.add("hello");

        queuedata.poll();

        System.out.println(queuedata);

    }
}
