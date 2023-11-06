import java.util.HashSet;
import java.util.Iterator;


public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(2);

        // for (String i : cars) {
        //     System.out.println(i);
        // }

        Iterator<Integer> it = numbers.iterator();
        System.out.println(it.next());

        
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " Was found in the set ");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }

    }
}
