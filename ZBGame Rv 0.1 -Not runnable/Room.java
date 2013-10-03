//Viola DeShields Rooms class
public class Room
{

    private Item items; //item class
    private Zombie zombie; //zombie class
    private String descriptionOfRoom; //may become an array later on
    private Characters characters; //Character class
    private boolean whatInRoom;
    private boolean thisRoomIs;
    private boolean didDoorLock;
    public Room(String d, Character c, Zombie z, Item i)
    {
        //The objects will be initialized here..
        zombie = z;
        characters = c;
        items = i;
        didDoorLock = true;
        whatInRoom = true;
        thisRoomIs = true;
    }

    public boolean getRoomLocation()
    {
        //Will determine location of room.

        return thisRoomIs;
    }

   public boolean withinRoom()
   {
       //Will determine what is within the room
       Return whatInRoom;
    }
    public boolean doorLock()
    {
        //Will determine if within this room is the door locked behind the player

        return didDoorLock;
    }
}
