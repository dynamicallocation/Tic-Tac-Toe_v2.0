public class Board 
{
    
    private String[][] domain;
    private static int ROW; 
    private static int COLUMN;
    private static String BLANK = " ";
    private static String X = "X";
    private static String O = "O";
    private Player player = new Player();
    
    
    public int[] createBoard()
    {
        for(int i = 0; i < domain.length(); i++)
        {
            for(int j = 0; j < domain.length();j++)
            board[i][j] = BLANK;
        }
        return board;
    }
    
    public void displayBoard(array board)
    {
        System.out.println("\n\t",board[0][0],"|",board[0][1],"|",board[0][2]);
        System.out.println("\t", "---------");
        System.out.println("\t", board[1][0],"|",board[1][1],"|",board[1][2]);
        System.out.println("\t", "---------");
        System.out.println("\t", board[2][0],"|",board[2][1],"|",board[2][2],"\n");
        
    }
    
    public void updateBoard(int move)
    {
        String turn = player.getTurn();
        
        if(turn.equals("player1"))
        {
            board[i][j] = "X";
        }
        else
        {
            board[i][j] = "O"; 
        }
    }
    
    public int[] getBoard()
    {
        return Board;
    }
}