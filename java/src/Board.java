public class Board 
{
    
    private String[][] board
    private static int ROW; 
    private static int COLUMN;
    private static String BLANK = " ";
    private static String X = "X";
    private static String O = "O";
    private Player player = new Player();
    
    
    public int[] createBoard()
    {
        for(int i = 0; i < board.length(); i++)
        {
            for(int j = 0; j < board.length();j++)
            board[i][j] = BLANK;
        }
        //return board;
    }
    
    public void displayBoard(int[][] board)
    {
        System.out.println("\n\t",board[0][0],"|",board[0][1],"|",board[0][2]);
        System.out.println("\t", "---------");
        System.out.println("\t", board[1][0],"|",board[1][1],"|",board[1][2]);
        System.out.println("\t", "---------");
        System.out.println("\t", board[2][0],"|",board[2][1],"|",board[2][2],"\n");
        
    }
    
   
    
    public void updateBoard(int move)
    {
        
        
        if(player.getX())
        {
            board[i][j] = "X";
        }
        else
        {
            board[i][j] = "O"; 
        }
    }
    
    public int[][] getBoard()
    {
        return board;
    }
}