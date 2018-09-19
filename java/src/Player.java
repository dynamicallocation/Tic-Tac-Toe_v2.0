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
    
    public boolean getX()
    {
        return isFirst();
    }
    
    public boolean getO()
    {
        return isSecond();
    }
    
    public void setTurn(boolean isPlayerOne,boolean isPlayerTwo,boolean isFirst,boolean isSecond)
    {
        this.isPlayerOne = isPlayerOne;
        this.isPlayerTwo = isPlayerTwo;
        this.isSecond = isSecond;
        this.isFirst = isFirst;
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