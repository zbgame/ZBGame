import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
/**
 * Write a description of class room here.
 * 
 * @author (your name) 
 * @version much work
 */
public class Room
{
    // instance variables - replace the example below with your own
    private HashMap<String, Item> ItemsInRoom;
    private String description;
    private HashMap<String, Room> exits;
    boolean isLocked;

    /**
     * Constructor for objects of class room
     */
    public Room(String description, boolean l)
    {
        // initialise instance variables
        this.description = description;
        ItemsInRoom = new LinkedHashMap<String, Item>();
        exits = new LinkedHashMap<String, Room>();
        isLocked = l;
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString()+".\n"+getItemString();
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) 
        {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }

    public boolean getIsLocked()
    {
        return isLocked;
    }

    public void setIsLocked(boolean l)
    {
        isLocked = l;
    }
    
    public String getItemString()
    {
        String returnString = "You see ";
        Set<String> keys = ItemsInRoom.keySet();
        for(String ItemsInRoom : keys) 
        {
            returnString += " " + ItemsInRoom;
        }
        returnString += " in the room.";
        return returnString;
    }
    
    public Item getItemsInRoom(String item) 
    {
        return ItemsInRoom.get(item);
    }
    
    public void setItemsInRoom(Item item) 
    {
        ItemsInRoom.put(item.getName(), item);
    }
}
