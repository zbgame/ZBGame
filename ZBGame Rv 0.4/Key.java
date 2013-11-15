public class Key extends Item 
{
    private Room unlocks;

    public Key(Room i)
    {
        unlocks = i;
    }

    public void setRoom(Room i)
    {
        unlocks = i;
    }

    public Room getRoom()
    {
        return unlocks;
    }

    public void use(Room r)
    {
        if(r.returnExits().containsValue(unlocks))
        {
            unlocks.setIsLocked(!unlocks.getIsLocked());
            System.out.println("you used the "+ getName());
        }
        else
            System.out.println("You can not use that here.");
    }
}
