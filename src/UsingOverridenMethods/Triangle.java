package UsingOverridenMethods;

public class Triangle extends Figure {
    
    Triangle(double a, double b){
        super(a,b);
    }

    // overriden method area() for Triangle
    double area(){
        System.out.println("In Triangle class!");
        return dim1 * dim2 / 2;
    }
}
