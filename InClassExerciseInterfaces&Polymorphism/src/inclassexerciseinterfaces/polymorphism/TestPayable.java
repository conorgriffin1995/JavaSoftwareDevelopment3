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
public class TestPayable {
    
    public static void main(String args[]) {
        IPayable[] payableObjects = new IPayable[5];

        // populate array with objects that implementIPayable
        payableObjects[0]=new Invoice("01234", "Printer", 2, 375.00);
        payableObjects[1]=new Invoice("56789", "Ink Cartridges", 4, 79.95);
        payableObjects[2]=new HourlyEmployee("John", "Smith","6578431N", 60,30);
        payableObjects[3]=new HourlyEmployee("Lisa", "Kelly","9865431M", 20,12);
        payableObjects[4]=new HourlyEmployee("Mary", "Reilly","9875431M", 20,8);

        for(int i=0;i<payableObjects.length;i++)
        {
           System.out.println(payableObjects[i] +" "+payableObjects[i].getPaymentAmount()+"\n");
        }

        System.out.println("The total number of employees processed is: "+Employee.getNumEmps());
        System.out.println("The total number of invoices processed is: "+Invoice.getNumInvoices());
        System.out.println("The total amount of VAT paid is: "+Invoice.getVatTotal());
        System.out.println("The total amount of tax paid is: "+HourlyEmployee.getTotalTax());
    }
    
}
