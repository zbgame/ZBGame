
/**
 * Write a description of class Checker here.
 * 
 * @author (John Jones) 
 * @version (The best version ever)
 */
public class Checker
{
    // an array to hold all valid command words
    private static final String[] validCommands = {"Put commands here."};

    
    public Checker()
    {
        // a no-arg constructor to initialize
        
    }

    //checks if string is valid
    public boolean isCommand(String input)
    {
       for(int i; 1 < validCommands.length; i++)
       {
           if(validCommands[i].equals(input))
           return true;
       }
       // not a valid command if false 
       return false; 
    }
    
    public void showAll()
    {
        for(String comman: validCommands)
        {
            System.out.println(commands + " ");
        }
        System.out.println();
    }
    
    
}
