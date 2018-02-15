package example1;

import java.io.*;

public class Car implements Serializable {

    private String registration;
    private String make;
    private String color;

    public Car(String registration, String make, String color) {

        this.registration = registration;
        this.make = make;
        this.color = color;
    }

    @Override
    public String toString() {
        return ("Car registration: " + registration + " make: " + make
                + " color: " + color);
    }
}


