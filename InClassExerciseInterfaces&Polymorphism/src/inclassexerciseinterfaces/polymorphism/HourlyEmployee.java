/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inclassexerciseinterfaces.polymorphism;

/**
 *
 * @author x00111602
 */
public class HourlyEmployee extends Employee {
    
    private double hours;
    private double rate;
    
    private static double totalTax = 0.0;

    public HourlyEmployee(String fName, String lname, String rsiNumber, double hours, double rate) {
        super(fName, lname, rsiNumber);
        this.hours = hours;
        this.rate = rate;
    }
    
    public static double getTotalTax(){
        return totalTax;
    }
    
    public double getPaymentAmount(){
        double tax = 0.0;
        double gross = 0.0;
        double net = 0.0;
        
        gross = rate*hours;
        if(gross > RANGE_2)
        {
            tax = (RANGE_2 * LOW_TAX_RATE) + ((gross - RANGE_2) * HIGH_TAX_RATE);
        }
        else if((gross > RANGE_1) && (gross <= RANGE_2))
        {
            tax = (gross * LOW_TAX_RATE);
        }
        else
        {
            tax = 0;
        }
        
        totalTax += tax;
        
        net = gross - tax;
        return net;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }



    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +getfName() + " " +
                "" +getLname()+" is a salaried employee" + "\n" +
                "WeeklySalary: €";
    }
    
}
