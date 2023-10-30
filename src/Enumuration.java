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
    }
}

