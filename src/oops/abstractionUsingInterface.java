package oops;

interface Parent1 {
    void eat();
}
interface Parent2 {
    void speak();
}
class Child implements Parent1, Parent2 {
    public void eat() {
        System.out.println("child eats with hands");
    }
    public void speak() {
        System.out.println("child speaks hindi");
    }
}

public class abstractionUsingInterface {
    public static void main(String[] args) {
        Child c = new Child();
        c.eat();
        c.speak();
    }
}
