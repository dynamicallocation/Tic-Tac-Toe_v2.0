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
        theBoard = board.createBoard();
        int p1Score = 0;
        int p2Score = 0;
        rules.intro();
        rules.initDisplay();
        System.out.println("Player One please select a username");
        String usrOne = sc.nextLine();
        System.out.println("Player two please select a username");
        String usrTwo = sc.nextLine();
        Player player = new Player(usrOne,usrTwo);
        /*if (sc.nextLine().isEmpty()){
        System.out.println("No name was typed. Default names set");
    }*/
        if (player.equals(null)){
        System.out.println("Please try again");


        System.out.println();
    }
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
            System.out.println("player 1 won " + p1Score + " times");
            System.out.println("Player 2 won " + p2Score + " times");
            
              if(player.getP1() && player.getP2())
            {
                
                 System.out.println("Player: heads or tails");
                 System.out.println("Enter: 0 for heads, 1 for tails");
                 ansr = sc.nextInt();
                 result = rand.nextInt(2) + 1;
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
                
                  }
           
            
             else if(player.getP1())
            {
                System.out.println(player.getunameOne() + " Make your move");
                board.displayBoard();
                System.out.println("Need Help? y/n");
                String input = sc.next();
                if(input.equals("y")){
                    System.out.println("TIP: ENTER A VALUE");
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
                    System.out.println("\t(row,column)!(row,column)!(row,column)");


                }if(input.equals("n")){

                }
                System.out.println("enter a row");
                int playerRow = sc.nextInt();
                System.out.println("enter a column");


                int playerColumn = sc.nextInt();
                if(!board.updateBoard(playerRow,playerColumn,player.getFirst()))
                {
                    System.out.println("Please place your token in an empty area of the board");
                    continue;
                }

                player.setTurn(false,true);
                if(ref.checkWinner(theBoard))
                {
                    player.setTurn(false,false);
                    player.setWinner(true,false);
                    p1Score++;
                    //Set Jlabel here
                }
                else if(ref.checkDraw(theBoard))
                {
                    System.out.println("Nobody Won");
                    player.setTurn(false,false);
                    player.setWinner(false,false);
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
                if(!board.updateBoard(playerRow,playerColumn,player.getSecond()))
                {
                    System.out.println("Please place your token in an empty area of the board");
                    continue;
                }
                player.setTurn(true,false);
               if(ref.checkWinner(theBoard))
                {
                    System.out.println(player.getunameTwo() + " won");
                    player.setTurn(false,false);
                    player.setWinner(false,true);
                    p2Score++;
                    //Set JLabel Here
                    
                }
                else if(ref.checkDraw(theBoard))
                {
                    System.out.println("Nobody Won");
                    player.setTurn(false,false);
                    player.setWinner(false,false);
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
                      else if(player.isWinTwo())
                      {
                          player.setTurn(false,true);
                      }
                      else
                      {
                          player.setTurn(true,true);
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