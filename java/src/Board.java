public class Board 
{
    
    private String[] domain;
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
            board[i] = BLANK;
        }
        return board;
    }
    
    public void displayBoard(array board)
    {
        System.out.println("\n\t",board[0],"|",board[1],"|",board[2]);
        System.out.println("\t", "---------");
        System.out.println("\t", board[3],"|",board[4],"|",board[5]);
        System.out.println("\t", "---------");
        System.out.println("\t", board[6],"|",board[7],"|",board[8],"\n");
        
    }
    
    public void updateBoard(int move)
    {
        String turn = player.getTurn();
        
        if(turn.equals("player1"))
        {
            board[i] = "X";
        }
        else
        {
            board[i] = "O"; 
        }
    }
    
    public int[] getBoard()
    {
        return Board;
    }
}