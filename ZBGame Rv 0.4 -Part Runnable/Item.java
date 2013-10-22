
 

/**
 *
 * @author Samantha
 */
public class Item    //sbw eliminated inner class Item  2013 10 17  1600
{
 
    public int worth;
    public int howFragile;
    public double probabilityInRoom;
    public Character health;
 
     public Item()  //sw: Armor extensd Items needs no-arg constructor  
     {   }
    
    public Item(int w, int h, double p, Character hh)  //sw: hh //intializes the objects
    {
        probabilityInRoom = p;
        howFragile = h;
        worth = w;
        health = hh;
    }

    public double getProb()
    {
        return probabilityInRoom;
    }     
    
    public int getFrag()
    {
        return howFragile; //determines if it breaks easily
    }
    public int getWorth()
    {
        return worth; //gets the worth of the items
    }
}
    

