public abstract class Logistics {
    // Factory Method
    public abstract Transport createTransport();
    public void planDelivery()
    {
        // Use the factory method
        Transport transport = createTransport();
        transport.deliver();
    }
}
