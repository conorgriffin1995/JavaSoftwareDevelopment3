package packagec;

import packaged.*;

public class TestC1 {

    public static void main(String args[]) {
        TestD d = new TestD();

        System.out.println(d.defaultData); // syntax error, not public in TestD

        System.out.println(d.protectedData); // syntax error, not same package or subclass
    }
}
