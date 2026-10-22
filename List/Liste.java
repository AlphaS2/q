package List;

import java.util.*;

public class Liste {

    static void swap(List a, int i, int j) {
        Object tmp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, tmp);
    }

    public static void main(String[] args) {
        List l = new LinkedList();
        l.add(42);
        l.add("toto");
        l.add('C');

        for (int i = 0; i < l.size(); i++) {
            System.out.println("L'element a l'index " + i + " = " + l.get(i));
        }

        swap(l, 1, 2);

        System.out.println("\n \tParcours avec un itérateur ");
        System.out.println("-----------------------------------");

        ListIterator li = l.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }
}
