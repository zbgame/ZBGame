import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
/**
 * Write a description of class room here.
 * 
 * @author Viola
 * @version much work
 */
public class Room
{
    // instance variables - replace the example below with your own
    private HashMap<String, Item> ItemsInRoom;
    private String description;
    private HashMap<String, Room> exits;
    boolean isLocked;
    Zombie killMe;

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
        return "You are " + description + ".\n" + getExitString()+".\n"+getThingsString();//Zaq: Modified to return items in room
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

    public String getThingsString()//Zaq: Much like get exits, returns string of items in room
    {
        if(ItemsInRoom.isEmpty() && killMe == null)
        {
            return "You see nothing in the room";
        }
        else
        {
            String returnString = "You see";
            Set<String> keys = ItemsInRoom.keySet();
            for(String ItemsInRoom : keys) 
            {
                returnString += " " + ItemsInRoom;
            }
            if(killMe == null){}
            else if(killMe.getHealth() <= 0)
            {
                returnString += " the corpse of " + killMe.name();
            }
            else if(killMe != null)
            {
                returnString += " " + killMe.name();
            }
            returnString += " in the room.";
            return returnString;
        }
    }

    public Item getItemsInRoom(String item) //Zaq: Gets an instance of an item in the room
    {
        return ItemsInRoom.get(item);
    }

    public void setItemsInRoom(Item item) //Zaq: Sets items into the room hashmap using their name as a reference key
    {
        ItemsInRoom.put(item.getName(), item);
    }

    public void removeItemFromRoom(String item)
    {
        ItemsInRoom.remove(item);
    }

    public void setEnemy(Zombie e)
    {
        killMe = e;
    }

    public Zombie getEnemy()
    {
        return killMe;
    }

    public boolean roomHasEnemy()
    {
        if(killMe != null)
        {
            return true;
        }
        return false;
    }

    public HashMap returnExits()//Zaq: Returns a hashmap of exits for items to analize for certain room conditions
    {
        return exits;
    }

    public String look(String name)
    {
        Random rand = new Random();
        int n = rand.nextInt(2);
        String returnString = "You see "+name;
        if(isLocked){returnString += " is locked. ";}
        if(!isLocked){returnString += " is unlocked. ";}
        if(killMe == null || killMe.getHealth()<=0){returnString += "\nYou don't hear anything inside.";}
        if(killMe != null && killMe.getHealth()>0)
        {
            if(n == 0){returnString += "\nYou don't hear anything inside.";}
            if(n == 1){returnString += "\nYou hear something moving around inside.";}
        }
        return returnString;
    }
}