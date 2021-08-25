var car = new Car("AW456", new Account("Andres Herrera", "QWE234"));
car.passenger = 4;
car.printDataCar();

var uberX = new Car("AW456", 
new Account("Andrea Ferran", "QWE234"), 
"Chevrolet", "Spark");
uberX.passenger = 4;
uberX.printDataCar();

var paypal = new Paypal("SHAKD", "asde@gmail.com");
paypal.printDataPayment();

var Acc1 = new Account("Acc1", "30333444");
Acc1.SetID("1");

var driver1 = new Driver(Acc1, "acc1@gmail.com", "pswd1")
driver1.printAllDriverData();

var Acc2 = new Account("Acc2", "3033355");
Acc2.SetID("2");

var user1 = new User(Acc2, "acc2@gmail.com", "pswd2");
user1.printAllUserData();
