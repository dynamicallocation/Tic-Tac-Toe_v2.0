import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Board board = new Board();
        Referee ref = new Referee();
        Rules rules = new Rules();
        String[][] theBoard;
        
        StringBuilder sb = new StringBuilder();
        theBoard = board.createBoard();
        rules.intro();
        rules.initDisplay();
        System.out.println("Player One please select a username");
        String usrOne = sc.nextLine();
        System.out.println("Player two please select a username");
        String usrTwo = sc.nextLine();
        Player player = new Player(usrOne,usrTwo);
        System.out.println("Player: heads or tails");
        System.out.println("Enter: 0 for heads, 1 for tails");
        int ansr = sc.nextInt();
        int result = rand.nextInt(2) + 1;
        if(ansr == result)
        {
            System.out.println("Correct Player one goes first");
            player.setTurn(true,false,true,false);
            
            
            
        }
        else
        {
            System.out.println("Incorrect Player two goes first");
            player.setTurn(false,true,false,true);
        }
        
        
        while(true)
        {
           
            
            if(player.getP1())
            {
                System.out.println(player.getunameOne() + " Make your move");
                board.displayBoard();
                System.out.println("enter a row");
                int playerRow = sc.nextInt();
                System.out.println("enter a column");
                int playerColumn = sc.nextInt();
                String rc = Integer.toString(playerRow) + Integer.toString(playerColumn);
                board.updateBoard(playerRow,playerColumn,player.getFirst());
                player.setTurn(false,true);
                if(ref.checkWinner(theBoard))
                {
                    player.setTurn(false,false);
                    player.setWinner(true,false);
                }
            }
            else if(player.getP2())
            {
                System.out.println(player.getunameTwo() + " Make your move");
                board.displayBoard();
                System.out.println("Enter a row");
                int playerRow = sc.nextInt();
                System.out.println("Enter a column");
                int playerColumn = sc.nextInt();
                String rc = Integer.toString(playerRow) + Integer.toString(playerColumn);
                
                board.updateBoard(playerRow,playerColumn,player.getSecond());
                player.setTurn(true,false);
               if(ref.checkWinner(theBoard))
                {
                    System.out.println(player.getunameTwo() + " won");
                    player.setTurn(false,false);
                    player.setWinner(false,true);
                    
                }
            }
            else
            {
                System.out.println("Would you like to play again y/n");
                String answer = sc.nextLine();
                try
                {
                    if(answer.equals("y"))
                    {
                      theBoard = board.createBoard();
                      if(player.isWinOne())
                      {
                          player.setTurn(true,false);
                      }
                      else
                      {
                          player.setTurn(false,true);
                      }
                        continue;
                    }
                    else if(answer.equals("n"))
                    {
                        break;
                    }
                }
                catch(IllegalArgumentException e)
                {
                    System.out.println(e.toString() + " is an invalid answer please type y/n");
                }

               
            }
        }
        
        
        
        
    }

}