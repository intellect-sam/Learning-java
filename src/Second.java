class Second {
    public static void main(String[] args) {
        // Main myCar = new Main();
        // myCar.fullThrottle();
        // myCar.speed(200);

        // Calling the function from a previous file 
        Main.getName("Samuel");

        // This is a constructor
        Main myCar = new Main(1969, "Corolla");
        System.out.println(myCar.modelYear + " " + myCar.modelName );
    }

    
}
