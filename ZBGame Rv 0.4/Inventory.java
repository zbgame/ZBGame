import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
/**@author Blacklotus3
 */
public class Inventory 
{
    private HashMap<String, Item> items;
    private Player theGuy;
    private Room currentRoom;

    public Inventory(Player p, Room r)
    {
        theGuy = p;
        currentRoom = r;
        items = new HashMap<String, Item>();
    }

    public void use(Item m)
    {
        
    }

    public Item getItem(String itemName) 
    {
        return items.get(itemName);
    }

    public void setItem(Item item) 
    {
        items.put(item.getName(), item);
    }

    public Player getPlayer()
    {
        return theGuy;
    }

    public void setRoom(Room r)
    {
        currentRoom = r;
    }

    public Room getRoom()
    {
        return currentRoom;
    }

    public String getItemString()
    {
        String returnString = "You have";
        Set<String> keys = items.keySet();
        for(String item : keys) 
        {
            if(getItem(item).getQuantity()>0)
            {
                returnString += " " + item;
            }
        }
        returnString += " in your inventory.";
        return returnString;
    }
}
