package OverLoad;

public class OverLoad {
    public static void main(String[] args){
        B subOb = new B (1, 2, 3);

        subOb.show(); // call a show() method from A class
        subOb.show("This is B class: "); // call s show() method from B class
    }
}
