
/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Item 
{
    // instance variables - replace the example below with your own
    private Room unlocks;

    /**
     * Constructor for objects of class Key
     */
    public Key(Room i)
    {
        // initialise instance variables
        unlocks = i;
    }

    public void setRoom(Room i)
    {
        unlocks = i;
    }
    
    public Room getRoom()
    {
        return unlocks;
    }
    
    
}
