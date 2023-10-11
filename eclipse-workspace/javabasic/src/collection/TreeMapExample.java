package collection;
import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");
        map.put(103, "RRR");
         map.put(104, null);
         map.put(null, null);


        // Iterate over the TreeMap as before
        for (HashMap.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}