package OverRide;

public class B extends A {
    int k;

    B(int a, int b, int c){
        super(a, b);
        k = c;
    }
    // Output value of k
    // with overriden method show() in class A
    void show(){
        super.show();
        System.out.println("k: " + k);
    }
}
