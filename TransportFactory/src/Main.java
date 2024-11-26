//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Choose logistics type dynamically
        Logistics logistics;
        //Example 1: Road logistics
        logistics = new RoadLogistics();
        logistics.planDelivery(); //// Output: Delivering goods by road in a truck.
        logistics = new SeaLogistics();
        logistics.planDelivery();

    }
}