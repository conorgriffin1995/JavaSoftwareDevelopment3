package capractice;
import static capractice.Rates.CHARGE;
import java.util.*;

//Conor Griffin

import java.util.ArrayList;

//x00111602
//CA Practice

    public class Flight implements Rates {
    
    private int capacity;
    private double duration;
    ArrayList <Passenger> passengers;
    private double baggageCharge = 0;

    public Flight(int capacity, double duration) {
        this.capacity = capacity;
        this.duration = duration;
        passengers = new ArrayList();
    }
    
    public void fillList(Passenger p1){
        
        passengers.add(p1);
        
    }
    
    public void print(){
        System.out.println("***Passenger Details***");
        for(int i = 0; i < passengers.size(); i++)
        {
        System.out.println("Name:           \t"+passengers.get(i).name);
        System.out.println("Age:            \t"+passengers.get(i).age);
        System.out.println("Number Of Bags: \t"+passengers.get(i).bags);
            
        if(passengers.get(i).bags > 0)
        {
            baggageCharge = ((passengers.get(i).bags - FREE_BAG) * CHARGE);
            
        }
        else{
            baggageCharge = 0;
        }
        System.out.printf("Baggage Charge: \t€%.2f",baggageCharge);
        System.out.println("");
        System.out.println("");
        }   
    }
    
    public int checkAvailability(){
        
        int numSeatsLeft = 0;
        int numSeatsTaken = 0;
        
        for(int i = 0; i < passengers.size(); i++){
            numSeatsTaken++;    
        }
        numSeatsLeft = capacity - numSeatsTaken;
        return numSeatsLeft;
    }
    
    public String findOldestPassenger(){
        
        int index = 0;
        
        for(int i = 0; i < passengers.size(); i++)
        {
            
            if(passengers.get(index).age < passengers.get(i).age)
            {
                index = i;
            }
          
        }
        String s = "Oldest Person: "+passengers.get(index).name+
                    " age: "+passengers.get(index).age+" on the flight";
        return s;  
        

    }
    
    class Passenger
    {

    private String name;
    private int age;
    private int bags;
    
    
    
    public Passenger(){
        name = "";
        age = 0;
        bags = 0;      
    }

    public Passenger(String name, int age, int bags) {
        this.name = name;
        this.age = age;
        this.bags = bags;
    }
    
    
    
    
    
    }
    
    
    
}
