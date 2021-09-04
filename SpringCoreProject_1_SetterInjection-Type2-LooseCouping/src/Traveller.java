
public class Traveller implements Journey {

	private Vehicle vehicle;

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void startJourney() {
		System.out.println("Journey is started.....");
		vehicle.move();
	}

}
