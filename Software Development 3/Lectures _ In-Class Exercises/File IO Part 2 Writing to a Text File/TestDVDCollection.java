/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skeletoncode;

import java.util.Scanner;


/**
 *
 * @author pmage_000
 */
public class TestDVDCollection {
    public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      DVDCollection films = new DVDCollection();

      films.addDVD ("The Walk", "Robert Zemeckis", 25.95);
      films.addDVD ("Trainwreck", "Judd Apatow", 24.95);
      films.addDVD ("No Escape", "John Erick Dowdle", 27.95);
      films.addDVD ("Paper Towns", "Jake Schreier", 33.90);

      System.out.println(films);
   }
   
}
