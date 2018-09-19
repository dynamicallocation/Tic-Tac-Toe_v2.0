import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Player One please select a username");
        String usrOne = sc.nextLine();
        System.out.println("Player two please select a username");
        String usrTwo = sc.nextLine();
        Player player = new Player(usrOne,usrTwo);
        System.out.println("Player 1: heads or tails");
        System.out.println("Enter: 0 for heads, 1 for tails");
        int answer = sc.nextInt();
        int result = rand.nextInt(2) + 1
        if(answer == result)
        {
            System.out.println("Correct Player one goes first");
            
            
        }
        else
        {
            System.out.println("Incorrect Player two goes first")
        }
        
        
        while(true)
        {
            


            
            
            
        }
        
        
    }

}