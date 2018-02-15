

package lab9football;


public class MobilePhone implements IFootball{
    
    private String homeTeam;
    private String visitingTeam;
    private String ownerOfPhone;
    private int homeScore;
    private int visitingScore;
    private int currentQuarter;
    
    public MobilePhone(String owner)
    {
        this.currentQuarter = 1;
        this.ownerOfPhone = owner;
    }
    
    public void setHomeTeam(String homeTeamIn)
    {
        this.homeTeam = homeTeamIn;
    }
    
    public void setVisitingTeam(String visitingTeamIn)
    {
        this.visitingTeam = visitingTeamIn;
    }
    
    public void displayQuarter()
    {
        if(currentQuarter > 0)
        {
            System.out.println("Hi " +ownerOfPhone+ " game is in quarter: " +currentQuarter);
        }
        else
        {
            System.out.println();
            System.out.println(" Hi " +ownerOfPhone+ " final score.");
        }
    }
    
    public void updateScore()
    {
        System.out.println(homeTeam+": "+homeScore);
        System.out.println(visitingTeam+": "+visitingScore);
        displayQuarter();
    }
    
    @Override
    public void endOfQuarter(int quarter)
    {
        if(quarter >= 1 && quarter <= 3)
        {
            currentQuarter++;
        }
        else
        {
            currentQuarter = -1;
        }
        
        System.out.println("Hi " +ownerOfPhone+ " quarter " +quarter+ " has just ended.");
        updateScore();
    }

    @Override
    public void homeTeamScored(int pointsIn)
    {
        System.out.println("Hi " +ownerOfPhone+ " the home team has just scored " +pointsIn+ " points");
        homeScore += pointsIn;
        updateScore();
    }
    
    @Override
    public void visitingTeamScored(int pointsIn)
    {
        System.out.println("Hi " +ownerOfPhone+ " the visiting team has just scored " +pointsIn+ " points");
        visitingScore += pointsIn;
        updateScore();
    }
}
