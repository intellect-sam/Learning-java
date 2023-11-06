import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
    public static void main(String[] args) {
        // creating the linklist 
        LinkedList<String> friends = new LinkedList<>();

        // Adding new elements to the end of the linked list
        friends.add("John");
        friends.add("Samuel");
        friends.add("David");
        friends.add("Bob");


        System.out.println("The initail friend list is: " + friends);

        friends.addFirst("Joy");
        friends.addLast("Emmanuel");

        System.out.println(friends);

        List<String> familyFiends = new ArrayList<>();
        familyFiends.add("Doyin");
        familyFiends.add("kunle");

        friends.addAll(familyFiends);
        System.out.println(friends);
            
        System.out.println("=====================================");

        System.out.println(friends.getFirst());
        System.out.println(friends.getLast());
        System.out.println(friends.get(2));
             
        System.out.println("=====================================");

        friends.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("=====================================");

        for (String name : friends) {
            System.out.println(name);  
        }

    }
}
