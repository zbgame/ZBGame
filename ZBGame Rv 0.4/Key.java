/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Item 
{
    // instance variables - replace the example below with your own
    private String roomDeriction;
    private Room unlocks;

    /**
     * Constructor for objects of class Key
     */
    public Key(Room i, String s)
    {
        // initialise instance variables
        unlocks = i;
        roomDeriction = s;
    }

    public void setRoom(Room i)
    {
        unlocks = i;
    }

    public Room getRoom()
    {
        return unlocks;
    }

    public void setDeriction(String s)
    {
        roomDeriction = s;
    }
    
    public String getDeriction()
    {
        return roomDeriction;
    }
    
    @Override
    public void use()
    {
        unlocks.setIsLocked(!unlocks.getIsLocked());
        System.out.println("you used the "+ getName());
    }
}
