import java.util.Scanner;


class Second {
    public static void main(String[] args) {
        // Main myCar = new Main();
        // myCar.fullThrottle();
        // myCar.speed(200);

        Person myPerson = new Person();
        myPerson.setName("John");
        System.out.println(myPerson.getName());

        // Calling the function from a previous file 
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Name:");

        String userName = myObj.nextLine();
        Main.getName(userName);
    

        // This is a constructor
        Main myCar = new Main(1969, "Corolla");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
        
    }
}
