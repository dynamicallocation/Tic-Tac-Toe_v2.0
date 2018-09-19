public class Player
{
    
    private boolean isPlayerOne;
    private boolean isPlayerTwo;
    private boolean isFirst;
    private boolean isSecond;
    
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
    
    public void setTurn(boolean isPlayerOne,boolean isPlayerTwo,boolean isFirst)
    {
        this.isPlayerOne = isplayerOne;
        this.isPlayerTwo = isPlayerTwo;
        this.isFirst = isFirst;
    }
    
    public boolean getX()
    {
        return isFirst;
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