
/**
 * Write a description of class DummyItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DummyItem extends Item
{
    /*
     * this item will be used as a stand in for items in room if putting whole items takes up to much space in memory,
     * it will have a custom pickUp() function to add quantity to an item in inventory with the same name
     * not necissarily going to be used, just putting it in for testing
     */
    public DummyItem()
    {
        
    }

    
    @Override
    public void pickUp()
    {
        
    }
    /*
    public void pickUp(Inventory b, String t)
    {
        if(b.getItem(t).equals(b.getRoom().getItemsInRoom(t.getName())))
        {
            b.getItem(t).setQuantity()
        }
    }
    */
}
