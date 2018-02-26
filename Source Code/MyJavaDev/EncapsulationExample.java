public class EncapsulationExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.setName("Porsche Cayenne 4.8-litre V8");
		car.setTopSpeed(173.0d);
		System.out.println(car.getName() + " top speed in MPH is " + car.getTopSpeedMPH());
		System.out.println(car.getName() + " top speed in KMH is " + car.getTopSpeedKMH());
	}
}