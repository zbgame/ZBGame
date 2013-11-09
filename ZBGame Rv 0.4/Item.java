/**
 *
 * @author Samantha
 */
public class Item    //sbw eliminated inner class Item  2013 10 17  1600
{
    private String name;//items name, all items will have names
    private String description;//all items will have descriptions when you look at them
    private int quantity;//the number of items you have, some items will need overridden functions for removing items
    private double durability;// the number of times you can use an item before it breaks, used double incase of percentage chances

    public Item()  //sw: Armor extensd Items needs no-arg constructor  
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String v)
    {
        name = v;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String h)
    {
        description = h;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int t)
    {
        quantity = t;
    }
    
    public void use()
    {
        
    }
    
    public void pickUp()
    {
        
    }
}

