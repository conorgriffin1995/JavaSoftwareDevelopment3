

package lab9football;
import java.util.ArrayList;

public class TestFootball {
    public static void main(String[] args) {
        
    
    System.out.println("Instantiating a new Football Game\n");
    System.out.println("Welcome to the International Rules\n");
          
    FootBallGame fbg = new FootBallGame("Ireland", "Australia");
    
    System.out.println("Instantiating a listener\n");
    MobilePhone mbp = new MobilePhone("John");
    MobilePhone mbp1 = new MobilePhone("Paul");
    
    System.out.println("Registering 1 listener to the game\n");
    System.out.println("Registering 2 listeners to the game");
    System.out.println(); 
    fbg.addFootballListener(mbp);
    fbg.addFootballListener(mbp1);
    
    System.out.println("Simulating a game...");
    System.out.println(); 
     fbg.notifyHomeTeamScored(7);
     System.out.println();
     fbg.notifyQuarterEnded(1);
     System.out.println();
     fbg.notifyVisitingTeamScored(3);
     System.out.println();
     fbg.notifyVisitingTeamScored(7);
     System.out.println();
     fbg.notifyQuarterEnded(2);
     System.out.println();
     fbg.notifyQuarterEnded(3);
     System.out.println();
     fbg.notifyHomeTeamScored(3);
     System.out.println();
     fbg.notifyHomeTeamScored(7);
     System.out.println();
     fbg.notifyQuarterEnded(4);
     
    
    
    }
}
