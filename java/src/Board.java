public class Board 
{
    
    private String[][] board = new String[3][3];
    private static int ROW = 3; 
    private static int COLUMN = 3;
    private static String BLANK = " ";
    private static String X = "X";
    private static String O = "O";
    private static String p1 = "p1";
    private static String p2 = "p2";
    private Player player = new Player();
    
    
    public String[][] createBoard()
    {
        for(int i = 0; i < ROW; i++)
        {
            for(int j = 0; j < COLUMN;j++)
            board[i][j] = BLANK;
        }
        return board;
    }
    
    public void displayBoard()

    {

        System.out.println("\n\t" + board[0][0] + "  |" + board[0][1] + "  |" + board[0][2]);
        System.out.println("\t-----------");
        System.out.println("\t" + board[1][0] + "  |" + board[1][1] + "  |" + board[1][2]);
        System.out.println("\t-----------");
        System.out.println("\t" + board[2][0] + "  |" + board[2][1] + "  |" + board[2][2] + "\n");



        {
            System.out.println("column0   column1   column2 ");

            System.out.println("\n\t" + board[0][0] +   "    !  " + board[0][1] + "     !" + board[0][2] + "           Row 0");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t" + board[1][0] + "    !" + board[1][1] + "       !" + board[1][2] + "           Row 1");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t" + board[2][0] + "    !" + board[2][1] + "       !" + board[2][2] + "           Row2"+ "\n");


           /* System.out.println("TIP: ENTER A VALUE");
            System.out.println("\n\t(0,0)!(0,1)!(02)");
            System.out.println("\t~~~~~~~~~~~~~~~~");
            System.out.println("\t(1,0)!(1,1)!(1,2)");
            System.out.println("\t~~~~~~~~~~~~~~~~");
            System.out.println("\t(2,0)!(2,1)!(2,2)");

            System.out.println("*Game Info*");
            System.out.println("\n\t(row,column)!(row,column)!(row,column)");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t(row,column)!(row,column)!(row,column)");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t(row,column)!(row,column)!(row,column)");*/



        }


        }




    
   
    
    public boolean updateBoard(int row,int column,boolean first)
    {

        if(board[row][column].equals(BLANK))
        {
            if(first)
            {
                board[row][column] = "X";
                //board[row][column] = p1;
                return true;
            }
            else
            {
                board[row][column] = "O";
               // board[row][column] = p2;
                return true;
            }

        }
        return false;

    }
    
   /* public String[][] getBoard()
    {
        return board;
    }*/
}