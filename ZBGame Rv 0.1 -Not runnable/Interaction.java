
/**
 * Write a description of class Interaction here.
 * 
 * @author (John Jones) 
 * @version (at least the third best version)
 */
import java.util.Scanner;
public class Interaction
{
    private Checker commands;
    
    public Interaction()
    {
       commands = new CommandWords();
       reader = new Scanner(System.in);
   
    }
    
    public String getCommand()
    {
        String inputLine;
        String word1 = null;
        String word2 = null;
        // may need more than two words for our potential actions
        System.out.println("> ");
        
        inputLine = reader.nextLine();
        
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext())
        {
            word1 = tokenizer.next();
            if(tokenizer.hasNext())
            {
                word2 = tokenizer.next();
            }
        }
        
        if(command.isCommand(word1))
        {
            return new Command(word1, word2);
        }
        else
        {
            return new Command(null, word2);
        }
    }
    
    public void showCommands()
    {
        commands.showAll();
    }
        
        
            
            

}
