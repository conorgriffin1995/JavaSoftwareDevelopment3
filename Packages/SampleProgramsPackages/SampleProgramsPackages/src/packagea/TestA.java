package packagea;

import packageb.*;

public class TestA {

    public static void main(String args[]) {

        TestB b = new TestB("b's data");
        System.out.println(b.data);

        System.out.println(b.getData());

    }

}
