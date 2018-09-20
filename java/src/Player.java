public class Player
{
    
    private boolean isPlayerOne;
    private boolean isPlayerTwo;
    private String unameOne;
    private String unameTwo;
    private boolean isFirst;
    private boolean isSecond;
    
    public Player(String unameOne,String unameTwo)
    {
        this.unameOne = unameOne;
        this.unameTwo = unameTwo;
      
    }
    public Player()
    {
        
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
    
    public void setTurn(boolean isPlayerOne,boolean isPlayerTwo,boolean isFirst,boolean isSecond)
    {
        this.isPlayerOne = isPlayerOne;
        this.isPlayerTwo = isPlayerTwo;
        this.isFirst = isFirst;
        this.isSecond = isSecond;
    }
    
    public boolean getFirst()
    {
        return isFirst;
    }
    public boolean getSecond()
    {
        return isSecond;
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