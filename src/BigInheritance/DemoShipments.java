package BigInheritance;

public class DemoShipments {
    public static void main(String[] args){
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(5, 5, 10, 16, 50.6);
        double vol;

        // Output of shipment1
        vol = shipment1.volume();
        System.out.println("Area - shipment1: " + vol);
        System.out.println("Weigth - shipment1: " + shipment1.weigth);
        System.out.println("Delivery cost: $" + shipment1.cost);
        System.out.println();

        // Output of shipment2
        vol = shipment2.volume();
        System.out.println("Area - shipment2: " + vol);
        System.out.println("Weigth - shipment2: " + shipment2.weigth);
        System.out.println("Delivert cost: $" + shipment2.cost);
        System.out.println();
    }
}
