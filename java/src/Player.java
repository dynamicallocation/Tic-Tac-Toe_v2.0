public class Player
{
    
    private boolean isPlayerOne;
    private boolean isPlayerTwo;
    
    public Player(String unameOne,String unameTwo)
    {
        this.unameOne = unameOne;
        this.unameTwo = unameTwo;
    }
    
    public String getunameOne()
    {
      return unameOne;  
    }
    public String getunameTwo()
    {
        return unameTwo;
    }
    
    public void setTurn(boolean isPlayerOne,boolean isPlayerTwo)
    {
        this.isPlayerOne = isPlayerOne;
        this.isPlayerTwo = isPlayerTwo;
    }
    
    public boolean getP1()
    {
        return isPlayerOne;
    }
    public boolean getP2()
    {
        return isPlayerTwo;
    }
    
    
}