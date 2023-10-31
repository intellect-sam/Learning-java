import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCity = new HashMap<String, String>();

        capitalCity.put("England", "London");
        capitalCity.put("Germany", "Berlin");
        capitalCity.put("Norway", "Oslo");
        capitalCity.put("USA", "Washington DC");
        capitalCity.put("Nigeria", "Abuja");

        System.out.println(capitalCity.size());

        // for each capital city
        for (String capitalCityLoop : capitalCity.keySet()) {
            System.out.println(capitalCityLoop);
        }

    }
}
