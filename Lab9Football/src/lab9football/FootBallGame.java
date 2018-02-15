

package lab9football;
import java.util.ArrayList;

public class FootBallGame {
    
    private String homeTeam;
    private String visitingTeam;
    
    ArrayList<IFootball> football;
    
    public FootBallGame(String homeTeamIn, String visitingTeamIn)
    {
        this.homeTeam = homeTeamIn;
        this.visitingTeam = visitingTeamIn;
        football = new ArrayList();
    }
    
    
    public void addFootballListener(IFootball listener)
    {
        football.add(listener);
        listener.setHomeTeam(homeTeam);
        listener.setVisitingTeam(visitingTeam);
    }
    
    public void notifyHomeTeamScored(int pointsIn)
    {
        for(int i = 0; i < football.size(); i++)
        {
            football.get(i).homeTeamScored(pointsIn);
        }
    }
    
    public void notifyVisitingTeamScored(int pointsIn)
    {
        for(int i = 0; i < football.size(); i++)
        {
            football.get(i).visitingTeamScored(pointsIn);
        }
    }
    
    public void notifyQuarterEnded(int quarterIn)
    {
        for(int i = 0; i < football.size(); i++)
        {
            football.get(i).endOfQuarter(quarterIn);
        }
    }
}
