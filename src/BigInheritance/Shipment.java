package BigInheritance;

public class Shipment extends BoxWeigth{
    
    double cost;

    // Constructor used when we create a copy of object
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    // Constructor used when we have all parameters
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }
    // Constructor used when we don't have parameters
    Shipment(){
        super();
        cost = -1;
    }
    // Constuctor used when we create a Cube
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
