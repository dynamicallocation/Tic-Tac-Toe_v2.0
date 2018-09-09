public class Board 
{
    private String[] board;
    private static String X = "X";
    private static String O = "O";
    private boolean isConsecutive = false;
    private static int ROWS = 3; 
    private static int COLUMNS = 3;
    private static int MAX = 9;
    private Queue<Computer> Comp = new LinkedList<>();
    private Queue<Player> p1 = new LinkedList<>();
    
    
    
    
    public array createBoard()
    {
        //backend representation of the board
        for(int i = 0;i < MAX;i++)
        {
            board[i] = " ";
        }
        return board;
    }
    
    public String displayBoard()
    {
        
        //create visual representation here
        
    }
    
    public void updateBoard()
    {
        //notify displayBoard() when array is changed
        //notify score if score is consecutive 
        
    }
    
    
    
    
    
    
    
    
    
}