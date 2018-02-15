/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skeletoncode;
import java.text.NumberFormat;


/**
 *
 * @author pmage_000
 */
public class DVDCollection {
   private DVD[] collection;
   private int count;
   private double totalCost;


   public DVDCollection ()
   {
      collection = new DVD[4];
      count = 0;
      totalCost = 0.0;
   }

   //-----------------------------------------------------------------
   //  Adds a DVD to the collection, increasing the size of the
   //  collection if necessary.
   //-----------------------------------------------------------------
   public void addDVD (String title, String director, double cost)
   {
      collection[count] = new DVD (title, director, cost);
      totalCost += cost;
      count++;
   }

   //-----------------------------------------------------------------
   //  Returns a report describing the DVD collection.
   //-----------------------------------------------------------------
   @Override
  public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
      report += "My DVD Collection\n\n";

      report += "Number of DVDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost/count);

      report += "\n\nDVD List:\n\n";

      for (int cd = 0; cd < count; cd++)
         report += collection[cd].toString() + "\n";

      return report;
   }
}
