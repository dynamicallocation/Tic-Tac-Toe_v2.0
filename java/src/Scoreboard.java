public class Scoreboard
{
    private int p1Score; 
    private int p2Score;
    private String usrOne;
    private String usrTwo;
    
    
    public void setp1Score(int score1,String unameOne)
    {
        p1Score = score1;
        usrOne = unameOne;
        
    }
    
    public void setp2Score(int score2,String unameTwo)
    {
        p2Score = score2;
        usrTwo = unameTwo;
    }
    
    public int getp1Score()
    {
        return p1Score;
    }
    
    public int getp2Score()
    {
        return p2Score;
    }
    
    public String getunameTwo()
    {
        return usrTwo;
        
    }
    
    public String getunameOne()
    {
        return usrOne;
    }
}