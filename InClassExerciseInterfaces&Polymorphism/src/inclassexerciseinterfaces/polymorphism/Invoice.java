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
public class Invoice implements IPayable {
    
    private int quantity;
    private double pricePerItem ;
    private String invoiceNumber;
    private String invoiceDescription;
    
    private static int numInvoices = 0;
    private static double vatTotal = 0;

    public Invoice( String part, String description, int count,double price )
    {
        invoiceNumber = part;
        invoiceDescription = description;
        quantity = count;
        pricePerItem = price;
    } // end
    public static int getNumInvoices()
    {
        return numInvoices;
    }
    public static double getVatTotal()
    {
        return vatTotal;
    }
    public double getPaymentAmount()
    {
        double vat = 0.0;
        double net = 0.0;
        double total = 0.0;
        
        net = (quantity * pricePerItem);
        vat = (net * VAT_RATE);
        total = (net + vat);
        
        vatTotal = vatTotal + net;
        return total;
    }
    
    public void setQuantity(int quantity) {

            this.quantity = quantity;

    }

    public void setPricePerItem(double pricePerItem) {

            this.pricePerItem = pricePerItem;

    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    public int getQuantity() {

        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getInvoiceDescription() {
        return invoiceDescription;
    }


    @Override
    public String toString() {
        return "Invoice" + "\n" +
                "Quantity=" + quantity + "\n" +
                "PricePerItem=" + pricePerItem + "\n" +
                "PartNumber='" + invoiceNumber + '\'' + "\n" +
                "PartDescription='" + invoiceDescription + '\'' +"\n"+
                "Amount Due: €";
    }
    
    
    
}
