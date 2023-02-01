import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(9);
        li.add(3);
        li.add(5);
        System.out.println(li);

        System.out.println(li.get(0));// find spacific position
        li.add(0, 0);// insert between
        System.out.println(li);
        li.set(4, 4);// replace the element
        System.out.println(li);

        // remove
        li.remove(0);
        System.out.println(li);

        System.out.println(li.size());

        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");

        }
        System.out.println();

        // sort
        Collections.sort(li);
        
        //reverse
        Collections.reverse(li);
        System.out.println(li);

    }

}
