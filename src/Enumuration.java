import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enumuration {
    public static void main(String[] args) {
        Level myVal = Level.MEDIUM;

        switch (myVal) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;  
        }

        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

      
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting: " + myDateObj);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatter);
        System.out.println("After formatting: " + formattedDate);

        // Scanner myObj = new Scanner(System.in);
        // System.out.println("Enter username:");

        // String username = myObj.nextLine();
        // System.out.println("Username is: " + username);
    }
}

