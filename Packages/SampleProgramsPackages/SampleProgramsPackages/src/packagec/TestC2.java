package packagec;

import packaged.*;

class TestC2 extends TestD // protected members of TestD are accessible in TestC2
{

    // inherits protectedData, defaultData not inherited

    String getProtectedData() {
        return protectedData;
    }

    public static void main(String args[]) {
        TestC2 c = new TestC2();
        System.out.println(c.getProtectedData());
    }
}
