package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        list1.add(10);

        Iterator<Integer> iterator = list1.iterator();

        while (iterator.hasNext()){
            Integer elm = iterator.next();

            System.out.println(elm);
        }
    }
}
