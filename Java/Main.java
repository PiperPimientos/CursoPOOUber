class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.licence = "AMQ123";
        car.driver = "Andres Herrera";
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license =  "QWE576";
        car2.driver = "Andrea Herrera";
        car2.passengers = 3;
        car2.printDataCar();

    }
}