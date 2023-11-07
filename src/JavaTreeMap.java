import java.util.Scanner;
import java.util.TreeMap;

public class JavaTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> dateOfBirth = new TreeMap<>();

        dateOfBirth.put(1994, "Samuel");
        dateOfBirth.put(1995, "Emmanuel");
        dateOfBirth.put(1996, "Abdulateef");
        dateOfBirth.put(2000, "Sunmibayo");

        System.out.println(dateOfBirth.size());

        String name = "Samuel";
        String isName = dateOfBirth.remove(name);

        if (isName != null) {
            System.out.println("Removed ( " + name +  " ) from " + dateOfBirth);
        } else {
            System.out.println(name);
        }

    }
}
