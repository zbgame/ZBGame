import java.util.Scanner;
/** @author Blacklotus3 
 * edited by John Jones
 * donkest version ever
 */
public class Main 
{

    private Parser parser;
    private Room room;
    private Player p1;
    private Scanner keyboard = new Scanner(System.in);
    private Room currentRoom;
    Inventory i1 = new Inventory(p1, currentRoom);

    private void generateStuff()
    {
        Room outside, buildingA, buildingB, buildingC, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19;

        // create the rooms
        outside = new Room("outside the university", false);
        buildingA = new Room("in the hallway of Building A", false);
        buildingB = new Room("in the hallway of Building B", false);
        buildingC = new Room("in the hallway of Building C", false);
        a10 = new Room("in room A10", true);
        a11 = new Room("in room A11", false);
        a12 = new Room("in room A12", false);
        a13 = new Room("in room A13", false);
        a14 = new Room("in room A14", false);
        a15 = new Room("in room A15", false);
        a16 = new Room("in room A16", false);
        a17 = new Room("in room A17", false);
        a18 = new Room("in room A18", false);
        a19 = new Room("in room A19", false);
        b10 = new Room("in room B10", false);
        b11 = new Room("in room B11", false);
        b12 = new Room("in room B12", false);
        b13 = new Room("in room B13", false);
        b14 = new Room("in room B14", false);
        b15 = new Room("in room B15", false);
        b16 = new Room("in room B16", false);
        b17 = new Room("in room B17", false);
        b18 = new Room("in room B18", false);
        b19 = new Room("in room B19", false);
        c10 = new Room("in room C10", false);
        c11 = new Room("in room C11", false);
        c12 = new Room("in room C12", false);
        c13 = new Room("in room C13", false);
        c14 = new Room("in room C14", false);
        c15 = new Room("in room C15", false);
        c16 = new Room("in room C16", false);
        c17 = new Room("in room C17", false);
        c18 = new Room("in room C18", false);
        c19 = new Room("in room C19", false);

        // initialise room exits
        outside.setExit("buildinga", buildingA);
        outside.setExit("buildingb", buildingB);
        outside.setExit("buildingc", buildingC);

        buildingA.setExit("outside", outside);
        buildingA.setExit("a10", a10);
        buildingA.setExit("a11", a11);
        buildingA.setExit("a12", a12);
        buildingA.setExit("a13", a13);
        buildingA.setExit("a14", a14);
        buildingA.setExit("a15", a15);
        buildingA.setExit("a16", a16);
        buildingA.setExit("a17", a17);
        buildingA.setExit("a18", a18);
        buildingA.setExit("a19", a19);

        buildingB.setExit("outside", outside);
        buildingB.setExit("b10", b10);
        buildingB.setExit("b11", b11);
        buildingB.setExit("b12", b12);
        buildingB.setExit("b13", b13);
        buildingB.setExit("b14", b14);
        buildingB.setExit("b15", b15);
        buildingB.setExit("b16", b16);
        buildingB.setExit("b17", b17);
        buildingB.setExit("b18", b18);
        buildingB.setExit("b19", b19);

        buildingC.setExit("outside", outside);
        buildingC.setExit("c10", c10);
        buildingC.setExit("c11", c11);
        buildingC.setExit("c12", c12);
        buildingC.setExit("c13", c13);
        buildingC.setExit("c14", c14);
        buildingC.setExit("c15", c15);
        buildingC.setExit("c16", c16);
        buildingC.setExit("c17", c17);
        buildingC.setExit("c18", c18);
        buildingC.setExit("c19", c19);

        a10.setExit("hallway", buildingA);
        a11.setExit("hallway", buildingA);
        a12.setExit("hallway", buildingA);
        a13.setExit("hallway", buildingA);
        a14.setExit("hallway", buildingA);
        a15.setExit("hallway", buildingA);
        a16.setExit("hallway", buildingA);
        a17.setExit("hallway", buildingA);
        a18.setExit("hallway", buildingA);
        a19.setExit("hallway", buildingA);

        b10.setExit("hallway", buildingB);
        b11.setExit("hallway", buildingB);
        b12.setExit("hallway", buildingB);
        b13.setExit("hallway", buildingB);
        b14.setExit("hallway", buildingB);
        b15.setExit("hallway", buildingB);
        b16.setExit("hallway", buildingB);
        b17.setExit("hallway", buildingB);
        b18.setExit("hallway", buildingB);
        b19.setExit("hallway", buildingB);

        c10.setExit("hallway", buildingC);
        c11.setExit("hallway", buildingC);
        c12.setExit("hallway", buildingC);
        c13.setExit("hallway", buildingC);
        c14.setExit("hallway", buildingC);
        c15.setExit("hallway", buildingC);
        c16.setExit("hallway", buildingC);
        c17.setExit("hallway", buildingC);
        c18.setExit("hallway", buildingC);
        c19.setExit("hallway", buildingC);

        currentRoom = outside;  // start game outside
        i1.setRoom(currentRoom);
        
        Key a10key = new Key(a10, "a10");
        a10key.setName("a10key");
        a10key.setQuantity(1);
        
        //add items to inventory
        i1.setItem(a10key);
        
        DummyItem ietm = new DummyItem();
        ietm.setName("TheStuff");
        outside.setItemsInRoom(ietm);

        // initialise new player
        //Player P1 = new Player(5);
    }

    public Main()
    {

        generateStuff();
        parser = new Parser();  
    }

    public void play() 
    {
        p1 = new Player(3, i1); //FIX
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) 
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
            //Somewhere in this loop the program will check if a zombie is in the room and call the zombie behavior method
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    private void printWelcome()
    {
        System.out.println();
        System.out.println("What is your name?");
        System.out.print("> ");
        p1.setName(keyboard.nextLine());
        System.out.println("Welcome to the Zombie Academy, " + p1.getName() + ".");
        System.out.println("Enter \"Help\" if you need assistance.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) 
        {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) 
        {
            printHelp();
        }
        else if (commandWord.equals("go")) 
        {
            goRoom(command);
        }
        else if (commandWord.equals("use"))
        {
            use(command);
        }
        else if (commandWord.equals("quit")) 
        {
            wantToQuit = quit(command);
        }
        else if (commandWord.equals("look"))
        {
            look(command);
        }
        // else command not recognised.
        return wantToQuit;
    }

    private void printHelp() 
    {
        System.out.println("Your objective is to survive the");
        System.out.println("zombie invasion.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) 
        {
            System.out.println("There is no door!");
        }
        else if(nextRoom.getIsLocked() == true)
        {
            System.out.println("The door is locked.");
        }
        else if(nextRoom.getIsLocked() == false)
        {
            currentRoom = nextRoom;
            i1.setRoom(currentRoom);
            System.out.println(currentRoom.getLongDescription());
        }
    }

    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) 
        {
            System.out.println("Quit what?");
            return false;
        }
        else 
        {
            return true;  // signal that we want to quit
        }
    }

    private void use(Command command)
    {
        String item = command.getSecondWord();
        Item useThis = i1.getItem(item);
        
        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we don't know what to use...
            System.out.println("Use what?");
            return;
        }
        
        if(useThis == null)
        {
            System.out.println("You don't have that!");
        }
        else
        {
            i1.use(i1.getItem(item));
        }
    }

    private void look(Command command)
    {
        String secondWord = command.getSecondWord();
        if(!command.hasSecondWord()) 
        {
            // if there is no second word, we look in the current room
            System.out.println(currentRoom.getLongDescription());
        }
        
        else if(secondWord.equals("self"))
        {
            System.out.println(p1.getDescription());
        }

    }
}

