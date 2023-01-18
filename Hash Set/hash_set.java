import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(6);
        set.add(3);/*
                    * there is two more set of the same nubler. it will
                    * print only one time of a number;
                    * 
                    */
        // print all
        System.out.println(set);
        // print of size
        System.out.println("The size of the set is:" + set.size());

        // search
        if (set.contains(1)) {
            System.out.println("There is present");
        }
        if (!set.contains(100)) {
            System.out.println("Absent");/*
                                          * ot condition tre the in execute...
                                          * ! make the contion ture then the block execute
                                          */
        }

        // delete
        set.remove(1);

        set.add(0);

        // iterator has no order
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
        // cheeck the empty

        if (!set.isEmpty()) {
            System.out.println("This is not empty set");
        }

    }
}
