import java.util.Random;
import java.util.ArrayList;
public class Zombie 
/** @author Nick
 * ba-donk-a donkest version
 */
{
    private String name;       //I feel this is unneccessary but may be useful;
    private int maxHealth;     //Maximum health to start with (wondering if single health variable is enough)
    private int currentHealth; //how much health the zombie currently has

    private int heldCash;      //amount of money the player gains after battle
    private String description;
    private Room theRoom;
    private ArrayList<Attack> behavior = new ArrayList<Attack>();
    private ArrayList<Item> drops = new ArrayList<Item>();
    private boolean first = false;//current living condition. Preset to alive for obvious reasons
    private int expDropped;

    public Zombie(String n, String d, int h, int e, Room r, int m) // constructor
    {
        name = n;
        maxHealth = h;
        currentHealth = maxHealth;
        description = d;
        expDropped = e;
        theRoom = r;
        heldCash = m;
    }

    public void getBehavior(Player p)
    {
        if(first)
        {
            Random rand = new Random();
            int n = rand.nextInt(behavior.size());
            System.out.println(name+ " " +behavior.get(n).getDescription());
            int damage = behavior.get(n).getDamage() - p.getDefense();
            if(damage < 0)
            {
                damage = 0;
            }
            p.setHitpoints(p.getHitpoints() - damage);
            if(damage > 0)
            {
                System.out.println("You have "+p.getHitpoints()+" hearts remaining.");
            }
            if(damage <= 0)
            {
                System.out.println("It didn't hurt at all.");
            }
        }
        else
        {
            first = true;
            System.out.println(name+ " " +behavior.get(0).getDescription());
            System.out.println("It didn't hurt at all.");
        }
    }

    public void setBehavior(Attack a)
    {
        behavior.add(a);
    }

    public String name()                                    // just returns the zombie name for player
    {
        return name;
    }

    public String description()                                    // just returns the zombie name for player
    {
        return description;
    }

    public int getHealth()                                     // upon dying, the zombie will drop the item and reutnr it to the player from this method
    {
        return currentHealth;
    }

    public void setHealth(int r)                            // method that will take an integer (player dealt damage) and subtracts it from the zombie health
    {
        currentHealth = r;
    }

    public int dropCash()                                   //returns the value of heldCash to be added to the player's current cash
    {
        return heldCash;
    } 
    
    public void dropStuff()
    {
        String returnString = name + " drops";
        for(int i = 0; i < drops.size(); i++)
        {
            returnString += " " + drops.get(i).getName();
            theRoom.setItemsInRoom(drops.get(i));
        }
        System.out.println(returnString);
    }
    
    public void addItem(Item i)
    {
        drops.add(i);
    }
    
    public int getExp()
    {
        return expDropped;
    }
}
