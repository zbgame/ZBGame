/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

/**
 *
 * @author Samantha
 */
class Items {
public class Item 
{

    public int worth;
    public int howFragile;
    public double probabilityInRoom;
    public Characters health;
 
    public Item(int w, int h, double p, Characters h)  //intializes the objects
    {
        probabilityInRoom = p;
        howFragile = h;
        worth = w;
        health = h;
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
    
}
