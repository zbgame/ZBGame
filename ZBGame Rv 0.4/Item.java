
 
import java.util.ArrayList;
//Revised Item Class

/**With a backpack options. I did see the Inventory Class made. I just wanted
* wasn't sure if we were going to use that for all items in general.
* 
* Viola DeShields
*/

 
    public class Item {
  
    public String name;    
    public int worth;
    public int dmg;
    public double probablity; //I'm not sure if this is relevant right now
    public final ItemType kindOf; //will get the item types
    ArrayList<String> Backpack = new ArrayList<String>();//Will hold all items
   
    
   public Item(ItemType kindOf)
   {
       this.kindOf = kindOf;
       this.Backpack= new ArrayList<String>();
   }   
    
    public int getDamage() //Getting the damage done from type of item
    {
       return kindOf.getDamageDone();
    }    
    
    public boolean checkPack(String name) //Check to see if it's empty
    {
        if(Backpack.contains(name))
        {
            System.out.println("You have " + name + "in your backpack");
            return true;
            
        }
        return false;
    }
    
    public void addItem(String name, int dmg) //adding items to backpack
    {
        Backpack.add(name);
        System.out.println(name + " has been added to backpack.");
    }
    
    public void removeItem(String name)//removing items from backpack
    {
        Backpack.remove(name);
        System.out.println(name + " has been removed from backpack.");
    }
    
    
    
    
    
    
    public static void main(String[] args) 
    {
   //Test to see if my code was working
        
    ItemType swordType = new ItemType(null, 4); 
    ItemType dagger = new ItemType(swordType, 3);
    Item sword = new Item(swordType);
    Item stuff = new Item(swordType);    
    
    
    stuff.addItem("Fire", 45);          
    stuff.removeItem("Fire");
    
    }
}
