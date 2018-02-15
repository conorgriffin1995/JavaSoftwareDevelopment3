package packageb;

public class TestB {

    String data; // not accessible outside of this package
    // constructors and method are public

    public TestB(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}
