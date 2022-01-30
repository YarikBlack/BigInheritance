package UsingOverridenMethods;

public class Rectangle extends Figure{
    
    Rectangle(double a, double b){
        super(a, b);
    }

    // overriden method area() for rectangle
    double area(){
        System.out.println("Rectangle class");
        return dim1 * dim2;
    }
}
