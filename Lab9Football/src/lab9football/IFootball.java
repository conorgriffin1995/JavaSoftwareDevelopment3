

package lab9football;


public interface IFootball {
    
    public void homeTeamScored(int points);
    
    public void visitingTeamScored( int points);
    
    public void endOfQuarter(int quarter);
    
    public void setHomeTeam(String name);
    
    public void setVisitingTeam(String name);
}
