import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Player One please select a username");
        String usrOne = sc.nextLine();
        System.out.println("Player two please select a username");
        String usrTwo = sc.nextLine();
        Player player = new Player(usrOne,usrTwo);
        
        while(true)
        {
            System.out.println(player.getunameOne() + " goes first")
            
            
        }
        
        
    }

}