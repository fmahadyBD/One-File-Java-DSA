
import java.util.*;

public class hash_Map {
    public static void main(String[] args) throws Exception {
        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mahady Hasan Fahim", 1);
        map.put("Tanvir Tanim", 2);
        map.put("Gautom Kar", 3);
        map.put("Shawon", 4);
        map.put("Shawon", 5); /*
                               * if the key(frist ) are same in the two
                               * objects then it will print last one
                               */

        System.out.println(map);

        // searching oparations
        if (map.containsKey("Shawon")) {
            System.out.println("Yes it contains");
        } else {
            System.out.println("There is no element in here");
        }
        System.out.println(map.get("Shawon"));// if it is here then print it's value or print null;
        // Iteration
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(" " + e.getValue());
            System.out.println();
        }
        System.out.println();

        // Iteration 2
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();
        // remove
        map.remove("Mahady Hasan Fahim ");
        System.out.println(map);

    }
}