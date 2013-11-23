import java.util.Set;
import java.util.HashMap;
/**@author Patrick Foltyn
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
        if(m instanceof Key && m.getQuantity()>0)
        {
            ((Key)m).use(currentRoom);
        }
        if(m instanceof Food && m.getQuantity()>0)
        {
            ((Food)m).use(theGuy);
        }
        if(m instanceof Weapon && m.getQuantity()>0)
        {
            ((Weapon)m).use(theGuy, currentRoom.getEnemy());
        }
    }
    
    public Item getItem(String itemName) 
    {
        return items.get(itemName);
    }

    public void setItem(Item item) 
    {
        items.put(item.getName(), item);
    }

    public void setPlayer(Player p)
    {
        theGuy = p;
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
                returnString += ", "+getItem(item).getQuantity()+" "+ item;
            }
        }
        returnString += " in your inventory.";
        return returnString;
    }
}
