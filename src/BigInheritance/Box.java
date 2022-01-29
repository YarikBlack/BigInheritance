package BigInheritance;

public class Box {
    
    private double width;
    private double heigth;
    private double depth;
    
    // Constructor used to create a copy of object
    Box(Box ob){
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }
    // Constructor used when we have all parameters
    Box(double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }
    // Constructor used when we don't have parameters
    Box(){
        width = -1;
        heigth = -1;
        depth = -1;
    }
    // Constructor used when we create a Cube
    Box(double len){
        width = heigth = depth = len;
    }
    
    // Method used to return Area of object
    double volume(){
        return width * depth * heigth;
    }
}
