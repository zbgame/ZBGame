public class Weapon extends Item
{
    private int attackModifier;//increase the players attack by this much when the attack function is called
    private boolean doesAttackStack = true;//can be used to over ride players attack stat and only use weapons attack, guns do not use any of your own physical strength
    private boolean isEquiped = false;//will be called when using the equip function and when checking attacks to make sure it increases player damage (Not necessary, left in for testing, remove at a later date)
    private boolean usesAmmo = false;//determines if a weapon needs ammo to use, gun vs knife
    private int ammo = 0;//counts ammo down when used
    private String attackDescriptor;//describes the type of attack this weapon will perform

    public Weapon(int a, boolean s, boolean u, String d)
    {
        attackModifier = a;
        doesAttackStack = s;
        usesAmmo = u;
        attackDescriptor = d;
    }

    public int getAttackModifier()
    {
        return attackModifier;
    }

    public void setAttackModifier(int m)
    {
        attackModifier = m;
    }

    public void setDoesAttackStack(boolean d)
    {
        doesAttackStack = d;
    }

    public void setUsesAmmo(boolean u)
    {
        usesAmmo = u;
    }

    public int getAmmo()
    {
        return ammo;
    }

    public void setAmmo(int a)
    {
        ammo = a;
    }

    public String getAttackDescriptor()
    {
        return attackDescriptor;
    }

    public void setAttackDescriptor(String d)
    {
        attackDescriptor = d;
    }

    public void use(Player p, Enemy e, Room r)
    {
        if(e.getHealth() <= 0)
        {
            System.out.println("There is nothing to attack here");
        }
        else if(e != null && doesAttackStack)
        {
            System.out.println("You " + attackDescriptor);
            e.setHealth(e.getHealth() - (p.getAttackPower() + attackModifier));
            System.out.println("He looks like he has about " + e.getHealth() + " left");
        }
        else if(e != null && !doesAttackStack)
        {
            System.out.println("You " + attackDescriptor);
            e.setHealth(e.getHealth() - attackModifier);
            System.out.println("He looks like he has about " + e.getHealth() + " left");
        }
        /**if(e.getHealth() <= 0)
        {
            System.out.println("You have defeated " + e.getName());
            r.setEnemy(null);//Zaq: Null pointer error occures after this has been set and you try attacking again. ??? It's 5:30 am, I'm going to sleep. ZzZzZzZzZz~
        }*/
    }
}
