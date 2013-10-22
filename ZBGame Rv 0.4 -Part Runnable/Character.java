/** @author Blacklotus3
 * edited on 10/21/2013 by Brandon Pugh
 */
public class Character 
{
    private String name;
 
    private int HP=3;
    private boolean alive; //not used at all
    
    

    //Setters
    public void setName(String callme) 
    {
       name = callme;
       
    }
    
   public void setHitpoints(int hits) 
   {
       HP = hits;
   }
   
    //Getters
   public String getName() 
   {
       return name;
   }
    
   public int getHitpoints() 
   {
        return HP; 
   }
    
   public String getsDead()
   { 
     if (HP > 0)
     {
         return "Good news, you are still alive.";
     }
     else
     {
         return "Sorry You died and now eat brains";
     }
   } 
}

