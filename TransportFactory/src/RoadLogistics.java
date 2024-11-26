// Concrete Creator 1: Road Logistics
public class RoadLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
