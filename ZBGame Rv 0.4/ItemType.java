/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

/**
 *
 * @Viola DeShields
 */
public class ItemType 
{
    public ItemType kindOfItem; //The type the item is
    public Integer dmg; //The damage it will do
    
            
    public ItemType(ItemType kindOfItem, Integer dmg)
    {
        this.kindOfItem = kindOfItem;
        this.dmg = dmg;
    }
    
    public int getDamageDone()
    {
        if(dmg != null) 
        {
            return dmg; //if the damage is higher then inherits dmg.
        }
        
        return kindOfItem.getDamageDone(); //Is returning the type of item with its damage initially
    }
    
    
    
}
