
/**
 * Write a description of class Commands here.
 * 
 * @author (John Jones) 
 * @version (It's a pretty okay version.)
 */

public class Commands
{
    private String commandWord;
    private String secondWord;
    // may need more
    
    public Commands(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }
    
    public String getCommandWord()
    {
        return commandWord;
    }
    
    public String getSecondWord()
    {
        return secondWord;
    }
    
    public boolean isInknown()
    {
        return (commandWord == null);
    }
    
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
