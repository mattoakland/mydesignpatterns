package dp.Factory;

public abstract class VehicleFactory {
    // Factory Method
    public abstract Vehicle createVehicle(String type);

    public Vehicle orderVehicle(String type) {
        Vehicle vehicle = createVehicle(type);
        vehicle.design();
        vehicle.manufacture();
        return vehicle;
    }
}
