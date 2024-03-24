package dp.Factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        Vehicle car = factory.orderVehicle("car");
        Vehicle bike = factory.orderVehicle("bike");
    }

}
