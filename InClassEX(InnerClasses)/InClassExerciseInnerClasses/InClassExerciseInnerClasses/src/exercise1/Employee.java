/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

public class Employee {
    private int eid;
    private String ename;
    private String esex;
    private double esalary;

    public Employee(int id, String name, String sex, double salary) {
        eid = id;
        ename = name;
        esex = sex;
        esalary = salary;
    }

    public void printInfo() {
        System.out.println("ID:" + eid + "\tName:" + ename + "\tSex:" + esex + "\tSalary:" 
                + esalary);
    }

    class Address {
        private String houseNo;
        private String city;
        private int postCode;
        private String country;

        public Address(String hNo, String ci, int pCode, String coun) {
            houseNo = hNo;
            city = ci;
            postCode = pCode;
            country = coun;
        }

        public void printAll() {
            printInfo();//call method from outer class
            System.out.println("Address:");
            System.out.println("\tHouse No:" + houseNo);
            System.out.println("\tCity:" + city);
            System.out.println("\tPost code:" + postCode);
            System.out.println("\tCountry:" + country);
        }
    }
}
