/** @author Blacklotus3
 * edited on 10/21/2013 by Brandon Pugh
 * edited by Steven Moore from 10/21/2013 - current
 */
public class Player 
{
    private String name;
    private int maxHealth = 3;
    private int health = 3;
    private boolean alive; //not used at all
    Inventory i1;

    public Player(int hp, Inventory i)
    {
        hp = health;
        i1 = i;
    }

    //Setters
    public void setName(String c) 
    {
        name = c;
    }

    public void setHitpoints(int hp) 
    {
        hp = health;
    }

    public void retrieveItem(Inventory i)
    {
        //iunno if needed or not
    }

    public void useItem(Inventory i)
    {
        //not sure if needed or not either
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

    public String getDescription()
    {
        String returnString = "You are ";
        returnString += name+".\n"+"You have "+health+" health remaining.\n";
        returnString += i1.getItemString();
        return returnString;
    }
}

