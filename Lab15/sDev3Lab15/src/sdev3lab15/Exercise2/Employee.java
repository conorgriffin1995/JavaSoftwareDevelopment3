package sdev3lab15.Exercise2;
import java.io.*;
import java.util.*;

//Conor Griffin
//Lab 15
//Exercise2

public class Employee {
    
private String firstName;
    private String lastName;
    private int age;

    public Employee()
    {
        firstName="";
        lastName="";
        age=0;
    }
    
    public Employee(String l, String f, int a)
    {
        firstName = f;
        lastName = l;
        age=a;
        
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString()
    {
        return "First Name:  "+firstName +"\t" +"Last Name: "+lastName+"\t"+"Age:"+age;
    }

}
