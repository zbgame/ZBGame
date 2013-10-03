public class Zombie
{   
    private String name;    // name or type.
    private int maxHealth;     // self explainitory
    private int currentHealth; // self explainitory
    private int damage;       // self explainitory
    private Item held;      // each Zombie is holding an item, this is it
    private int heldCash;   // how much cash the zombie is holding
    private boolean alive;  //current living condition. Preset to alive for obvious reasons
    
    public Zombie(String t, int h, int d, Item he, int hc)   // constructor
    {
        name = n;
        maxHealth = h;
        damage = d;
        held = he;
        heldCash = hc;
        currentHealth = maxHealth;
        alive = true;
    }
    
    public Zombie(Zombie z)                                 // copy constructor
    {
        name = name.z;
        maxHealth = maxHealth.z;
        damage = damage.z;
        held = held.z;
        heldCash = heldCash.z;
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

    public int getDamaged(int r)                            // method that will take an integer (player dealt damage) and subtracts it from the zombie health
    {
        currentHealth = currentHealth - r;
        if(health == 0)
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
