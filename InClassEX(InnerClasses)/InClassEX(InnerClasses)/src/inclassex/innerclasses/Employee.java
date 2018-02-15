/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inclassex.innerclasses;

/**
 *
 * @author x00111602
 */
public class Employee {

    private String eid;
    private String eName;
    private String eGender;
    private double eSalary;

    public Employee(String eid, String eName, String eGender, double eSalary) {
        this.eid = eid;
        this.eName = eName;
        this.eGender = eGender;
        this.eSalary = eSalary;
    }

    public void print(){
        
        System.out.println("ID: "+eid+ "\tName: "+eName+ "\teGender: "+eGender+ "\teSalary: "+eSalary);
        
    }
    
    class Address{
        
        private String houseNo;
        private String city;
        private int postcode;
        private String country;

        public Address(String houseNo, String city, int postcode, String country) {
            this.houseNo = houseNo;
            this.city = city;
            this.postcode = postcode;
            this.country = country;
        }
        
        public void printall(){
            
            print();
            System.out.println("Address");
            System.out.println("\tHouse No: "+houseNo);
            System.out.println("\tCity: "+city);
            System.out.println("\tPost Code: "+postcode);
            System.out.println("\tCountry: "+country);
            
        }
        
    }
    
    
}
