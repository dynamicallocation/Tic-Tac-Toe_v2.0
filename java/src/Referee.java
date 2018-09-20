public class Referee
{
    Player player = new Player();
    Board board = new Board();
    
    
    public boolean checkWinner(String[][] theBoard)
    {
        
        if(isVertical(theBoard) || isHorizontal(theBoard) || isDiagonal(theBoard))
        {
           if(player.getP1())
           {
               System.out.println(player.getunameOne() + " Won");
               
           }
           else
           {
               System.out.println(player.getunameTwo() + " Won");
               
           }
           return true;
        }
        return false;
    }
    
    
    
    public boolean isHorizontal(String[][] board)
    {
        if((board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X") || board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X") || board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) || (board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O") || board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O") || board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")))
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
        if((board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X") || board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X") || board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) || (board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O") || board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O") || board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")))
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
        if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X") || board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X") || (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O") || board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
   
  
   
   
}

    
    
    