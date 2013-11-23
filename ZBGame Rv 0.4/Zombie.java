import java.util.Random;
import java.util.ArrayList;
public class Zombie 
{
    //to start, this class is used to contain the entire sequence between
    //an NPC zombie and the player. The class will also determine the type
    //of item dropped.

    private String name;       //I feel this is unneccessary but may be useful;
    private int maxHealth;     //Maximum health to start with (wondering if single health variable is enough)
    private int currentHealth; //how much health the zombie currently has

    private Item held;         //Item the Zombie will drop for player after death
    private int heldCash;      //amount of money the player gains after battle
    private boolean alive; 
    private String description;
    private ArrayList<Attack> behavior = new ArrayList<Attack>();
    private boolean first = false;//current living condition. Preset to alive for obvious reasons

    public Zombie(String n, String d, int h) // constructor
    {
        name = n;
        maxHealth = h;
        currentHealth = maxHealth;
        description = d;
    }

    public Zombie(Zombie z) // copy constructor
    {
        name = z.name;
        maxHealth = z.maxHealth;
        description = z.description;
        held = z.held;
        heldCash = z.heldCash;
        currentHealth = maxHealth;
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

    public Item drop()                                      // upon dying, the zombie will drop the item and reutnr it to the player from this method
    {
        return held;    
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
}
