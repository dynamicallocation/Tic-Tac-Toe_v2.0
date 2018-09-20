public class Referee
{
    Player player = new Player();
    Board board = new Board();
    
    
    public boolean checkWinner()
    {
        if(isHorizontal(board.getBoard()) || isVertical(board.getBoard()) || isDiagonal(board.getBoard()))
        {
           if(player.getP1())
           {
               System.out.println(player.getunameOne() + " Won!");
               
           }
           else
           {
               System.out.println(player.getunameTwo() + " Won!");
               
           }
           return true;
        }
        return false;
    }
    
    
    
    public boolean isHorizontal(String[][] board)
    {
        if(!board[0][0].equals(" ") && !board[0][1].equals(" ") && !board[0][2].equals(" ") || !board[1][0].equals(" ") && !board[1][1].equals(" ") && !board[1][2].equals(" ") || !board[2][0].equals(" ") && !board[2][1].equals(" ") && !board[2][2].equals(" "))
        {
            return true;
        }
        else
         {
              return false;
        }
}

    
    public boolean isVertical(String[][] board)
    {
        if(!board[0][0].equals(" ") && !board[1][0].equals(" ") && !board[2][0].equals(" ") || !board[0][1].equals(" ") && !board[1][1].equals(" ") && !board[2][1].equals(" ") || !board[0][2].equals(" ") && !board[1][2].equals(" ") && !board[2][2].equals(" "))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public boolean isDiagonal(String[][] board)
    {
        if(!board[0][0].equals(" ") && !board[1][1].equals(" ") && !board[2][2].equals(" ") || !board[0][2].equals(" ") && !board[1][1].equals(" ") && !board[2][0].equals(" "))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

    
    
    