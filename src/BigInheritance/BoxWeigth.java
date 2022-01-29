package BigInheritance;

public class BoxWeigth extends Box {
    
    double weigth;
    
    // Constructor used to create a copy of object
    BoxWeigth(BoxWeigth ob){
        super(ob);
        weigth = ob.weigth;
    }
    // Constructor used when we have all parameters
    BoxWeigth(double w, double h, double d, double m){
        super(w,h,d);
        weigth = m;
    }
    // Constructor used when we don't have parameters
    BoxWeigth(){
        super();
        weigth = -1;
    }
    // Constructor used when we create a Cube
    BoxWeigth(double len, double m){
        super(len);
        weigth = m;
    }
}
