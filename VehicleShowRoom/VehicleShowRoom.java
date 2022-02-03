/*
* Sell Car, Truck, or Motorcycle
* I sell a vehicle - Use abstract classes, vehicle is abstract (super) and the instantiated class are the sub classes
*/
public class VehicleShowRoom {
    public static void main(String[] args) {

        Engine carEngine = new Engine("Petrol", 2.2, 500.9);

        Car honda = new Car("Honda", 2013, 4, 13, "01312", "blue", carEngine);
        {
            System.out.println(honda.getMake());

            System.out.println(honda.generatePlate());

            // HAS-A
            System.out.println(honda.getEngine().getType());
        }

    }
}