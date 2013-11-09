
/**
 *
 * @author Blacklotus3 edited by Brandon Pugh
 */
public class Zombie 
{
    //to start, this class is used to contain the entire sequence between
    //an NPC zombie and the player. The class will also determine the type
    //of item dropped.

    private String name;       //I feel this is unneccessary but may be useful;
    private int maxHealth;     //Maximum health to start with (wondering if single health variable is enough)
    private int currentHealth; //how much health the zombie currently has
    private int damage;        //means the damage that the Zombie is actually doing
    private Item held;         //Item the Zombie will drop for player after death
    private int heldCash;      //amount of money the player gains after battle
    private boolean alive;     //current living condition. Preset to alive for obvious reasons

    public void fight(Class character)
    {
        while (alive == true)
        {

        }
    }

    public Zombie(String n, int h, int d, Item he, int hc) // constructor
    {
        name = n;
        maxHealth = h;
        damage = d;
        held = he;
        heldCash = hc;
        currentHealth = maxHealth;
        alive = true;
    }

    public Zombie(Zombie z) // copy constructor
    {
        name = z.name;
        maxHealth = z.maxHealth;
        damage = z.damage;
        held = z.held;
        heldCash = z.heldCash;
        currentHealth = maxHealth;
        alive = true;               // despite the condition of the copied Zombie, the new Zombie will be set to alive, so that we can even copy dead Zombies for further use
    }

    public String name()                                    // just returns the zombie name for player
    {
        return name;
    }

    public Item drop()                                      // upon dying, the zombie will drop the item and reutnr it to the player from this method
    {
        return held;    
    }

    public void getDamaged(int r)                            // method that will take an integer (player dealt damage) and subtracts it from the zombie health
    {
        currentHealth = currentHealth - r;
        if(currentHealth <= 0)
        {
            alive = false;
        }
    }

    public int attack()                                     // takes zombie damage (attack) and returns it to be dealt to the player
    {
        return damage;
    }

    public int dropCash()                                   //returns the value of heldCash to be added to the player's current cash
    {
        return heldCash;
    } 
}
