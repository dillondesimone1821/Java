public class Engine {
    private String type;
    private double power;
    private double capacity;

    public Engine(String type,double power, double capacity){
        this.type=type;
        this.power=power;
        this.capacity=capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getcapacity() {
        return capacity;
    }

    public void setcapacity(double capacity) {
        this.capacity = capacity;
    }
    public void startEngine() {
		System.out.println("Starting the engine");
	}
	
	public void stopEngine() {
		System.out.println("Stoping the engine");
	}
    
  
}