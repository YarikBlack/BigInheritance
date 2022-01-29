package Dispatch;

public class Dispatch {
    public static void main(String[] args){
        A a = new A(); // object of A class
        B b = new B(); // Object of B class
        C c = new C(); // Object of C class

        A r; // recive link at object A

        r = a;          // var "r" link at object A
        r.callme();     // Call method callme(), in class A

        r = b;          // var "r" link at object B
        r.callme();     // Call method callme(), in class B

        r = c;          // var "r" link at object C
        r.callme();     // Call method callme(), in class C
    }
}
