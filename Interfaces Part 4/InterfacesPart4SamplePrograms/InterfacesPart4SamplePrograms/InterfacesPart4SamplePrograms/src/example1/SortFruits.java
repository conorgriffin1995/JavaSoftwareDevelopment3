package example1;

import java.util.Arrays;
//http://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
//http://www.dotnetperls.com/sort-java
/**
 * Created by Patricia on 12/10/2014.
 */
public class SortFruits {
    public static void main(String args[])
    {
        String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"};

        Arrays.sort(fruits);

        int i=0;
        for(String temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp);
        }
    }
}
