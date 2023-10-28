public class Main {

    int modelYear;
    String modelName;

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    // this is a funtion that was called in anothe function
    public static void getName(String name) {
        System.out.println("My name is " + name);
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}