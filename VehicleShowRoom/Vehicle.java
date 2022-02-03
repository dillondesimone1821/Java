/* IS-A: relationship is inheritance. A car is a vehicle, a motorcyle is a vehicle, a truck is a vehicle
* HAS-A: An object of one class becomes an attribute inside another. A vehicle HAS-A engine
*/

//Abstract Classes cannot be instantiated - no point in repeating this properties, so they are instantiated in the subclasses: Car, Truck, Motorcycle
public abstract class Vehicle {
    protected String make;
    protected int year;
    protected int numWheels;
    protected int mileage;
    protected String plateNumber;
    protected Engine engine;

    public Vehicle(String make, int year, int numbWheels, int mileage, String plateNumber, Engine engine) {
        this.make = make;
        this.year = year;
        this.numWheels = numbWheels;
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract String generatePlate();
}
