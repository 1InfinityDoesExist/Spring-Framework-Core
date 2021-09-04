
public class MoterByke implements Vehicle {
	private String maxSpeed;

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("FuelType : Petrol");
		System.out.println("MaxSpeed : " + maxSpeed);

		System.out.println("MoterByke is started happy journey.....");
	}
}
