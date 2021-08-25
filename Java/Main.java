class main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Car....");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123", null, null));
        car.passengers = 4;
        car.printDataCar();

        System.out.println("Uberx....");
        UberX uberx = new UberX("MKL185", new Account("Maria Loyola", 
        "JKL12345", null, null), "Toyota", "Corolla");
       

    }
}