//VIola DeShields Item class
import java.util.ArrayList;
public class Item
{

    private int worth;
    private int howFragile;
    private double probabilityInRoom;
    private boolean food;
    private boolean weapon;
    private boolean armor;
    private ArrayList<Item> typesOfItems;
    public Item(int w, int h, double p)  //intializes the objects
    {
        food = true;
        weapon = true;
        armor = true;
        probabilityInRoom = p;
        howFragile = h;
        worth = w;
       
    }

    public Item getProb()
    {
        return probabilityInRoom;
    }
    public boolean isFood()
    {
        return food; //to determine if items is consumable
    }

    public boolean isWeapon()
    {
        return weapon; //to determine if it is a weapon
    }

    public boolean isArmor() 
    {
        return armor;// to determine if it is armor...not sure if we are using this
    }

    public void addItem(Item typesOfItems)
    {
        addItem(typesOfItems); //add items that we need and holds them for use 
    }
    
     public ArrayList<Item> getItems()
    {
        return items; //gets the items in the array
    }
    public int getFrag()
    {
        return howFragile; //determines if it breaks easily
    }
    public int getWorth()
    {
        return worth; //gets the worth of the items
    }
}
