package AbstractMethods;

abstract class A {

    abstract void callme();

    // Abstract classes also can have concrete methods
    void callmeto(){
        System.out.println("This is concrete method!");
    }
}
