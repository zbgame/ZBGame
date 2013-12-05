public class Weapon extends Item
/**
 * @author Viola
 * @version many work
 */
{
    private int attackModifier;//increase the players attack by this much when the attack function is called
    private boolean doesAttackStack = true;//can be used to over ride players attack stat and only use weapons attack, guns do not use any of your own physical strength
    private boolean isEquiped = false;//will be called when using the equip function and when checking attacks to make sure it increases player damage (Not necessary, left in for testing, remove at a later date)
    private boolean usesAmmo = false;//determines if a weapon needs ammo to use, gun vs knife(getting removed)
    private int ammo = 0;//counts ammo down when used(getting removed)
    private String attackDescriptor;//describes the type of attack this weapon will perform

    public Weapon(String n, String e, int q, int a, boolean s,  String d)
    {
        super.setName(n);
        super.setDescription(e);
        super.setQuantity(q);
        attackModifier = a;
        doesAttackStack = s;
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

    public void use(Player p, Zombie e)
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
            checkThingsOut(p, e);
        }
        else if(e != null && !doesAttackStack)
        {
            System.out.println("You " + attackDescriptor);
            e.setHealth(e.getHealth() - attackModifier);
            System.out.println("He looks like he has about " + e.getHealth() + " left");
            checkThingsOut(p, e);
        }
    }
    
    private void checkThingsOut(Player p, Zombie e)
    {
        if(e.getHealth() <= 0)
            {
                p.setExp(p.getExp()+e.getExp());
                while(p.getExp() >= p.getExpNeeded())
                {
                    p.levelUp();
                }
                p.setCash(p.getCash()+e.dropCash());
                System.out.println("You found $" + e.dropCash() + " worth on the zombie.");
                e.dropStuff();
            }
    }
}
