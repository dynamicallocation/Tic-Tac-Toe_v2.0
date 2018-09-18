public class Referee
{
    Player player = new Player();
    
    
    private boolean declareWinner()
    {
        if(isHorizontal() || isVertical() || isDiagonal())
        {
           if(player.Turn().equals("player 1"))
           {
               System.out.println(player.getUname + " Won!")
               
           }
           else
           {
               System.out.println([player.getUnameTwo() + " Won!")
               
           }
           return true;
        }
        return false;
    }
    
    
    
    public boolean isHorizontal()
    {
    if(!Board[0][0].equals(" ") && !Board[0][1].equals(" ") && !Board[0][2].equals(" ") || !Board[1][0].equals(" ") && !Board[1][1].equals(" ") && !Board[1][2].equals(" ")|| !Board[2][0].equals(" ")) && !Board[2][1].equals(" ") && !Board[2][2].equals(" "))
    {
        return true;
    }
    else
    {
        return false;
    }
    
    public boolean isVertical()
    {
        if(!Board[0][0].equals(" ") && !Board[1][0].equals(" ") && !Board[2][0].equals(" ") || !Board[0][1].equals(" ") && !Board[1][1].equals(" ") && !Board[2][1].equals(" ") || !Board[0][2].equals(" ")) && !Board[1][2].equals(" ") && !Board[2][2].equals(" "))
        {
            return true;
        }
        else
        {
            return false
        }
        
    }
    
    public boolean isDiagonal
    {
        if(!Board[0][0].equals(" ") && !Board[1][1].equals(" ") && !Board[2][2] || !Board[0][2] && !Board[1][1] && !Board[2][0])
        {
            return true 
        }
        else
        {
            return false
        }
    }
}

    
    
    
    
    
   
    
    
}