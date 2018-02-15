/* TestRace
 *
 * @Author: Chuong Trung Vuong
 * @Date  : Nov 20, 2015
 */

public class TestRace 
{
    public static void main(String[] args)
    {
        Race r = new Race(100, "Olympics 2017");
        
        System.out.println(r);
        System.out.println(r.calculateFavourite());
    } // end main
} // end class TestRace