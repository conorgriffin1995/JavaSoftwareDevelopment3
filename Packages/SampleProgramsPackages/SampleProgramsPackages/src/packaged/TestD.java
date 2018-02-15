package packaged;

public class TestD // accessible outside of this package
{

    String defaultData = "default data";                        // default access control
    protected String protectedData = "protected data";          // protected access control
}

// D1 and D2 not accessible outside this package
class D1 extends TestD {
    // default and protected members inherited, same package

    String getData() {
        return defaultData + "&" + protectedData;
    }
}

class D2 {
// default and protected members accessible via instance, same package

    String getData() {
        D1 d = new D1();
        return d.defaultData + "&" + d.protectedData;
    }
}
