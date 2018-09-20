public class Rules 
{
    public void intro()
    {
        System.out.println("Welcome to Tic-Tac-Toe");
        System.out.println("This is a text based implementation of everybodys favorite game");
        System.out.println("The game will start with two players each of which will get to create their two usernames");
        System.out.println("Players will then decide amongst themselves who will call out heads or tails on a coin flip the winner will go first");
        System.out.println("After which a board will be displayed each player will then take turns choosing a position to place their respective tokens");
        System.out.println("Whomever gets three of their own tokens horizontally,vertically, or diagonally across the board wins");
        System.out.println("below is the board followed by the numbers a player must enter to place their tokens");
    }
    
    public void initDisplay()
    {
        System.out.println("\n\t00|01|02");
        System.out.println("\t---------");
        System.out.println("\t10|11|12");
        System.out.println("\t---------");
        System.out.println("\t20|21|22");
    }
}