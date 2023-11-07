import java.util.LinkedHashMap;

public class JavaLinkedHashMap {
    public static void main(String[] args) {
        // creating the Linked has
        LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>();

        // adding into the map just created 
        wordNumberMapping.put("one", 1);
        wordNumberMapping.put("two", 2);
        wordNumberMapping.put("three", 3);
        wordNumberMapping.put("four", 4);

        wordNumberMapping.putIfAbsent("five", 5);

        Integer id = 4;
        if (wordNumberMapping.containsValue(id)) {
            System.out.println("Found " + id + " : " + wordNumberMapping);
        } else {
            System.out.println("Not Found");
        }

        wordNumberMapping.forEach((user, city) -> {
             System.out.println(user + " => " + city);
        });
        // System.out.println(wordNumberMapping);
    }
}
