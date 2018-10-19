public class Referee
{
    Player player = new Player();
    Board board = new Board();
    
    
    public boolean checkWinner(String[][] theBoard)
    {
        
        if(isVertical(theBoard) || isHorizontal(theBoard) || isDiagonal(theBoard))
        {
           
           return true;
        }
        return false;
    }
    
    public boolean checkDraw(String[][] theBoard)
    {
        if(isDraw(theBoard) == 9)
        {
            return true;
        }
        return false;
    }
    
    
    
    public boolean isHorizontal(String[][] board)
    {
        if((board[0][0].equals("X")  && board[0][1].equals("X") && board[0][2].equals("X") || board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X") || board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) || (board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O") || board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O") || board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")))
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
    
    public int isDraw(String[][] board)
    {
        int sum = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j].equals("X") || board[i][j].equals("O"))
                {
                    sum++;
                    System.out.println(sum);
                }
            }
        }
        return sum;
    }
    
   
  
   
   
}

    
    
    