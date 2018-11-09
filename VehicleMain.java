// Create by : Peter zhu
// Create on : Nov
// This is main class of Vehicle class

public class VehicleMain {
	
	public static void main(String[]args) {
		
		Vehicle vehicle = new Vehicle(34554,4,50,120,"Black");
		Truck truckObject = new Truck(36363, 2, 50, 100, "blue", 200);
		Bike bikeObject = new Bike(000, 0, 12, 15, "red",7);
		
		vehicle.speak();
		System.out.println();
		truckObject.speak();
		
	}

}
