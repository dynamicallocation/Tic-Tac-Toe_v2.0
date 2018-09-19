public class Referee
{
    Player player = new Player();
    Board board = new Board();
    
    
    private boolean checkWinner()
    {
        if(isHorizontal() || isVertical() || isDiagonal())
        {
           if(player.getP1)
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
    
    
    
    public boolean isHorizontal(board.getboard())
    {
    if(!board[0][0].equals(" ") && !board[0][1].equals(" ") && !board[0][2].equals(" ") || !board[1][0].equals(" ") && !board[1][1].equals(" ") && !board[1][2].equals(" ")|| !board[2][0].equals(" ")) && !board[2][1].equals(" ") && !board[2][2].equals(" "))
    {
        return true;
    }
    else
    {
        return false;
    }
    
    public boolean isVertical()
    {
        if(!board[0][0].equals(" ") && !board[1][0].equals(" ") && !board[2][0].equals(" ") || !board[0][1].equals(" ") && !board[1][1].equals(" ") && !board[2][1].equals(" ") || !board[0][2].equals(" ")) && !board[1][2].equals(" ") && !board[2][2].equals(" "))
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
        if(!board[0][0].equals(" ") && !board[1][1].equals(" ") && !board[2][2] || !board[0][2] && !board[1][1] && !board[2][0])
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