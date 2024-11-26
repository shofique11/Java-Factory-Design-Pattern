public class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory factory)
    {
        this.vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
