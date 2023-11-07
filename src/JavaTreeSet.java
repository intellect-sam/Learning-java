import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());

        fruits.add("Pineapple");
        fruits.add("Oranges");
        fruits.add("Banana");
        
        System.out.println(fruits);



        boolean isFruits = fruits.size() > 5;

        if (isFruits) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }   
}
