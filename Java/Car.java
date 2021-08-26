class Car {
    private Integer id;
    private String license;
    private Account driver; 
    private Integer passengers;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;


    }

    void printDataCar() {
        if(passengers != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name);
        }
        
        
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passengers = passenger;
        }else{
            System.out.println("Necesitamos asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPassenger(){
        return passengers;
    }

    public void setPassengers(Integer passenger) {
        if(passenger == 4){
            this.passengers = passenger;

        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
 /** 
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    */
    
    
}