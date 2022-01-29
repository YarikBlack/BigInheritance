package OverLoad;

public class B extends A{
    int k;

    B(int a, int b, int c){
        super(a, b);
        k = c;
    }

    //Reloaded method show()
    void show(String msg){
        System.out.println(msg + k);
    }
}
