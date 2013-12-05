/** @author Steven Moore
 * edited by Steven Moore from 10/21/2013 - current
 */
public class Player 
{
    private String name;
    private int attackPower = 1;
    private int maxHealth = 1;
    private int health = 1;
    private int defense = 1;
    private int wallet;
    private int expNeeded = 10;
    private int exp = 0;
    Inventory i1;

    public Player(int h)
    {
        maxHealth = h;
        health = maxHealth;
    }

    //Setters
    public void setName(String c) 
    {
        name = c;
    }

    public void setHitpoints(int hp) 
    {
        health = hp;
    }

    public void setAttackPower(int a)
    {
        attackPower = a;
    }

    public void setInventory(Inventory i)
    {
        i1 = i;
    }

    public void setCash(int w)
    {
        w = wallet;
    }
    
    public void setDefense(int d)
    {
        defense = d;
    }
    
    public void levelUp()
    {
        attackPower += 1;
        maxHealth += 1;
        health += 1;
        defense += 1;
        exp -= expNeeded;
        expNeeded += 10;
        System.out.println(name + " feels new strength rushing through their veins!");
    }
    
    public void setExp(int x)
    {
        exp = x;
    }
    
    //Getters

    public String getName() 
    {
        return name;
    }

    public int getHitpoints() 
    {
        return health; 
    }

    public int getAttackPower()
    {
        return attackPower;
    }
    
    public int getCash()
    {
        return wallet;
    }

    public String getDescription()
    {
        String returnString = "You are ";
        returnString += name+".\n"+"You have "+health+" health remaining.\n";
        returnString += i1.getItemString();
        returnString += ".\n" + "You have " + exp + " out of " + expNeeded + " experience.";
        return returnString;
    }

    public int getMaxHitpoints() 
    {
        return maxHealth; 
    }

    public int getDefense()
    {
        return defense;
    }
    
    public int getExp()
    {
        return exp;
    }
    
    public int getExpNeeded()
    {
        return expNeeded;
    }
}

