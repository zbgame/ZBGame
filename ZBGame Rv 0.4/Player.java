/** @author Blacklotus3
 * edited on 10/21/2013 by Brandon Pugh
 * edited by Steven Moore from 10/21/2013 - current
 */
public class Player 
{
    private String name;
    private int attackPower = 1;
    private int maxHealth = 3;
    private int health = 3;
    private boolean alive; //not used at all
    Inventory i1;

    public Player(int hp)
    {
        hp = health;
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

    public void retrieveItem(Inventory i)
    {
        //iunno if needed or not
    }

    public void useItem(Inventory i)
    {
        //not sure if needed or not either
    }
    
    public void setAttackPower(int a)
    {
        attackPower = a;
    }
    
    public void setInventory(Inventory i)
    {
        i1 = i;
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

    public String getDescription()
    {
        String returnString = "You are ";
        returnString += name+".\n"+"You have "+health+" health remaining.\n";
        returnString += i1.getItemString();
        return returnString;
    }
    
    public void hello()
    {
        System.out.println("Are you there?");
    }
}

