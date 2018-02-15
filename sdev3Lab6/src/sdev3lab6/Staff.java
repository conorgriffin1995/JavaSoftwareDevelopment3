package sdev3lab6;

/**
 *
 * @Conor Griffin x00111602
 */
public class Staff {
    
    public StaffMember List [];
    
    public Staff()
    {
        
    
    
        List = new StaffMember[]{new Executive ("John", "1 This St", "0874323476", "R6574635", 2423.07),
                                 new Employee ("Paul", "2 That St", "0854345222", "P8884635", 1246.15),
                                 new Employee ("Dave", "3 Other St", "0864343566", "S9876635", 1169.23),
                                 new Hourly ("Joanne", "4 Long Ave.", "0836789676", "T0987635", 10.55),
                                 new Volunteer ("Norma", "5 Short Ave.", "0854676767"),
                                 new Commission ("Molly", "7 Nowhere Rd.", "0864326789", "L6599635", 6.25, 0.2),
                                 new Commission ("Joe", "8 My Place", "0864344545", "G8888635", 9.75, 0.15)};
                                     
    }
    
    public void processStaff(){
        
        for (int i = 0; i < List.length; i++)
        {
            if(List[i] instanceof Executive)
            {
                Executive e = (Executive)List[i];
                e.awardBonus(500);   
            }
            if(List[i] instanceof Hourly)
            {
                Hourly h = (Hourly)List[i];
                h.addHours(40);
            }
            if(List[i].name.equals("Molly"))
            {
                if(List[i] instanceof Commission)
                {
                    Commission c = (Commission)List[i];
                    c.addHours(35);
                    c.addSales(400);
                }
            }
            if(List[i].name.equals("Joe"))
            {
                if(List[i] instanceof Commission)
                {
                    Commission c = (Commission)List[i];
                    c.addHours(40);
                    c.addSales(950);
                }
            }
        }
        
    }
    
    public void payday(){
        
        for(int j = 0; j < List.length; j++)
        {
            System.out.println(List[j].toString());
            
            if (List[j].pay()==0)
            {
                System.out.println("Thanks!!");
            }
            else
            {
                System.out.println("Paid: "+List[j].pay());
            }
            System.out.println("----------------------------");
        }
        
    }

}
