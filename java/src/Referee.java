public class Referee
{
    
    
    private boolean isWinner = false;
    
    
    
    
    private boolean checkWinner()
    {
        combo.add(moves.getMove());
    }
    
    
    
    
    
    
    private void checkWin()
    {
        switch(win)
        {
            case "012":
                isWinner = true;
                break;
            case "345":
                isWinner = true;
                break;
            case "678":
                isWinner = true;
                break;
            case "048":
                isWinner = true;
                break;
            case "036":
                isWinner = true;
                break;
            case "147":
                isWinner = true;
                break;
            case "258":
                isWinner = true;
                break;
            case "246":
                isWinner = true;
                break;
            default:
                isWinner = false;
                break;
            
        }
    }
    
    
    
    
    
   
    
    
}