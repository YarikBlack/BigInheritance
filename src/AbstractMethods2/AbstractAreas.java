package AbstractMethods2;

public class AbstractAreas {
    public static void main(String[] args){
        // Figure f = new Figure(10, 10); // now isn't correct
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(5, 20);
        Figure figref; // correct, but object not create

        figref = r;
        System.out.println("Area equals: " + figref.area());

        figref = t;
        System.out.println("Area equals: " + figref.area());
    
    }
}
