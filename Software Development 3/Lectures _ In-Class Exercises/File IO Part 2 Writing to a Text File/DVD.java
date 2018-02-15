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
public class DVD {
   private String title, director;
   private double cost;

   public DVD()
   {
       this.title = "";
       this.director = "";
       this.cost = 0.0;
   }

   public DVD (String name, String singer, double price)
   {
      this.title = name;
      this.director = singer;
      this.cost = price;
   }

   public String getName()
   {
       return title;
   }
   public String getDirector()
   {
       return director;
   }
   public double getCost()
   {
       return cost;
   }
   

   @Override
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      description = "Cost: "+fmt.format(getCost()) +"\n"+  "Title: "+getName() +"\n"
              +"Director: "+ getDirector();
      description+="\n~~~~~~~~~~~~~~~~~~~~~~~~~~";

      return description;
   }
    
}
