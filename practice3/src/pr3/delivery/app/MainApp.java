package pr3.delivery.app;

import pr3.delivery.model.*;
import pr3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Engine engine1 = new Engine("Petrol", 150);
        Engine engine2 = new Engine("Diesel", 400);

        Vehicle car = new Car("Toyota Camry", 100, engine1, 5);
        Vehicle truck = new Truck("Volvo Truck", 200, engine2, 10);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);

        DeliveryService service = new DeliveryService();

        System.out.println("    VEHICLE INFO    ");
        service.getAllVehicle(vehicles);

        System.out.println("    DELIVERY COSTS    "); 
        service.calculateAllDeliveries(vehicles);

        System.out.println("    TOTAL COST    ");
        System.out.println(service.calculateTotalCost(vehicles));
    }
}