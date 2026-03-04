package pr3.delivery.service;

import java.util.List;

import pr3.delivery.model.Vehicle;

public class DeliveryService {
	
	public void getAllVehicle( List<Vehicle> vehicles) {
		for (Vehicle v : vehicles) {
			v.getVehicleInfo();
			System.out.println("-----------");
		}
	}
	
	public void calculateAllDeliveries(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println("Delivery cost: " + v.calculateDeliveryCost());
        }
    }
	
	public double calculateTotalCost(List<Vehicle> vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateDeliveryCost();
        }
        return total;
    }
}





