
public class Car extends Vehicle {
	
	private String color;
	
	public Car(String make, int year, int numWheels, int mileage, String plateNumber, String color, Engine engine) {
		super(make, year, numWheels, mileage, plateNumber, engine);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public double getMaxSpeed() {
		return numWheels * 40;
	}
	//Anything that starts with @ is annotation
	@Override
	public String generatePlate() {
		return this.plateNumber + "06516" + "C";
	}


}
