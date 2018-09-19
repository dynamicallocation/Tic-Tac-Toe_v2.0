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
        
        rules.intro();
        rules.initDisplay();
        System.out.println("Player One please select a username");
        String usrOne = sc.nextLine();
        System.out.println("Player two please select a username");
        String usrTwo = sc.nextLine();
        System.out.println("Player: heads or tails");
        System.out.println("Enter: 0 for heads, 1 for tails");
        int answer = sc.nextInt();
        int result = rand.nextInt(2) + 1
        if(answer == result)
        {
            System.out.println("Correct Player one goes first");
            player.setTurn(true,false);
            
            
        }
        else
        {
            System.out.println("Incorrect Player two goes first")
            player.setTurn(false,true);
        }
        
        
        while(true)
        {
            Scanner moveScanner = new Scanner(System.in);
            
            if(player.getP1())
            {
                System.out.println(p1.getUnameOne() + " Make your move");
                board.displayBoard();
                int playerMove = moveScanner.nextInt();
                board.updateBoard(playerMove);
                player.setTurn(true,false);
                if(ref.checkWinner())
                {
                    player.setTurn(false,false);
                }
            }
            else if(player.getP2())
            {
                System.out.println(p2.getUnameOne() + " Make your move");
                board.displayBoard();
                int playerMove = moveScanner.nextInt();
                board.updateBoard(playerMove);
                player.setTurn(false,true);
                if(ref.checkWinner())
                {
                    player.setTurn(false,false)
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
                        board.createBoard();
                        continue;
                    }
                    else if(answer.equals("n"))
                    {
                        break;
                    }
                }
                catch(IllegalArgumentExceptoin e)
                {
                    System.out.println(e.toString() + " is an invalid answer please type y/n");
                }

               
            }
        }
        
        
        
        
    }

}