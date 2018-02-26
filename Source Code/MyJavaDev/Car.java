public class Car {
	
	private String name;
	private double topSpeed;
	
	public Car() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTopSpeed(double speedMPH) {
		topSpeed = speedMPH;
	}
	
	public double getTopSpeedMPH() {
		return topSpeed;
	}
	
	public double getTopSpeedKMH() {
		return topSpeed * 1.609344;
	}
}