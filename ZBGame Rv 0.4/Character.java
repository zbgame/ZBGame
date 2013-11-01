/** @author Blacklotus3
 * edited on 10/21/2013 by Brandon Pugh
 * edited by Steven Moore from 10/21/2013 - current
 */
import java.util.Scanner;
public class Character 
{
    private String name;
    private Scanner keyboard = new Scanner(System.in);
    private int health = 3;
    private boolean alive; //not used at all
    Inventory i1;
    KeyRing k1;
    
    public Character(int hp, Inventory i, KeyRing k)
    {
        hp = health;
        i = i1;
        k = k1;
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
    
}

