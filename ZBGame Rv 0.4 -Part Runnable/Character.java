/** @author Blacklotus3
 * edited on 10/21/2013 by Brandon Pugh
 * edited by Steven Moore from 10/21/2013 - current
 */
public class Character 
{
    private String name;
 
    private int health=3;
    private boolean alive; //not used at all
    Inventory i1;
    KeyRing k1;
    
    public Character(String cname, int hp, Inventory i, KeyRing k)
    {
        cname = name;
        hp = health;
        i = i1;
        k = k1;
    }
    
    
    
    
    //Setters
    public void setName(String callme) 
    {
       System.out.println("What is your character's name?");
       callme = keyboard.nextString();
       
    }
    
   public void setHitpoints(int hp) 
   {
       hp = hits;
       //
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
        return hp; 
   }
    
}

