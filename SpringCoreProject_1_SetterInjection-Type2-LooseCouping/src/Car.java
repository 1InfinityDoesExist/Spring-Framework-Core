
public class Car implements Vehicle {

	private String fuelType;
	private String maxSpeed;

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("FuelType : " + fuelType);
		System.out.println("MaxSpeed : " + maxSpeed);

		System.out.println("Car is started happy journey.....");
	}
}
