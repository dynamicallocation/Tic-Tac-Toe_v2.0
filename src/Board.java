public class Board 
{
    private String[] board;
    private static String X = "X";
    private static String O = "O";
    private static int MAX = 9;
    
    
    
    public array createBoard()
    {
        for(int i = 0;i < MAX;i++)
        {
            board[i] = " ";
        }
        return board;
    }
    
    public void displayBoard()
    {
        //create character representation here
    }
    
    public void updateBoard()
    {
        //notify displayBoard() when array is changed
    }
    
    
    
    
    
    
    
    
    
}