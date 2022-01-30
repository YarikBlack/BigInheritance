package AbstractMethods2;

public class Rectangle  extends Figure{

    Rectangle (double a, double b){
        super(a, b);
    }
    // overriden method area() fro Rectangle
     double area(){
        System.out.println("In class Rectangle!");
        return dim1 * dim2;
    }
}
