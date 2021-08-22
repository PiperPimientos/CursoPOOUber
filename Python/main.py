from car import Car

if __name__=="__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "AMQ123"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE576"
    car2.driver = "Matha"
    print(vars(car2))