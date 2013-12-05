public class Item
/**
 * @author Viola
 */
{
    private String name;//items name, all items will have names
    private String description;//all items will have descriptions when you look at them
    private int quantity = 0;//the number of items you have, some items will need overridden functions for removing items
    private double durability;// the number of times you can use an item before it breaks, used double incase of percentage chances

    public Item(){}
    
    public Item(String n, String d, int q)  //sw: Armor extensd Items needs no-arg constructor  
    {
        name = n;
        description = d;
        quantity = q;
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
        System.out.println("You can't use that...\nYet!");
    }
}

