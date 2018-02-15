package p2;

import p1.*;

public class TestMammal {

    public static void main(String[] args) {

        Mammal whale = new Mammal("Free Willy");
        Cat b = new Cat("Brownie");
        Dog m = new Dog("Minerva");

        whale.print();
        b.print();
        m.print();
    }
}
